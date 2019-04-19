package com.aquash.platform.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aquash.platform.model.UserModel;
import com.aquash.platform.service.UserService;

@RestController
@RequestMapping("/aquash")

public class UserController {
	
	@Autowired
	UserService userService;
	
	@PostMapping("/adduser")
	public String addUser(@RequestBody UserModel user) {
		System.out.println("entere user controller *******************  "+user.getUserId());
		return userService.addUser(user);
	}
	
	@PostMapping("/verifyOtp/{userId}/{otp}")
	public String verifyOtp(@PathVariable("userId") String userId, @PathVariable("otp") String otp) {
		
		System.out.println("entere verify controller *******************  "+userId + " otp  " + otp);
		return userService.verifyOtp(userId,otp);
	}

}
