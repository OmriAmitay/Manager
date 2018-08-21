package com.roomservice.notification.entity;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Taxes {
	
	@JacksonXmlProperty(localName="Tax")
	private Tax tax;
}
