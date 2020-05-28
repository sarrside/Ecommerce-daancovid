package com.ecommerce.daancovid.dao;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.daancovid.entities.User;

@Repository
public interface UserDAO extends MongoRepository<User, Integer> {

	Optional<User> findByUsername(String username);

	Boolean existsByUsername(String username);

	Boolean existsByEmail(String email);

}
