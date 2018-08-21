package com.roomservice.notification.entity;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class RoomRate {

	@JacksonXmlProperty(isAttribute = true)
	private String RoomTypeCode;
	@JacksonXmlProperty(isAttribute = true)
	private String RatePlanCode;
	@JacksonXmlProperty(isAttribute = true)
	private String NumberOfUnits;
	
	@JacksonXmlProperty(localName="Rates")
	private Rates rates;
	
	
	
	public String getRoomTypeCode() {
		return RoomTypeCode;
	}
	
	public void setRoomTypeCode(String roomTypeCode) {
		RoomTypeCode = roomTypeCode;
	}
	
	public String getRatePlanCode() {
		return RatePlanCode;
	}
	
	public void setRatePlanCode(String ratePlanCode) {
		RatePlanCode = ratePlanCode;
	}
	
	public String getNumberOfUnits() {
		return NumberOfUnits;
	}
	
	public void setNumberOfUnits(String numberOfUnits) {
		NumberOfUnits = numberOfUnits;
	}
	
	
	
}
