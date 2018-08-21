package com.roomservice.notification.entity;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class BookingChannel {

	@JacksonXmlProperty(isAttribute = true)
	private String Primary;
	@JacksonXmlProperty(isAttribute = true)
	private String Type;
	
	@JacksonXmlProperty(localName="CompanyName")
	private CompanyName companyName;

	public String getPrimary() {
		return Primary;
	}

	public void setPrimary(String primary) {
		Primary = primary;
	}

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}

	public CompanyName getCompanyName() {
		return companyName;
	}

	public void setCompanyName(CompanyName companyName) {
		this.companyName = companyName;
	}

	@Override
	public String toString() {
		return "BookingChannel [Primary=" + Primary + ", Type=" + Type + ", companyName=" + companyName + "]";
	} 
	
}