package com.roomservice.notification.entity;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class RoomType {

	@JacksonXmlProperty(isAttribute = true)
	private String RoomTypeCode;
	@JacksonXmlProperty(localName="RoomDescription")
	private RoomDescription roomDescription;
	
	public String getRoomTypeCode() {
		return RoomTypeCode;
	}
	
	public void setRoomTypeCode(String roomTypeCode) {
		RoomTypeCode = roomTypeCode;
	}
	
	public RoomDescription getRoomDescription() {
		return roomDescription;
	}
	
	public void setRoomDescription(RoomDescription roomDescription) {
		this.roomDescription = roomDescription;
	}

	@Override
	public String toString() {
		return "RoomType [RoomTypeCode=" + RoomTypeCode + ", roomDescription=" + roomDescription + "]";
	}
	
}