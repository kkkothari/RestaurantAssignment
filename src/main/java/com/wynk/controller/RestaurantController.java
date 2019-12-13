package com.wynk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.wynk.business.RestaurantManager;
import com.wynk.model.DeliveryPerson;
import com.wynk.model.OrderStatus;
import com.wynk.util.OrderDetail;

@RestController
@RequestMapping("/restaurant")
public class RestaurantController {
	@Autowired
	RestaurantManager restaurantManager;
	Gson gson = new Gson();

	@PostMapping(path="/place-order", consumes = "application/json", produces = "application/json")
	public  ResponseEntity<OrderStatus> placeOrder(@RequestBody OrderDetail orderDetail) {
		OrderStatus orderStatus = restaurantManager.placeOrder(orderDetail.getItemId(), orderDetail.getNoOfItem(), 0, 59);
		return new ResponseEntity<OrderStatus>(orderStatus, HttpStatus.OK);
	}

    @GetMapping(path="/order-status/{orderId}", produces = "application/json")
	public ResponseEntity<OrderStatus> orderStatus(@PathVariable("orderId") String orderId) {
    	OrderStatus orderStatus = restaurantManager.orderStatus(orderId);
    	return new ResponseEntity<OrderStatus>(orderStatus, HttpStatus.OK);
	}

	@PostMapping(path="/update-delivery-status", consumes = "application/json", produces = "application/json")
	public ResponseEntity<OrderStatus> updateDeliveryStatus(@RequestBody OrderStatus orderStatus) {
		OrderStatus localOrderStatus = restaurantManager.updateDeliveryStatus(orderStatus);
		return new ResponseEntity<OrderStatus>(localOrderStatus, HttpStatus.OK);
	}

	@GetMapping(path="/all-delivery-person-status", produces = "application/json")
	public ResponseEntity<List<DeliveryPerson>> allDeliveryPersonStatus() {
		List<DeliveryPerson>  deliveryPersons = restaurantManager.getAllDeliveryPersons();
		return new ResponseEntity<List<DeliveryPerson>>(deliveryPersons, HttpStatus.OK);
	}
}
