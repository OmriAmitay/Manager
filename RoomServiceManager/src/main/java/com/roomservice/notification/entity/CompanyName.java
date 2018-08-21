package com.roomservice.notification.entity;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;

public class CompanyName {

	@JacksonXmlProperty(isAttribute = true)
	private String Code;
	@JacksonXmlText
	private String value;

	public String getCode() {
		return Code;
	}

	public void setCode(String code) {
		Code = code;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "CompanyName [Code=" + Code + ", value=" + value + "]";
	}
	
}
