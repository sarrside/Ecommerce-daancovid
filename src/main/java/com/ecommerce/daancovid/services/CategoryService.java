package com.ecommerce.daancovid.services;

import java.util.Collection;
import java.util.Optional;

import com.ecommerce.daancovid.entities.Category;



public interface CategoryService {
	
	
	public void createUser(Category cat);
	
	public Collection<Category> getCategories();
	
	public Optional<Category> findCategory(String id);
	
	public void deleteCategory(String id);
	
	public void updateCategory(Category cat);
}
