package com.ecommerce.daancovid.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.daancovid.entities.OTP;


@Repository
public interface OtpDAO extends MongoRepository<OTP, String>{

}
