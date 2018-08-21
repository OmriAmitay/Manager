package com.roomservice.notification.entity;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class POS {
	
	@JacksonXmlProperty(localName="Source")
	private Source source;

	public Source getSource() {
		return source;
	}

	public void setSource(Source source) {
		this.source = source;
	}

	@Override
	public String toString() {
		return "POS [source=" + source + "]";
	}
	
}
