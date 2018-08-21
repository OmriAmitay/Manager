package com.roomservice.notification.service;

public enum NotificationStatusEnum {
	
	COMMIT("Commit"),
	CANCEL("Cancle"),
	MODIFY("Modify");
	
	private String status;
	
	NotificationStatusEnum(String status) {
		this.status = status;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
}
