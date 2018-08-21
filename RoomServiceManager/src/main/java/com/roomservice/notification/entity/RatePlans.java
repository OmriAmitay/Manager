package com.roomservice.notification.entity;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class RatePlans {

	@JacksonXmlProperty(localName="RatePlan")
	private RatePlan ratePlan;

	public RatePlan getRatePlan() {
		return ratePlan;
	}

	public void setRatePlan(RatePlan ratePlan) {
		this.ratePlan = ratePlan;
	}

	@Override
	public String toString() {
		return "RatePlans [ratePlan=" + ratePlan + "]";
	}
	
}
