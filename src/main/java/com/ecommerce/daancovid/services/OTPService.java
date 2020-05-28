package com.ecommerce.daancovid.services;


import java.util.Optional;

import com.ecommerce.daancovid.entities.OTP;

public interface OTPService {
public void createOTP(OTP otp);
	
	//public Collection<User> getUsers();
	
	public Optional<OTP> findOTP(String phone);
	
	public void deleteOTP(String phone);
	
	//public void updateUser(User user);
}
