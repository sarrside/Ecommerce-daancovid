package com.ecommerce.daancovid.services;

import java.util.Collection;
import java.util.Optional;

import com.ecommerce.daancovid.entities.Cart;



public interface CartService {
	public void createCart(Cart cart);
	
	public Collection<Cart> getUsers();
	
	public Optional<Cart> findCart(String id);
	
	public void deleteCart(String id);
	
	public void updateCart(Cart user);
}
