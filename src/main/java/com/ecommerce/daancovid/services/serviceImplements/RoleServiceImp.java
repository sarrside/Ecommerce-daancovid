package com.ecommerce.daancovid.services.serviceImplements;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.daancovid.dao.RoleDAO;
import com.ecommerce.daancovid.entities.ERole;
import com.ecommerce.daancovid.entities.Role;
import com.ecommerce.daancovid.services.RoleService;
@Service
public class RoleServiceImp implements RoleService{
	
	@Autowired
	RoleDAO roleDAO;

	@Override
	public Role create(Role role) {
		return roleDAO.insert(role);
	}

	@Override
	public Role update(Role role) {
		return roleDAO.save(role);
	}

	@Override
	public void delete(String id) {
		Role role = this.get(id);
		roleDAO.delete(role);
		
	}

	@Override
	public Role get(String id) {
		Role role = new Role();
		List<Role> liste = roleDAO.findAll();
		liste.forEach(item->{
			if(item.getId().equals(id)) {
				role.setId(item.getId());
				role.setName(item.getName());
			}
		});
		return role;
	}

	@Override
	public Collection<Role> getAll() {
		return roleDAO.findAll();
	}

//	@Override
//	public R findByName(ERole name) {
//		Role role = new Role();
//		List<Role> liste = roleDAO.findAll();
//		liste.forEach(item->{
//			if(item.getId().equals(name)) {
//				role.setId(item.getId());
//				role.setName(item.getName());
//			}
//		});
//		return role;
//	}
	
}
