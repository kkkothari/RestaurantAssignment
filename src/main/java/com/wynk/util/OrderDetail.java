package com.wynk.util;

public class OrderDetail {
	private String itemId;
	private int noOfItem;
	public OrderDetail(String itemId, int noOfItem) {
		super();
		this.itemId = itemId;
		this.noOfItem = noOfItem;
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
	
}
