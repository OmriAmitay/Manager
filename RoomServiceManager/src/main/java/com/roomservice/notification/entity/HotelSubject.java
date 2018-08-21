package com.roomservice.notification.entity;

public class HotelSubject {
	
	private Integer entityId;  // null meaning not important 
	private String board;
	private String roomName;
	private double price;
	private Operator operator;
	private Currency currency;
	private String arrival;
	private int numOfNights;
	private Filter filter;
	private int quntity;
	private boolean active;
	private boolean lock;
	
	public Integer getEntityId() {
		return entityId;
	}
	
	public void setEntityId(Integer entityId) {
		this.entityId = entityId;
	}
	
	public String getBoard() {
		return board;
	}
	
	public void setBoard(String board) {
		this.board = board;
	}
	
	public String getRoomName() {
		return roomName;
	}
	
	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public Operator getOperator() {
		return operator;
	}
	
	public void setOperator(Operator operator) {
		this.operator = operator;
	}
	
	public Currency getCurrency() {
		return currency;
	}
	
	public void setCurrency(Currency currency) {
		this.currency = currency;
	}
	
	public String getArrival() {
		return arrival;
	}
	
	public void setArrival(String arrival) {
		this.arrival = arrival;
	}
	
	public int getNumOfNights() {
		return numOfNights;
	}
	
	public void setNumOfNights(int numOfNights) {
		this.numOfNights = numOfNights;
	}
	
	public Filter getFilter() {
		return filter;
	}
	
	public void setFilter(Filter filter) {
		this.filter = filter;
	}
	
	public boolean isActive() {
		return active;
	}
	
	public void setActive(boolean active) {
		this.active = active;
	}
	
	public boolean isLock() {
		return lock;
	}
	
	public void setLock(boolean lock) {
		this.lock = lock;
	}

	public int getQuntity() {
		return quntity;
	}

	public void setQuntity(int quntity) {
		this.quntity = quntity;
	}

	@Override
	public String toString() {
		return "HotelSubject [entityId=" + entityId + ", board=" + board + ", roomName=" + roomName + ", price=" + price
				+ ", operator=" + operator + ", currency=" + currency + ", arrival=" + arrival + ", numOfNights="
				+ numOfNights + ", filter=" + filter + ", quntity=" + quntity + ", active=" + active + ", lock=" + lock
				+ "]";
	}

}
