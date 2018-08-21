package com.roomservice.notification.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class HotelReservation {

	@JacksonXmlProperty(isAttribute = true)
	private String LastModifyDateTime;
	
	@JacksonXmlProperty(localName="UniqueID")
	private UniqueID uniqueID;
	@JacksonXmlProperty(localName="RoomStays")
	private RoomStays roomStays;
	@JacksonXmlProperty(localName="ResGuests")
	private ResGuests ResGuests;
	@JacksonXmlProperty(localName="ResGlobalInfo")
	private ResGlobalInfo resGlobalInfo;

	public String getLastModifyDateTime() {
		return LastModifyDateTime;
	}

	public void setLastModifyDateTime(String lastModifyDateTime) {
		LastModifyDateTime = lastModifyDateTime;
	}

	public UniqueID getUniqueID() {
		return uniqueID;
	}

	public void setUniqueID(UniqueID uniqueID) {
		this.uniqueID = uniqueID;
	}
	
	public ResGlobalInfo getResGlobalInfo() {
		return resGlobalInfo;
	}

	public void setResGlobalInfo(ResGlobalInfo resGlobalInfo) {
		this.resGlobalInfo = resGlobalInfo;
	}

	public ResGuests getResGuests() {
		return ResGuests;
	}

	public void setResGuests(ResGuests resGuests) {
		ResGuests = resGuests;
	}
	
	public RoomStays getRoomStays() {
		return roomStays;
	}

	public void setRoomStays(RoomStays roomStays) {
		this.roomStays = roomStays;
	}

	@Override
	public String toString() {
		return "HotelReservation [LastModifyDateTime=" + LastModifyDateTime + ", uniqueID=" + uniqueID
				+ ", resGlobalInfo=" + resGlobalInfo + ", ResGuests=" + ResGuests + ", roomStays=" + roomStays + "]";
	}

}
