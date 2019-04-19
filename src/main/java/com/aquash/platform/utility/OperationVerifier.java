package com.aquash.platform.utility;

import java.util.Random;

public class OperationVerifier {
	
    static Random rand = new Random();
	
	public static String generateOtp() {
		
		System.out.println("entere otp *******************  ");
		
		
		String otp = String.format("%04d", rand.nextInt(10000));
		
		System.out.println("in otp value ******************  "+otp);
		
		return otp;
	}

}
