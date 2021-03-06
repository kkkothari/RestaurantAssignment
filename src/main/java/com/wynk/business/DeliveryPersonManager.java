package com.wynk.business;

import static java.time.temporal.ChronoUnit.MINUTES;

import java.time.Duration;
import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.wynk.dao.DeliveryPersonDao;
import com.wynk.dao.OrderDao;
import com.wynk.dao.OrderPersonDao;
import com.wynk.model.DeliveryPerson;
import com.wynk.model.Order;
import com.wynk.model.OrderPerson;
import com.wynk.util.Constant;

@Repository
public class DeliveryPersonManager {
	@Autowired
	private OrderDao orderDao;
	@Autowired
	private DeliveryPersonDao deliveryPersonDao;
	@Autowired
	private OrderPersonDao orderPersonDao;
	
	public String delegate(OrderPerson orderPerson) {
		DeliveryPerson deliveryPerson = deliveryPersonDao.getDeliveryPerson(orderPerson.getDeliveryPersonId());
		String status = Constant.ACCEPTED;
		if(deliveryPerson.getStatus().equals(Constant.ACTIVE)) {
			status = Constant.NOT_ACCEPTED;
		}
		deliveryPersonDao.updateStatus(deliveryPerson.getDeliveryPersonId(), Constant.ACTIVE);
		orderPersonDao.insertOrderPerson(orderPerson);
		return "{\"status\" : " + status + "}";
		
	}

	public String deliveryPersonState(String deliveryPersonId) {
		DeliveryPerson deliveryPerson = deliveryPersonDao.getDeliveryPerson(deliveryPersonId);
		if(deliveryPerson.getStatus().equalsIgnoreCase(Constant.ACTIVE)) {
			String orderId = orderPersonDao.getOrderId(deliveryPersonId);
			Order order = orderDao.getOrder(orderId);
			long minute = LocalTime.now().until(order.getEndTime(), MINUTES);
			Duration.between(order.getEndTime(), LocalTime.now());
			return "{\"status\":"+Constant.ACTIVE+",\"MinuteLeft\":"+minute+",\"orderId\": " + orderId +"}";
		}
		else {
			return "{\"status\":"+Constant.INACTIVE+"}";
		}
	}
}
