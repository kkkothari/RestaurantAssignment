package com.wynk.storage;

import java.util.HashMap;
import java.util.Map;

import com.wynk.model.OrderStatus;

public class OrderStatusData {
	private static Map<String, OrderStatus> ordersStatus = new HashMap<>();

	public static Map<String, OrderStatus> getOrdersStatus() {
		return ordersStatus;
	}

	public static void setOrdersStatus(Map<String, OrderStatus> ordersStatus) {
		OrderStatusData.ordersStatus = ordersStatus;
	}
}
