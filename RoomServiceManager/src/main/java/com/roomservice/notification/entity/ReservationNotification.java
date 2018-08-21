package com.roomservice.notification.entity;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@XmlRootElement(name = "OTA_HotelResNotifRQ")
public class ReservationNotification implements Serializable {

	private static final long serialVersionUID = -2171565058447742580L;
	
	@JacksonXmlProperty(isAttribute = true)
	private String xmlns;
	@JacksonXmlProperty(isAttribute = true)
	private String Version;
	@JacksonXmlProperty(isAttribute = true)
	private String EchoToken;
	@JacksonXmlProperty(isAttribute = true)
	private String ResStatus;
	@JacksonXmlProperty(isAttribute = true)
	private String TimeStamp;
	
	@JacksonXmlProperty(localName="POS")
	private POS pos;
	@JacksonXmlProperty(localName="HotelReservations")
	private HotelReservations hotelReservations;

	public String getXmlns() {
		return xmlns;
	}

	public void setXmlns(String xmlns) {
		this.xmlns = xmlns;
	}

	public String getVersion() {
		return Version;
	}

	public void setVersion(String version) {
		Version = version;
	}

	public String getEchoToken() {
		return EchoToken;
	}

	public void setEchoToken(String echoToken) {
		EchoToken = echoToken;
	}

	public String getResStatus() {
		return ResStatus;
	}

	public void setResStatus(String resStatus) {
		ResStatus = resStatus;
	}
	
	public String getTimeStamp() {
		return TimeStamp;
	}

	public void setTimeStamp(String timeStamp) {
		TimeStamp = timeStamp;
	}

	public POS getPos() {
		return pos;
	}

	public void setPos(POS pos) {
		this.pos = pos;
	}

	public HotelReservations getHotelReservations() {
		return hotelReservations;
	}

	public void setHotelReservations(HotelReservations hotelReservations) {
		this.hotelReservations = hotelReservations;
	}

	@Override
	public String toString() {
		return "ReservationNotification [xmlns=" + xmlns + ", Version=" + Version + ", EchoToken=" + EchoToken
				+ ", ResStatus=" + ResStatus + ", TimeStamp=" + TimeStamp + ", pos=" + pos + ", hotelReservations="
				+ hotelReservations + "]";
	}
	
	public static void main(String[] args) {
		try {

			/**
			 * Test Room Response XML
			 */

			File file = new File("C:\\sources\\RoomService\\temp\\notification.xml");
			XmlMapper xmlMapper = new XmlMapper();
			String xml = inputStreamToString(new FileInputStream(file));
			ReservationNotification value = xmlMapper.readValue(xml, ReservationNotification.class);
			System.out.println(value);

		} catch (Exception ex) {
			ex.printStackTrace();
		}
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

}
