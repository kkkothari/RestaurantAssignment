package com.wynk.dao;


import java.util.Map;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Repository;

import com.wynk.model.OrderPerson;
import com.wynk.storage.OrderPersonData;
@Repository
public class OrderPersonDao {
	public void insertOrderPerson(OrderPerson orderPerson) {
		OrderPersonData.getOrderPerson().put(orderPerson.getPersonId(), orderPerson.getOrderId());
	}
	public void deleteOrderPerson(String deliveryPersonId) {
		OrderPersonData.getOrderPerson().remove(deliveryPersonId);
	}
	public String getOrderId(String deliveryPersonId) {
		return OrderPersonData.getOrderPerson().get(deliveryPersonId);
	}
	public String getPersonId(String orderId) {
		for(Map.Entry<String, String> entry : OrderPersonData.getOrderPerson().entrySet()) {
			if(entry.getValue().equals(orderId)) {
				return entry.getKey();
			}
		}
		return null;
	}
}
