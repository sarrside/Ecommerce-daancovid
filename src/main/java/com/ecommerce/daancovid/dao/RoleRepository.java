package com.ecommerce.daancovid.dao;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ecommerce.daancovid.entities.ERole;
import com.ecommerce.daancovid.entities.Role;

public interface RoleRepository extends MongoRepository<Role, String>{
	Optional<Role> findByName(ERole name);
}
