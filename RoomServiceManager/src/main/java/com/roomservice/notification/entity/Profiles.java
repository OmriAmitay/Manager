package com.roomservice.notification.entity;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Profiles {

	@JacksonXmlProperty(localName="ProfileInfo")
	private ProfileInfo profileInfo;

	public ProfileInfo getProfileInfo() {
		return profileInfo;
	}

	public void setProfileInfo(ProfileInfo profileInfo) {
		this.profileInfo = profileInfo;
	}

	@Override
	public String toString() {
		return "Profiles [profileInfo=" + profileInfo + "]";
	}
	
}
