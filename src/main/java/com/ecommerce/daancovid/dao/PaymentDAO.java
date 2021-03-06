package com.ecommerce.daancovid.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.daancovid.entities.Payment;


@Repository
public interface PaymentDAO extends MongoRepository<Payment, String>{

}
