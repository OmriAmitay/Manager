package com.roomservice.notification.entity;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Base {

	@JacksonXmlProperty(isAttribute = true)
	private String AmountBeforeTax;
	@JacksonXmlProperty(isAttribute = true)
	private String AmountAfterTax;
	@JacksonXmlProperty(isAttribute = true)
	private String CurrencyCode;
	
	@JacksonXmlProperty(localName="Taxes")
	private Taxes taxes;
	
	public String getAmountBeforeTax() {
		return AmountBeforeTax;
	}
	
	public void setAmountBeforeTax(String amountBeforeTax) {
		AmountBeforeTax = amountBeforeTax;
	}
	
	public String getAmountAfterTax() {
		return AmountAfterTax;
	}
	
	public void setAmountAfterTax(String amountAfterTax) {
		AmountAfterTax = amountAfterTax;
	}
	
	public String getCurrencyCode() {
		return CurrencyCode;
	}
	
	public void setCurrencyCode(String currencyCode) {
		CurrencyCode = currencyCode;
	}
	
	public Taxes getTaxes() {
		return taxes;
	}
	
	public void setTaxes(Taxes taxes) {
		this.taxes = taxes;
	}
	
	@Override
	public String toString() {
		return "Base [AmountBeforeTax=" + AmountBeforeTax + ", AmountAfterTax=" + AmountAfterTax + ", CurrencyCode="
				+ CurrencyCode + ", taxes=" + taxes + "]";
	}
	
}
