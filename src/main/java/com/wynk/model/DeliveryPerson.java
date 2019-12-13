package com.wynk.model;

import java.util.UUID;

public class DeliveryPerson {
	private String personId;
	private String status;
	public DeliveryPerson() {
		super();
		this.personId = UUID.randomUUID().toString();
		this.status = "INACTIVE";
	}
	
	@Override
	public String toString() {
		return "{\"personId\" : "+personId+", \"status\" : "+status+"}";
	}

	public String getPersonId() {
		return personId;
	}
	public void setPersonId(String personId) {
		this.personId = personId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
}
