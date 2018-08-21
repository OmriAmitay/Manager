package com.roomservice.notification.entity;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class BasicPropertyInfo {

	@JacksonXmlProperty(isAttribute = true)
	private String HotelCode;
	@JacksonXmlProperty(isAttribute = true)
	private String HotelName;

	public String getHotelCode() {
		return HotelCode;
	}
	
	public void setHotelCode(String hotelCode) {
		HotelCode = hotelCode;
	}
	
	public String getHotelName() {
		return HotelName;
	}
	
	public void setHotelName(String hotelName) {
		HotelName = hotelName;
	}

	@Override
	public String toString() {
		return "BasicPropertyInfo [HotelCode=" + HotelCode + ", HotelName=" + HotelName + "]";
	}
	
}
