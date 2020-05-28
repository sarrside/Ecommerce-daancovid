package com.ecommerce.daancovid.controllers;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.daancovid.dao.RoleDAO;
import com.ecommerce.daancovid.entities.ERole;
import com.ecommerce.daancovid.entities.Role; 
import com.ecommerce.daancovid.services.RoleService;

@RestController
@RequestMapping(value = "/api/roles")
public class RoleController {
	@Autowired
	RoleService roleServ;
	
	@Autowired
	RoleDAO roleDAO;
	
	@PostMapping("role")
	public Role create(@RequestBody Role role) {
		return roleServ.create(role);
	}
	@GetMapping("all-roles")
	public Collection<Role> getRoles(){
		return roleServ.getAll();
	}
	
	@GetMapping("get-role-by-name/{role}")
	public Optional<Role> getRole(@PathVariable ERole role){
		return roleDAO.findByName(role);
	}
	@PutMapping("role")
	public Role update(@RequestBody Role role) {
		return roleServ.update(role);
	}
	
	@PutMapping("role/{id}")
	public void delete(@PathVariable String id) {
		roleServ.delete(id);
	}
}
