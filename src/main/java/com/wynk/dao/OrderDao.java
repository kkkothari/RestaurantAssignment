package com.wynk.dao;


import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Repository;

import com.wynk.model.Order;
import com.wynk.storage.OrderData;
@Repository
public class OrderDao {
	public void insertOrder(Order order) {
		OrderData.getOrders().put(order.getOrderId(), order);
	}

	public void updateOrder(Order order) {
		OrderData.getOrders().put(order.getOrderId(), order);
	}

	public Order getOrder(String orderId) {
		return OrderData.getOrders().get(orderId);
	}

	public void deleteOrder(Order order) {
		OrderData.getOrders().remove(order.getOrderId());
	}
}
