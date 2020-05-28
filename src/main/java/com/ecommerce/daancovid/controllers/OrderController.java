package com.ecommerce.daancovid.controllers;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.daancovid.entities.Order;
import com.ecommerce.daancovid.services.OrderService;

@RestController
@RequestMapping(value = "/api/orders")
public class OrderController {
	@Autowired
	OrderService orderServ;
	
	
	@RequestMapping(value = "/order", method = RequestMethod.POST)
	public Order createOrder(@RequestBody Order order) 
	{
		return orderServ.createOrder(order);
	}
	
	@GetMapping("/order/{id}")
	public Order getOrder(@PathVariable("id") String id) 
	{
		return orderServ.findOrder(id);
	}
	
	@GetMapping("/orders")
	public Collection<Order> getAllOrder() 
	{
		return orderServ.getOrders();
	}
	
	@PutMapping("/order")
	public Order updateOrder(@RequestBody Order order) 
	{
		return orderServ.updateOrder(order);
	}
	
	@DeleteMapping("/order/{id}")
	public void deleteOrder(@PathVariable String id) 
	{
		orderServ.deleteOrder(id);
	}
}
