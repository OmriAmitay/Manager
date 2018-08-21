package com.roomservice.notification.entity;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class ResGuestRPH {

	@JacksonXmlProperty(isAttribute = true)
	private String RPH;

	public String getRPH() {
		return RPH;
	}

	public void setRPH(String rPH) {
		RPH = rPH;
	}

	@Override
	public String toString() {
		return "ResGuestRPHs [RPH=" + RPH + "]";
	}
	
}
