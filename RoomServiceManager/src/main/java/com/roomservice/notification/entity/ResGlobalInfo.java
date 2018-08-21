package com.roomservice.notification.entity;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class ResGlobalInfo {

	@JacksonXmlProperty(localName="Total")
	private Total total;
	@JacksonXmlProperty(localName="Guarantee")
	private Guarantee guarantee;
	@JacksonXmlProperty(localName="Profiles")
	private Profiles profiles;
	@JacksonXmlProperty(localName="Comments")
	private Comments comments;

	public Total getTotal() {
		return total;
	}

	public void setTotal(Total total) {
		this.total = total;
	}
	
	public Guarantee getGuarantee() {
		return guarantee;
	}

	public void setGuarantee(Guarantee guarantee) {
		this.guarantee = guarantee;
	}

	public Profiles getProfiles() {
		return profiles;
	}

	public void setProfiles(Profiles profiles) {
		this.profiles = profiles;
	}
	
	public Comments getComments() {
		return comments;
	}

	public void setComments(Comments comments) {
		this.comments = comments;
	}

	@Override
	public String toString() {
		return "ResGlobalInfo [total=" + total + ", guarantee=" + guarantee + ", profiles=" + profiles + ", comments="
				+ comments + "]";
	}

}
