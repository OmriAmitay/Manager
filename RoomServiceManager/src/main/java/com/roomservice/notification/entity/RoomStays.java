package com.roomservice.notification.entity;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class RoomStays {

	@JacksonXmlProperty(localName="RoomStay")
	private RoomStay roomStay;

	public RoomStay getRoomStay() {
		return roomStay;
	}

	public void setRoomStay(RoomStay roomStay) {
		this.roomStay = roomStay;
	}

	@Override
	public String toString() {
		return "RoomStays [roomStay=" + roomStay + "]";
	}
	
}
