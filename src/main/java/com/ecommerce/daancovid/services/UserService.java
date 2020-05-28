package com.ecommerce.daancovid.services;

import java.util.Collection;
import java.util.Optional;

import org.bson.types.ObjectId;

import com.ecommerce.daancovid.entities.User;
import com.ecommerce.daancovid.utils.SignupRequest;

public interface UserService {
	
	public void createUser(SignupRequest user);
	
	public Collection<User> getUsers();
	
	public User findUser(String id);
	
	public void deleteUser(String id);
	
	public void updateUser(User user);
	
	public Optional<User> findByUsername(String username);

	public Boolean existsByUsername(String username);

	public Boolean existsByEmail(String email);

}
