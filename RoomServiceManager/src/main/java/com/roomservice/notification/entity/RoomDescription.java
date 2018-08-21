package com.roomservice.notification.entity;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;

public class RoomDescription {

	@JacksonXmlProperty(isAttribute = true)
	private String Name;
	@JacksonXmlText
	private String value;
	
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "RoomDescription [Name=" + Name + ", value=" + value + "]";
	}

}
