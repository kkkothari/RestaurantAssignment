package com.wynk.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.wynk.dao.DeliveryPersonDao;
import com.wynk.dao.OrderDao;
import com.wynk.dao.OrderPersonDao;
import com.wynk.dao.OrderStatusDao;
import com.wynk.model.DeliveryPerson;
import com.wynk.model.Order;
import com.wynk.model.OrderStatus;
import com.wynk.util.Constant;

@Repository
public class RestaurantManager {
	@Autowired
	private OrderDao orderDao;
	@Autowired
	private DeliveryPersonDao deliveryPersonDao;
	@Autowired
	private OrderStatusDao orderStatusDao;
	@Autowired
	private OrderPersonDao orderPersonDao;

	public OrderStatus placeOrder(String itemId, int noOfItem, int hour, int minute) {
		Order order = new Order(itemId, noOfItem, hour, minute);
		OrderStatus orderStatus = new OrderStatus(order.getOrderId(), Constant.PLACED);
		orderDao.insertOrder(order);
		orderStatusDao.insertStatus(order.getOrderId(), orderStatus);
		return orderStatus;
	}

	public OrderStatus orderStatus(String orderId) {
		return orderStatusDao.getStatus(orderId);		
	}

	public OrderStatus updateDeliveryStatus(OrderStatus orderStatus) {
			orderStatusDao.updateStatus(orderStatus);
			if(orderStatus.getStatus().equalsIgnoreCase(Constant.REACHED_BACK)) {
				String deliveryPersonId = orderPersonDao.getDeliveryPersonId(orderStatus.getOrderId());
				deliveryPersonDao.getDeliveryPerson(deliveryPersonId).setStatus(Constant.INACTIVE);
				orderPersonDao.deleteOrderPerson(deliveryPersonId);
			}
			return orderStatus;
	}

	public List<DeliveryPerson> getAllDeliveryPersons(){
		return deliveryPersonDao.getAllDeliveryPersons();
	}
	
}
