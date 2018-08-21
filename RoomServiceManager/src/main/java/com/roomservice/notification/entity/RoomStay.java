package com.roomservice.notification.entity;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class RoomStay {
	
	@JacksonXmlProperty(isAttribute = true)
	private String PromotionCode;
	@JacksonXmlProperty(localName="RoomTypes")
	private RoomTypes roomTypes;
	@JacksonXmlProperty(localName="RatePlans")
	private RatePlans ratePlans;
	@JacksonXmlProperty(localName="TimeSpan")
	private TimeSpan timeSpan;
	@JacksonXmlProperty(localName="Total")
	private Total total;
	@JacksonXmlProperty(localName="BasicPropertyInfo")
	private BasicPropertyInfo basicPropertyInfo;
	@JacksonXmlProperty(localName="ResGuestRPHs")
	private ResGuestRPHs resGuestRPHs;
	@JacksonXmlProperty(localName="Comments")
	private Comments comments;
	@JacksonXmlProperty(localName="SpecialRequests")
	private SpecialRequests SpecialRequests;
	@JacksonXmlProperty(localName="GuestCounts")
	private GuestCounts guestCounts;
	@JacksonXmlProperty(localName="RoomRates")
	private RoomRates roomRates;
	
	public String getPromotionCode() {
		return PromotionCode;
	}

	public void setPromotionCode(String promotionCode) {
		PromotionCode = promotionCode;
	}
	
	public RoomTypes getRoomTypes() {
		return roomTypes;
	}

	public void setRoomTypes(RoomTypes roomTypes) {
		this.roomTypes = roomTypes;
	}
	
	public RatePlans getRatePlans() {
		return ratePlans;
	}

	public void setRatePlans(RatePlans ratePlans) {
		this.ratePlans = ratePlans;
	}
	
	

	@Override
	public String toString() {
		return "RoomStays [PromotionCode=" + PromotionCode + ", roomTypes=" + roomTypes + ", ratePlans=" + ratePlans
				+ "]";
	}

}
