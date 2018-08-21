package com.roomservice.notification.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Customer {

	@JacksonXmlProperty(localName="PersonName")
	private PersonName personName;
	@JacksonXmlProperty(localName="Telephone")
	private Telephone telephone;
	@JacksonXmlProperty(localName="Email")
	private String email;  
	@JacksonXmlProperty(localName="Address")
	private Address Address;

	public PersonName getPersonName() {
		return personName;
	}
	
	public void setPersonName(PersonName personName) {
		this.personName = personName;
	}

	
	public Telephone getTelephone() {
		return telephone;
	}

	public void setTelephone(Telephone telephone) {
		this.telephone = telephone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Customer [personName=" + personName + ", telephone=" + telephone + ", email=" + email + ", Address="
				+ Address + "]";
	}

}
