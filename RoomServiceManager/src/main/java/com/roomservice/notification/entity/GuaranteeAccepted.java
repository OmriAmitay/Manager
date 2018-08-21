package com.roomservice.notification.entity;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class GuaranteeAccepted {

	@JacksonXmlProperty(localName="PaymentCard")
	private PaymentCard paymentCard;

	public PaymentCard getPaymentCard() {
		return paymentCard;
	}

	public void setPaymentCard(PaymentCard paymentCard) {
		this.paymentCard = paymentCard;
	}

	@Override
	public String toString() {
		return "GuaranteeAccepted [paymentCard=" + paymentCard + "]";
	}
	
}
