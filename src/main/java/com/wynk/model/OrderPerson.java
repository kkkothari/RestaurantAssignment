package com.wynk.model;

public class OrderPerson {
	private String orderId;
	private String personId;
	public OrderPerson(String orderId, String personId) {
		super();
		this.orderId = orderId;
		this.personId = personId;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getPersonId() {
		return personId;
	}
	public void setPersonId(String personId) {
		this.personId = personId;
	}
	
}
