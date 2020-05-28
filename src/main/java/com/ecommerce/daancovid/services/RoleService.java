package com.ecommerce.daancovid.services;

import java.util.Collection;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ecommerce.daancovid.entities.ERole;
import com.ecommerce.daancovid.entities.Role;

public interface RoleService {
	public Role create(Role role);
	public Role update(Role role);
	public void delete(String id);
	public Role get(String id);
	public Collection<Role> getAll();
	//Role findByName(ERole name);
}
