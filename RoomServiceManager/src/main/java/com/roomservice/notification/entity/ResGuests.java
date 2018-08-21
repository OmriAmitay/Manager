package com.roomservice.notification.entity;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class ResGuests {

	@JacksonXmlProperty(localName="ResGuest")
	private ResGuest resGuest;

	public ResGuest getResGuest() {
		return resGuest;
	}

	public void setResGuest(ResGuest resGuest) {
		this.resGuest = resGuest;
	}

	@Override
	public String toString() {
		return "ResGuests [resGuest=" + resGuest + "]";
	}
	
}
