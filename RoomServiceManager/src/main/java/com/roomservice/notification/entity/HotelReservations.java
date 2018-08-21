package com.roomservice.notification.entity;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class HotelReservations {

	@JacksonXmlProperty(localName="HotelReservation")
	private HotelReservation hotelReservation;

	public HotelReservation getHotelReservation() {
		return hotelReservation;
	}

	public void setHotelReservation(HotelReservation hotelReservation) {
		this.hotelReservation = hotelReservation;
	}

	@Override
	public String toString() {
		return "HotelReservations [hotelReservation=" + hotelReservation + "]";
	}

}
