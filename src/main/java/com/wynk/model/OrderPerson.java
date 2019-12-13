package com.wynk.model;

public class OrderPerson {
	private String orderId;
	private String deliveryPersonId;
	public OrderPerson(String orderId, String personId) {
		super();
		this.orderId = orderId;
		this.deliveryPersonId = personId;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getDeliveryPersonId() {
		return deliveryPersonId;
	}
	public void setDeliveryPersonId(String personId) {
		this.deliveryPersonId = personId;
	}
	
}
