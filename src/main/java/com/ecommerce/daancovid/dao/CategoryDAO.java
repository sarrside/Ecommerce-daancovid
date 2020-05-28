package com.ecommerce.daancovid.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.daancovid.entities.Category;

@Repository
public interface CategoryDAO extends MongoRepository<Category, String>{

}
