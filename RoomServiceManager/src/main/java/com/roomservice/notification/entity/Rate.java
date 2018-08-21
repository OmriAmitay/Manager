package com.roomservice.notification.entity;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Rate {

	@JacksonXmlProperty(isAttribute = true)
	private String UnitMultiplier;
	@JacksonXmlProperty(isAttribute = true)
	private String RateTimeUnit;
	@JacksonXmlProperty(isAttribute = true)
	private String EffectiveDate;
	@JacksonXmlProperty(isAttribute = true)
	private String ExpireDate;
	@JacksonXmlProperty(localName="Base")
	private Base base;
	@JacksonXmlProperty(localName="Total")
	private Total total;
	
	public String getUnitMultiplier() {
		return UnitMultiplier;
	}
	
	public void setUnitMultiplier(String unitMultiplier) {
		UnitMultiplier = unitMultiplier;
	}
	
	public String getRateTimeUnit() {
		return RateTimeUnit;
	}
	
	public void setRateTimeUnit(String rateTimeUnit) {
		RateTimeUnit = rateTimeUnit;
	}
	
	public String getEffectiveDate() {
		return EffectiveDate;
	}
	
	public void setEffectiveDate(String effectiveDate) {
		EffectiveDate = effectiveDate;
	}
	
	public String getExpireDate() {
		return ExpireDate;
	}
	
	public void setExpireDate(String expireDate) {
		ExpireDate = expireDate;
	}
	
	public Total getTotal() {
		return total;
	}
	
	public void setTotal(Total total) {
		this.total = total;
	}

	public Base getBase() {
		return base;
	}

	public void setBase(Base base) {
		this.base = base;
	}

	@Override
	public String toString() {
		return "Rate [UnitMultiplier=" + UnitMultiplier + ", RateTimeUnit=" + RateTimeUnit + ", EffectiveDate="
				+ EffectiveDate + ", ExpireDate=" + ExpireDate + ", base=" + base + ", total=" + total + "]";
	}

}
