package com.wynk.model;

public class OrderStatus {
	private String orderId;
	private String status;
	public OrderStatus(String orderId, String status) {
		super();
		this.orderId = orderId;
		this.status = status;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}
