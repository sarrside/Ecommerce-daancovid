package com.ecommerce.daancovid.services.serviceImplements;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.ecommerce.daancovid.dao.RoleDAO;
import com.ecommerce.daancovid.dao.UserDAO;
import com.ecommerce.daancovid.entities.ERole;
import com.ecommerce.daancovid.entities.Role;
import com.ecommerce.daancovid.entities.User;
import com.ecommerce.daancovid.services.UserService;
import com.ecommerce.daancovid.utils.SignupRequest;

@Service
public class UserServiceImp implements UserService {

	@Autowired
	UserDAO userDAO;
	@Autowired
	RoleDAO roleDAO;
	@Autowired
	PasswordEncoder encoder;

	@Override
	public void createUser(SignupRequest user) {
		User userSave = new User();
		Collection<String> roleUser = null;
		Set<String> strRoles = user.getRoles();
		Set<Role> roles = new HashSet<>();
		System.out.println("\n");
		System.out.println();
		
		strRoles.forEach(item->{
			System.out.println(item);
			switch (item) {
			case "admin":
				System.out.println("\n"+"");
				Role adminRole = roleDAO.findByName(ERole.ROLE_ADMIN)
						.orElseThrow(() -> new RuntimeException("Error: Role is not found."));
				roles.add(adminRole);

				break;
			case "mod":
				Role modRole = roleDAO.findByName(ERole.ROLE_MODERATOR)
						.orElseThrow(() -> new RuntimeException("Error: Role is not found."));
				roles.add(modRole);

				break;
			default:
				Role userRole = roleDAO.findByName(ERole.ROLE_USER)
						.orElseThrow(() -> new RuntimeException("Error: Role is not found."));
				roles.add(userRole);
			}
		});
		
		userSave.setActive(true);
		userSave.setEmail(user.getEmail());
		userSave.setPassword(encoder.encode(user.getPassword()));
		userSave.setPhone(user.getPhone());
		userSave.setRoles(roles);
		userSave.setUsername(user.getUsername());
		userDAO.insert(userSave);
		
	}

	@Override
	public Collection<User> getUsers() {
		return userDAO.findAll();
	}

	@Override
	public User findUser(String id) {
		List<User> liste = userDAO.findAll();
		User user = new User();
		liste.forEach(it -> {
			if (it.get_id().equals(id)) {
				user.set_id(it.get_id());
				user.setActive(it.getActive());
				user.setPhone(it.getPhone());
			}
		});
		return user;
	}

	@Override
	public void deleteUser(String id) {
		User user = new User();
		List<User> liste = userDAO.findAll();
		liste.forEach(it -> {
			if (it.get_id().equals(id)) {
				user.set_id(it.get_id());
				user.setActive(it.getActive());
				user.setPhone(it.getPhone());
			}
		});
		if (user.get_id() != null) {
			userDAO.delete(user);
		}
	}

	@Override
	public void updateUser(User user) {
		userDAO.save(user);

	}

	@Override
	public Optional<User> findByUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean existsByUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean existsByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

}
