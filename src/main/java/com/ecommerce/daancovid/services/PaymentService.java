package com.ecommerce.daancovid.services;

import java.util.Collection;
import java.util.Optional;

import com.ecommerce.daancovid.entities.Payment;
import com.ecommerce.daancovid.entities.User;

public interface PaymentService {
	
	public void createPayment(User user);
	
	public Collection<Payment> getUsers();
	
	public Optional<Payment> findPayment(String id);
	
	public Optional<Payment> findPaymentByOrder(String orderId);
	
	public void deletePayment(String id);
	
	public void updatePayment(Payment payement);
}
