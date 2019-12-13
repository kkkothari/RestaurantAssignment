package com.wynk.storage;

import java.util.HashMap;
import java.util.Map;

public class OrderPersonData {
	private static Map<String, String> orderPerson = new HashMap<>();

	public static Map<String, String> getOrderPerson() {
		return orderPerson;
	}

	public static void setOrderPerson(Map<String, String> orderPerson) {
		OrderPersonData.orderPerson = orderPerson;
	}
}
