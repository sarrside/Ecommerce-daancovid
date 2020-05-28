package com.ecommerce.daancovid.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.daancovid.entities.Cart;

@Repository
public interface CartDAO extends MongoRepository<Cart, String>{

}
