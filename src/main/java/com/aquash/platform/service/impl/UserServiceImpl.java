package com.aquash.platform.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aquash.platform.dao.UserDao;
import com.aquash.platform.model.UserModel;
import com.aquash.platform.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserDao userDao;
	
	@Override
	public String addUser(UserModel user) {
		
		System.out.println("entere user service *******************  ");
		
		return userDao.addUser(user);
	}

	@Override
	public String verifyOtp(String idUser, String otp) {
		
		System.out.println("entere verify service *******************  ");
		
		return userDao.verifyOtp(idUser, otp);
	}

}
