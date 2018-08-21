package com.roomservice.notification.entity;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class GuestCount {

	@JacksonXmlProperty(isAttribute = true)
	private String AgeQualifyingCode;
	@JacksonXmlProperty(isAttribute = true)
	private String Count;
	
	public String getAgeQualifyingCode() {
		return AgeQualifyingCode;
	}
	
	public void setAgeQualifyingCode(String ageQualifyingCode) {
		AgeQualifyingCode = ageQualifyingCode;
	}
	
	public String getCount() {
		return Count;
	}
	
	public void setCount(String count) {
		Count = count;
	}
	@Override
	public String toString() {
		return "GuestCount [AgeQualifyingCode=" + AgeQualifyingCode + ", Count=" + Count + "]";
	}
	
}
