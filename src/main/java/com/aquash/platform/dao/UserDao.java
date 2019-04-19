package com.aquash.platform.dao;

import com.aquash.platform.model.UserModel;

public interface UserDao {
	
	String addUser(UserModel user);
	
	String verifyOtp(String idUser, String otp);
	
	
	
	

}
