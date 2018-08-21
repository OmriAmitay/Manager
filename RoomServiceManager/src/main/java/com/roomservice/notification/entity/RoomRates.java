package com.roomservice.notification.entity;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class RoomRates {

	@JacksonXmlProperty(localName="RoomRate")
	private RoomRate RoomRate;

	public RoomRate getRoomRate() {
		return RoomRate;
	}

	public void setRoomRate(RoomRate roomRate) {
		RoomRate = roomRate;
	}

	@Override
	public String toString() {
		return "RoomRates [RoomRate=" + RoomRate + "]";
	}
	
}
