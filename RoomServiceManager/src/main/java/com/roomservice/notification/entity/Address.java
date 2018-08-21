package com.roomservice.notification.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Address {

	@JacksonXmlProperty(localName="AddressLine")
	private String AddressLine;
	//private String AddressLine;
	@JacksonXmlProperty(localName="CityName")
	private String CityName;
	@JacksonXmlProperty(localName="PostalCode")
	private String PostalCode;
	@JacksonXmlProperty(localName="StateProv")
	private String StateProv;
	
	@JacksonXmlProperty(localName="CountryName")
	private CountryName CountryName;

	public String getAddressLine() {
		return AddressLine;
	}

	public void setAddressLine(String addressLine) {
		AddressLine = addressLine;
	}

	public String getCityName() {
		return CityName;
	}

	public void setCityName(String cityName) {
		CityName = cityName;
	}

	public String getPostalCode() {
		return PostalCode;
	}

	public void setPostalCode(String postalCode) {
		PostalCode = postalCode;
	}

	public String getStateProv() {
		return StateProv;
	}

	public void setStateProv(String stateProv) {
		StateProv = stateProv;
	}

	public CountryName getCountryName() {
		return CountryName;
	}

	public void setCountryName(CountryName countryName) {
		CountryName = countryName;
	}

	@Override
	public String toString() {
		return "Address [AddressLine=" + AddressLine + ", CityName=" + CityName + ", PostalCode=" + PostalCode
				+ ", StateProv=" + StateProv + ", CountryName=" + CountryName + "]";
	}
	
}
