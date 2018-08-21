package com.roomservice.notification.entity;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Source {

	@JacksonXmlProperty(localName="RequestorID") 
	private RequestorID requesterId;
	@JacksonXmlProperty(localName="BookingChannel")
	private BookingChannel bookingChannel;

	public RequestorID getRequesterId() {
		return requesterId;
	}

	public void setRequesterId(RequestorID requesterId) {
		this.requesterId = requesterId;
	}

	public BookingChannel getBookingChannel() {
		return bookingChannel;
	}

	public void setBookingChannel(BookingChannel bookingChannel) {
		this.bookingChannel = bookingChannel;
	}

	@Override
	public String toString() {
		return "Source [requesterId=" + requesterId + ", bookingChannel=" + bookingChannel + "]";
	} 
	
}
