package com.wynk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.wynk.business.DeliveryPersonManager;
import com.wynk.business.RestaurantManager;
import com.wynk.dao.OrderPersonDao;
import com.wynk.model.OrderPerson;
import com.wynk.model.OrderStatus;

@RestController
@RequestMapping("/delivery-person")
public class DeliveryPersonController {
	@Autowired
	DeliveryPersonManager deliveryPersonManager;
	@Autowired
	private OrderPersonDao orderPersonDao;
	Gson gson = new Gson();

    @GetMapping(path="/status/{deliveryPersonId}", produces = "application/json")
	public  ResponseEntity<String> status(@PathVariable("deliveryPersonId") String deliveryPersonId) {
    	String output = deliveryPersonManager.deliveryPersonState(deliveryPersonId);
    	return new ResponseEntity<String>(output, HttpStatus.OK);
	}

    @PostMapping(path="/delegate", consumes = "application/json", produces = "application/json")
	public ResponseEntity<String> delegate(@RequestBody OrderPerson orderPerson) {
    	String output = deliveryPersonManager.delegate(orderPerson);
		return new ResponseEntity<String>(output, HttpStatus.OK);
	}
}
