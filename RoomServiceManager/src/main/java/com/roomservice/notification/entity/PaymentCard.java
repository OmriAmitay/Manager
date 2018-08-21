package com.roomservice.notification.entity;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class PaymentCard {

	@JacksonXmlProperty(isAttribute = true)
	private String CardNumber;
	@JacksonXmlProperty(isAttribute = true)
	private String CardType;
	@JacksonXmlProperty(isAttribute = true)
	private String ExpireDate;
	@JacksonXmlProperty(isAttribute = true)
	private String SeriesCode;
	@JacksonXmlProperty(isAttribute = true)
	private String CardCode;
	
	@JacksonXmlProperty(localName="CardHolderName")
	private CardHolderName cardHolderName;
	
	public String getCardNumber() {
		return CardNumber;
	}
	
	public void setCardNumber(String cardNumber) {
		CardNumber = cardNumber;
	}
	
	public String getCardType() {
		return CardType;
	}
	
	public void setCardType(String cardType) {
		CardType = cardType;
	}
	
	public String getExpireDate() {
		return ExpireDate;
	}
	
	public void setExpireDate(String expireDate) {
		ExpireDate = expireDate;
	}
	
	public String getSeriesCode() {
		return SeriesCode;
	}
	
	public void setSeriesCode(String seriesCode) {
		SeriesCode = seriesCode;
	}
	
	public String getCardCode() {
		return CardCode;
	}
	
	public void setCardCode(String cardCode) {
		CardCode = cardCode;
	}
	
	public CardHolderName getCardHolderName() {
		return cardHolderName;
	}

	public void setCardHolderName(CardHolderName cardHolderName) {
		this.cardHolderName = cardHolderName;
	}

	@Override
	public String toString() {
		return "PaymentCard [CardNumber=" + CardNumber + ", CardType=" + CardType + ", ExpireDate=" + ExpireDate
				+ ", SeriesCode=" + SeriesCode + ", CardCode=" + CardCode + ", cardHolderName=" + cardHolderName + "]";
	}

}
