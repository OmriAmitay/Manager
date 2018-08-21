package com.roomservice.notification.entity;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class ResGuestRPHs {

	@JacksonXmlProperty(localName="ResGuestRPH")
	private ResGuestRPH resGuestRPH;

	public ResGuestRPH getResGuestRPH() {
		return resGuestRPH;
	}

	public void setResGuestRPH(ResGuestRPH resGuestRPH) {
		this.resGuestRPH = resGuestRPH;
	}

	@Override
	public String toString() {
		return "ResGuestRPHs [resGuestRPH=" + resGuestRPH + "]";
	}
	
}
