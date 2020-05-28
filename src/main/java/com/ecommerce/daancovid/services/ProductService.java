package com.ecommerce.daancovid.services;

import java.util.Collection;
import java.util.Optional;

import com.ecommerce.daancovid.entities.Product;

public interface ProductService {
public void createProduct(Product product);
	
	public Collection<Product> getUsers();
	
	public Optional<Product> findProduct(String id);
	
	public void deleteProduct(String id);
	
	public void updateProduct(Product product);
}
