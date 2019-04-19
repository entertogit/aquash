package com.aquash.platform.dao.impl;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.aquash.platform.dao.UserDao;
import com.aquash.platform.entity.UserEntity;
import com.aquash.platform.model.UserModel;
import com.aquash.platform.repository.UserRepository;
import com.aquash.platform.utility.OperationVerifier;

@Component
public class UserDaoImpl implements UserDao {

	@Autowired
	UserRepository userRepository;

	Map<String, UserModel> userMap = new HashMap<String, UserModel>();
	Map<String, String> userOtp = new HashMap<String, String>();

	@Override
	public String addUser(UserModel user) {

		System.out.println("entere user dao *******************  ");

		Optional<UserEntity> checkUser = userRepository.findById(user.getUserId());

		System.out.println("checking user  " + checkUser);

		if (!checkUser.isEmpty()) {

			return "User Already Exist with this phone number";

		}

		else {

			userMap.put(user.getUserId(), user);

			String otp = OperationVerifier.generateOtp();

			userOtp.put(user.getUserId(), otp);

			return otp;

		}

	}

	@Override
	public String verifyOtp(String idUser, String otp) {

		System.out.println("entere verify dao *******************  ");

		System.out.println("from header  " + idUser + " otp is " + otp);

		System.out.println("check otp   " + userOtp.get(idUser));

		if (otp.equals(userOtp.get(idUser))) {

			UserEntity newUser = new UserEntity();

			UserModel userModel = userMap.get(idUser);

			newUser.setIdUser(userModel.getUserId());
			newUser.setFirstName(userModel.getFirstName());
			newUser.setLastName(userModel.getLastName());
			newUser.setUserPassword(userModel.getUserPassword());
			newUser.setAlternateMobileNumber(userModel.getAlternateMobileNumber());
			newUser.setEmailId(userModel.getEmailId());
			newUser.setUserCityId(101L);
			newUser.setUserStateId(201L);
			newUser.setUserCountryId(301L);
			newUser.setPinCode(userModel.getPincode());
			newUser.setUserStatus(userModel.getStatus());
			
			

			userRepository.save(newUser);

			return "successfully added user";
		}

		else {
			return "wrong otp";
		}
	}

}
