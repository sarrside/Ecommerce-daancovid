package com.ecommerce.daancovid.services.serviceImplements;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.daancovid.dao.OrderDAO;
import com.ecommerce.daancovid.entities.Order;
import com.ecommerce.daancovid.services.OrderService;

@Service
public class OrderServiceImplement implements OrderService {
	
	@Autowired
	OrderDAO orderDAO;

	@Override
	public Order createOrder(Order order) {
		return orderDAO.insert(order);

	}

	@Override
	public Collection<Order> getOrders() {
		return orderDAO.findAll();
	}

	@Override
	public Order findOrder(String id) {
		Collection<Order> liste = orderDAO.findAll();
		Order order = new Order();
		liste.forEach(item -> {
			if(item.getId().equals(id)) {
				order.setId(item.getId());
				order.setOrder_num(order.getOrder_num());
				order.setStatus(item.getStatus());
				order.setTotal_amount(item.getTotal_amount());
				order.setUser(item.getUser());
			}
		});
		return order;
	}

	@Override
	public void deleteOrder(String id) {
		
		orderDAO.delete(this.findOrder(id));

	}

	@Override
	public Order updateOrder(Order order) {
		return orderDAO.save(order);
	}

}
