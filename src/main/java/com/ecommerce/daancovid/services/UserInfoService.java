package com.ecommerce.daancovid.services;

import java.util.Collection;
import java.util.Optional;


import com.ecommerce.daancovid.entities.UserInfo;

public interface UserInfoService {
	
public void createUserInfo(UserInfo userInfo);
	
	public Collection<UserInfo> getUsers();
	
	public Optional<UserInfo> findUser(String id);
	
	public void deleteUserInfo(String id);
	
	public void updateUser(UserInfo userInfo);
}
