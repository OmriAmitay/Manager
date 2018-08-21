package com.roomservice.notification.entity;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class RequestorID {

	@JacksonXmlProperty(isAttribute = true)
	private String Type;
	@JacksonXmlProperty(isAttribute = true)
	private String ID;
	
	public String getType() {
		return Type;
	}
	
	public void setType(String type) {
		Type = type;
	}
	
	public String getID() {
		return ID;
	}
	
	public void setID(String iD) {
		ID = iD;
	}

	@Override
	public String toString() {
		return "RequestorID [Type=" + Type + ", ID=" + ID + "]";
	}
	
}
