package com.aquash.platform.service;

import com.aquash.platform.model.UserModel;

public interface UserService {
	
	String addUser(UserModel user);
	
	String verifyOtp(String idUser, String otp);

}
