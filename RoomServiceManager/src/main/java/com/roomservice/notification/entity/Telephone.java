package com.roomservice.notification.entity;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Telephone {

	@JacksonXmlProperty(isAttribute = true)
	private String PhoneNumber;

	public String getPhoneNumber() {
		return PhoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "Telephone [PhoneNumber=" + PhoneNumber + "]";
	}
	
}
