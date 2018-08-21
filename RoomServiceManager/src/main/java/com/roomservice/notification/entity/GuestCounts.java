package com.roomservice.notification.entity;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class GuestCounts {

	@JacksonXmlProperty(isAttribute = true)
	private String IsPerRoom;
	@JacksonXmlElementWrapper(useWrapping=false)
	@JacksonXmlProperty(localName="GuestCount")
	private List<GuestCount> guestCount = new ArrayList<GuestCount>();
	
	public String getIsPerRoom() {
		return IsPerRoom;
	}

	public void setIsPerRoom(String isPerRoom) {
		IsPerRoom = isPerRoom;
	}

	public List<GuestCount> getGuestCount() {
		return guestCount;
	}
	
	public void setGuestCount(List<GuestCount> guestCount) {
		this.guestCount = guestCount;
	}

	@Override
	public String toString() {
		return "GuestCounts [IsPerRoom=" + IsPerRoom + ", guestCount=" + guestCount + "]";
	}

}
