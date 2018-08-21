package com.roomservice.notification.entity;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class ResGuest {

	@JacksonXmlProperty(isAttribute = true)
	private String ResGuestRPH;
	@JacksonXmlProperty(isAttribute = true)
	private String ArrivalTime;
	@JacksonXmlProperty(isAttribute = true)
	private String PrimaryIndicator;
	
	@JacksonXmlProperty(localName="Profiles")
	private Profiles profiles;

	public String getResGuestRPH() {
		return ResGuestRPH;
	}
	
	public void setResGuestRPH(String resGuestRPH) {
		ResGuestRPH = resGuestRPH;
	}
	
	public String getArrivalTime() {
		return ArrivalTime;
	}
	
	public void setArrivalTime(String arrivalTime) {
		ArrivalTime = arrivalTime;
	}
	
	public String getPrimaryIndicator() {
		return PrimaryIndicator;
	}
	
	public void setPrimaryIndicator(String primaryIndicator) {
		PrimaryIndicator = primaryIndicator;
	}
	
	public Profiles getProfiles() {
		return profiles;
	}

	public void setProfiles(Profiles profiles) {
		this.profiles = profiles;
	}

	@Override
	public String toString() {
		return "ResGuest [ResGuestRPH=" + ResGuestRPH + ", ArrivalTime=" + ArrivalTime + ", PrimaryIndicator="
				+ PrimaryIndicator + ", profiles=" + profiles + "]";
	}

}
