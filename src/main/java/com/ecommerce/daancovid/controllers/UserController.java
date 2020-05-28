package com.ecommerce.daancovid.controllers;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.ecommerce.daancovid.entities.User;
import com.ecommerce.daancovid.services.UserService;
import com.ecommerce.daancovid.utils.SignupRequest;

@RestController
@RequestMapping("/api/users")
public class UserController {
	@Autowired
	private UserService userServ;
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public Map<String, String> createUser(@RequestBody @Validated SignupRequest user) {
		logger.debug("Saving employees.");
		userServ.createUser(user);
		Map<String, String> res = new HashMap<>();
        res.put("status", "user succesfully created");
        return res;
	}
	
	@RequestMapping(value = "/test", method = RequestMethod.GET)
    public Map<String, String> getById() {
        Map<String, String> test = new HashMap<>();
        test.put("status", "ok");
        return test;
    }
	/**
	 * 
	 * @param id
	 * @return 
	 */
	@GetMapping("/user/{id}") 
	public User getUser(@PathVariable(value="id") String id) {
		return userServ.findUser(id);
	}
	@PreAuthorize("hasRole('USER')")
	@GetMapping("/users") 
	public Collection<User> getAllUser() {
		return userServ.getUsers();
	}
	
	@DeleteMapping("/user/{id}") 
	public void delUser(@PathVariable String id) {
		userServ.deleteUser(id);
	}
	
	@PutMapping("/user")
	public User update(@RequestBody User user) 
	{
		userServ.updateUser(user);
		return user;
	}
	
	
}
