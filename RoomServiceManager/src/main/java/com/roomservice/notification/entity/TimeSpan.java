package com.roomservice.notification.entity;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class TimeSpan {

	@JacksonXmlProperty(isAttribute = true)
	private String Start;
	@JacksonXmlProperty(isAttribute = true)
	private String End;
	
	public String getStart() {
		return Start;
	}
	
	public void setStart(String start) {
		Start = start;
	}
	
	public String getEnd() {
		return End;
	}
	
	public void setEnd(String end) {
		End = end;
	}

	@Override
	public String toString() {
		return "TimeSpan [Start=" + Start + ", End=" + End + "]";
	}
	
}
