package com.roomservice.notification.entity;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class PersonName {

	@JacksonXmlProperty(localName="NamePrefix")
	private String namePrefix;
	@JacksonXmlProperty(localName="GivenName")
	private String givenName;
	@JacksonXmlProperty(localName="Surname")
	private String surname;
	
	public String getNamePrefix() {
		return namePrefix;
	}
	
	public void setNamePrefix(String namePrefix) {
		this.namePrefix = namePrefix;
	}
	
	public String getGivenName() {
		return givenName;
	}
	
	public void setGivenName(String givenName) {
		this.givenName = givenName;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}

	@Override
	public String toString() {
		return "PersonName [namePrefix=" + namePrefix + ", givenName=" + givenName + ", surname=" + surname + "]";
	}
	
}
