package com.roomservice.notification.entity;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class SpecialRequest {

	@JacksonXmlProperty(isAttribute = true)
	private String Name;
	@JacksonXmlProperty(localName="Text")
	private Text text;
	
	public Text getText() {
		return text;
	}

	public void setText(Text text) {
		this.text = text;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	@Override
	public String toString() {
		return "SpecialRequest [Name=" + Name + ", text=" + text + "]";
	}

}
