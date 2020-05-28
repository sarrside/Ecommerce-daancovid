package com.ecommerce.daancovid.services;

import java.util.Collection;

import com.ecommerce.daancovid.entities.Order;

public interface OrderService {
	public Order createOrder(Order order);
	
	public Collection<Order> getOrders();
	
	public Order findOrder(String id);
	
	public void deleteOrder(String id);
	
	public Order updateOrder(Order order);
}
