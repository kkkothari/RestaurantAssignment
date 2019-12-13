package com.wynk.storage;

import java.util.HashMap;
import java.util.Map;

import com.wynk.model.DeliveryPerson;

public class DeliveryPersonData {
	private static Map<String, DeliveryPerson> deliveryPersons = new HashMap<>();
	static {
		DeliveryPerson dp1 = new DeliveryPerson();
		deliveryPersons.put(dp1.getDeliveryPersonId(), dp1);
		dp1 = new DeliveryPerson();
		deliveryPersons.put(dp1.getDeliveryPersonId(), dp1);
		dp1 = new DeliveryPerson();
		deliveryPersons.put(dp1.getDeliveryPersonId(), dp1);
		dp1 = new DeliveryPerson();
		deliveryPersons.put(dp1.getDeliveryPersonId(), dp1);
		dp1 = new DeliveryPerson();
		deliveryPersons.put(dp1.getDeliveryPersonId(), dp1);
	}
	public static Map<String, DeliveryPerson> getDeliveryPersons() {
		return deliveryPersons;
	}
	public static void setDeliveryPersons(Map<String, DeliveryPerson> deliveryPersons) {
		DeliveryPersonData.deliveryPersons = deliveryPersons;
	}
}
