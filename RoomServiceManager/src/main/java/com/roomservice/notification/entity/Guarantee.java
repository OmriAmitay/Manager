package com.roomservice.notification.entity;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Guarantee {

	@JacksonXmlProperty(localName="GuaranteesAccepted")
	private GuaranteesAccepted guaranteesAccepted;

	public GuaranteesAccepted getGuaranteesAccepted() {
		return guaranteesAccepted;
	}

	public void setGuaranteesAccepted(GuaranteesAccepted guaranteesAccepted) {
		this.guaranteesAccepted = guaranteesAccepted;
	}

	@Override
	public String toString() {
		return "Guarantee [guaranteesAccepted=" + guaranteesAccepted + "]";
	}

}
