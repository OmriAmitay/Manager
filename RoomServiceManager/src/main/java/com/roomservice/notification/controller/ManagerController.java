package com.roomservice.notification.controller;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Collections;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.MimeHeaders;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPMessage;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.roomservice.notification.dao.MongoDao;
import com.roomservice.notification.entity.OpportunityData;
import com.roomservice.notification.entity.OpportunitySubject;
import com.roomservice.notification.entity.ReservationNotification;

@ComponentScan
@EnableAutoConfiguration
@RestController
@RequestMapping("/manager")
public class ManagerController {
	
	public static final String UNIX_PATH = "/home/ec2-user/notifications/";
	public static final String WIN_PATH = "c:\\RoomService\\notifications\\";

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/health")
    public Notify health(@RequestParam(value="name", defaultValue="World") String name) {
        return new Notify(counter.incrementAndGet(), String.format(template, name));
    }
    
    @RequestMapping(value = "opportunity", method = RequestMethod.POST)
    public void opportunity(@Valid @RequestBody OpportunitySubject opportunitySubject, HttpServletResponse response) {
    	
    	boolean isValid = MongoDao.getInstance().importOpportunity(Collections.singletonList(opportunitySubject));
    	if(! isValid) {
    		// invalid request message
    		response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
    	}
    	
    }
    
    @GetMapping("/fire")
    public String greetingForm(Model model) {
        model.addAttribute("opportunityForm", new OpportunityData());
        return "opportunityForm";
    }

    @PostMapping("/greeting")
    public String greetingSubmit(@ModelAttribute OpportunityData opportunityData) {
        return "result";
    }
    
    public static void main(String[] args) {
    	//System.setProperty("server.port", "8090");
        SpringApplication.run(ManagerController.class, args);
    }
    
    public static String saveToXml(ReservationNotification reservation) {
        String xmlString = "";
        try {
        	
        	String OS = System.getProperty("os.name").toLowerCase();
			String pathByOS = null;
			if(OS.indexOf("win") >= 0) {
				pathByOS = WIN_PATH;
			} else {
				pathByOS = UNIX_PATH;
			}
        	File file = new File(pathByOS + "notification_"+UUID.randomUUID().toString()+".xml");
            JAXBContext context = JAXBContext.newInstance(ReservationNotification.class);
            Marshaller m = context.createMarshaller();
            
            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE); // To format XML

            m.marshal(reservation, file);
    		m.marshal(reservation, System.out);

        } catch (JAXBException e) {
            e.printStackTrace();
        }

        return xmlString;
    }
    
    public static ReservationNotification parseRequest(String request) {
    	
    	ReservationNotification notification = null;
    	try {
    		
    		InputStream is = new ByteArrayInputStream(request.getBytes());
    		MessageFactory mf = MessageFactory.newInstance();
    		MimeHeaders header = new MimeHeaders();     
            header.addHeader("Content-Type", "text/xml");
    		SOAPMessage message = mf.createMessage(header,is);
    		SOAPBody soapBody = message.getSOAPBody();
    		Node body = soapBody.getElementsByTagName("OTA_HotelResNotifRQ").item(0);
    		
    		DOMSource source = new DOMSource(body);
    		StringWriter stringResult = new StringWriter();
    		TransformerFactory.newInstance().newTransformer().transform(source, new StreamResult(stringResult));
    		String message2 = stringResult.toString();
    		XmlMapper xmlMapper = new XmlMapper();
			xmlMapper.enable(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT);
    		
			notification = xmlMapper.readValue(message2, ReservationNotification.class);
    		 
        } catch (Exception e) {
            e.printStackTrace();
        }
    	
    	return notification;
        
    }
    
    public static String inputStreamToString(InputStream is) throws IOException {
		StringBuilder sb = new StringBuilder();
		String line;
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		while ((line = br.readLine()) != null) {
			sb.append(line);
		}
		br.close();
		return sb.toString();
	}
    
    public static final void prettyPrint(Document xml) throws Exception {
    	Transformer tf = TransformerFactory.newInstance().newTransformer();
    	tf.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
    	tf.setOutputProperty(OutputKeys.INDENT, "yes");
    	Writer out = new StringWriter();
    	tf.transform(new DOMSource(xml), new StreamResult(out));
    	System.out.println(out.toString());
    }
    
}