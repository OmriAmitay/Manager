package com.roomservice.notification.entity;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class MealsIncluded {
	
	@JacksonXmlProperty(isAttribute = true)
	private String MealPlanCodes;

	public String getMealPlanCodes() {
		return MealPlanCodes;
	}

	public void setMealPlanCodes(String mealPlanCodes) {
		MealPlanCodes = mealPlanCodes;
	}

	@Override
	public String toString() {
		return "MealsIncluded [MealPlanCodes=" + MealPlanCodes + "]";
	}

}
