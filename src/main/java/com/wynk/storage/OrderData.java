package com.wynk.storage;

import java.util.HashMap;
import java.util.Map;

import com.wynk.model.Order;

public class OrderData {
	private static Map<String, Order> orders = new HashMap<>();

	public static Map<String, Order> getOrders() {
		return orders;
	}

	public static void setOrders(Map<String, Order> orders) {
		OrderData.orders = orders;
	}
}
