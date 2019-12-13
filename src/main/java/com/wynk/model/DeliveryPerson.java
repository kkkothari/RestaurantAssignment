package com.wynk.model;

import java.util.UUID;

public class DeliveryPerson {
	private String deliveryPersonId;
	private String status;
	public DeliveryPerson() {
		super();
		this.deliveryPersonId = UUID.randomUUID().toString();
		this.status = "INACTIVE";
	}
	
	@Override
	public String toString() {
		return "{\"personId\" : "+deliveryPersonId+", \"status\" : "+status+"}";
	}

	public String getDeliveryPersonId() {
		return deliveryPersonId;
	}
	public void setDeliveryPersonId(String personId) {
		this.deliveryPersonId = personId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
}
