package com.roomservice.notification.entity;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Rates {

	@JacksonXmlProperty(localName="Rate")
	private Rate rate;

	public Rate getRate() {
		return rate;
	}

	public void setRate(Rate rate) {
		this.rate = rate;
	}

	@Override
	public String toString() {
		return "Rates [rate=" + rate + "]";
	}
	
}
