package com.ecommerce.daancovid.utils;

import java.util.HashSet;
import java.util.Set;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

import com.ecommerce.daancovid.entities.Role;
 
public class SignupRequest {
	
	private String _id;
	private String phone;
	private Boolean active;
	private String email;
	private String username;
	private String password;
	private Set<String> roles ;
	
	public Set<String> getRoles() {
		return roles;
	}

	public void setRoles(Set<String> roles) {
		this.roles = roles;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public SignupRequest(String phone, Boolean active, String email, String username, String password) {
		this.active = active;
		this.phone = phone;
		//this.orders = liste;
		this.email = email;
		this.username = username;
		this.password = password;
	}
	
	public SignupRequest() 
	{
		
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

//	public List<Order> getOrders() {
//		return orders;
//	}
//
//	public void setOrders(List<Order> orders) {
//		this.orders = orders;
//	}

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}
}
