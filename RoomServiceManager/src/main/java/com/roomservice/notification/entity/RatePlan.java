package com.roomservice.notification.entity;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class RatePlan {
	
	@JacksonXmlProperty(isAttribute = true)
	private String RatePlanCode;
	@JacksonXmlProperty(localName="RatePlanDescription")
	private RatePlanDescription RatePlanDescription;
	@JacksonXmlProperty(localName="MealsIncluded")
	private MealsIncluded mealsIncluded;

	public String getRatePlanCode() {
		return RatePlanCode;
	}

	public void setRatePlanCode(String ratePlanCode) {
		RatePlanCode = ratePlanCode;
	}
	
	public RatePlanDescription getRatePlanDescription() {
		return RatePlanDescription;
	}

	public void setRatePlanDescription(RatePlanDescription ratePlanDescription) {
		RatePlanDescription = ratePlanDescription;
	}
	
	public MealsIncluded getMealsIncluded() {
		return mealsIncluded;
	}

	public void setMealsIncluded(MealsIncluded mealsIncluded) {
		this.mealsIncluded = mealsIncluded;
	}

	@Override
	public String toString() {
		return "RatePlan [RatePlanCode=" + RatePlanCode + ", RatePlanDescription=" + RatePlanDescription
				+ ", mealsIncluded=" + mealsIncluded + "]";
	}

}
