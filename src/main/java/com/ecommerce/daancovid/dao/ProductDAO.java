package com.ecommerce.daancovid.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.daancovid.entities.Product;

@Repository
public interface ProductDAO extends MongoRepository<Product, String>{

}
