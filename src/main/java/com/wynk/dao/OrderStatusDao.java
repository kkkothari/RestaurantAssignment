package com.wynk.dao;


import org.springframework.stereotype.Repository;

import com.wynk.model.OrderStatus;
import com.wynk.storage.OrderStatusData;

@Repository
public class OrderStatusDao {
	public OrderStatus getStatus(String orderId) {
		return OrderStatusData.getOrdersStatus().get(orderId);
	}
	public void insertStatus(String orderId, OrderStatus status) {
		OrderStatusData.getOrdersStatus().put(orderId, status);
	}
	public void updateStatus(OrderStatus orderStatus) {
		OrderStatusData.getOrdersStatus().put(orderStatus.getOrderId(), orderStatus);
	}
	public void deleteStatus(String orderId) {
		OrderStatusData.getOrdersStatus().remove(orderId);
	}
}
