package com.roomservice.notification.entity;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Profile {

	@JacksonXmlProperty(isAttribute = true)
	private String ProfileType;
	@JacksonXmlProperty(localName="Customer")
	private Customer customer;

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public String getProfileType() {
		return ProfileType;
	}

	public void setProfileType(String profileType) {
		ProfileType = profileType;
	}

	@Override
	public String toString() {
		return "Profile [ProfileType=" + ProfileType + ", customer=" + customer + "]";
	}

}
