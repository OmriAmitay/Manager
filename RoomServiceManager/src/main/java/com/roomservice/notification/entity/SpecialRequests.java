package com.roomservice.notification.entity;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class SpecialRequests {

	@JacksonXmlElementWrapper(useWrapping=false)
	@JacksonXmlProperty(localName="SpecialRequest")
	private List<SpecialRequest> specialRequest = new ArrayList<SpecialRequest>();

	public List<SpecialRequest> getSpecialRequest() {
		return specialRequest;
	}

	public void setSpecialRequest(List<SpecialRequest> specialRequest) {
		this.specialRequest = specialRequest;
	}

	@Override
	public String toString() {
		return "SpecialRequests [specialRequest=" + specialRequest + "]";
	}

}
