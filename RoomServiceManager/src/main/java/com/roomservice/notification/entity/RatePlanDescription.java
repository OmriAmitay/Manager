package com.roomservice.notification.entity;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;

public class RatePlanDescription {

	@JacksonXmlText
	private String value;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "RatePlanDescription [value=" + value + "]";
	}
	
}
