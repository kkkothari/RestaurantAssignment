package com.wynk.dao;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.wynk.model.DeliveryPerson;
import com.wynk.storage.DeliveryPersonData;

@Repository
public class DeliveryPersonDao {
	public void updateStatus(String deliveryPersonId, String status){
		DeliveryPersonData.getDeliveryPersons().get(deliveryPersonId).setStatus(status);
	}
	public DeliveryPerson getDeliveryPerson(String deliveryPersonId) {
		return DeliveryPersonData.getDeliveryPersons().get(deliveryPersonId);
	}
	public List<DeliveryPerson> getAllDeliveryPersons(){
		return new ArrayList<DeliveryPerson>(DeliveryPersonData.getDeliveryPersons().values());
	}
}
