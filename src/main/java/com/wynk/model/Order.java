package com.wynk.model;

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.TemporalAmount;
import java.util.UUID;

public class Order {
	private String orderId;
	private String itemId;
	private int noOfItem;
	private LocalTime startTime;
	private LocalTime endTime;
	private TemporalAmount timeForOrder;

	public Order(String itemId, int noOfItem, int hour, int minute) {
		super();
		this.orderId = UUID.randomUUID().toString();
		this.itemId = itemId;
		this.noOfItem = noOfItem;
		this.startTime = LocalTime.now();
		this.timeForOrder = Duration.ofMinutes(hour*60+minute);
		this.endTime = this.startTime.plus(this.timeForOrder);
		
	}

	public String getItemId() {
		return itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	public int getNoOfItem() {
		return noOfItem;
	}
	public void setNoOfItem(int noOfItem) {
		this.noOfItem = noOfItem;
	}

	public LocalTime getStartTime() {
		return startTime;
	}

	public void setStartTime(LocalTime startTime) {
		this.startTime = startTime;
	}

	public TemporalAmount getTimeForOrder() {
		return timeForOrder;
	}

	public void setTimeForOrder(TemporalAmount timeForOrder) {
		this.timeForOrder = timeForOrder;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public LocalTime getEndTime() {
		return endTime;
	}

	public void setEndTime(LocalTime endTime) {
		this.endTime = endTime;
	}
	
}
