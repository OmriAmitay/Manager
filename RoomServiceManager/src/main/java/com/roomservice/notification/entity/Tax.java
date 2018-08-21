package com.roomservice.notification.entity;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Tax {

	@JacksonXmlProperty(isAttribute = true)
	private String Amount;
	@JacksonXmlProperty(isAttribute = true)
	private String CurrencyCode;
	
	public String getAmount() {
		return Amount;
	}
	
	public void setAmount(String amount) {
		Amount = amount;
	}
	
	public String getCurrencyCode() {
		return CurrencyCode;
	}
	
	public void setCurrencyCode(String currencyCode) {
		CurrencyCode = currencyCode;
	}

	@Override
	public String toString() {
		return "Tax [Amount=" + Amount + ", CurrencyCode=" + CurrencyCode + "]";
	}
	
}
