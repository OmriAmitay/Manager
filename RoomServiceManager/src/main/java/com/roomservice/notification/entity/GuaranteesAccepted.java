package com.roomservice.notification.entity;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class GuaranteesAccepted {

	@JacksonXmlProperty(localName="GuaranteeAccepted")
	private GuaranteeAccepted GuaranteeAccepted;

	public GuaranteeAccepted getGuaranteeAccepted() {
		return GuaranteeAccepted;
	}

	public void setGuaranteeAccepted(GuaranteeAccepted guaranteeAccepted) {
		GuaranteeAccepted = guaranteeAccepted;
	}

	@Override
	public String toString() {
		return "GuaranteesAccepted [GuaranteeAccepted=" + GuaranteeAccepted + "]";
	}
	
}
