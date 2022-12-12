package com.Bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserEmailValidation {

public static boolean checkValidEmail(String email) {
		
		String emailregex = "^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)*@[0-9a-zA-Z]+.[a-zA-Z]{2,4}+([.][a-zA-Z]{2,3})?$";
		Pattern pattern = Pattern.compile(emailregex);
		
		if (email == null) {
			return false;
		}
		
		Matcher matcher = pattern.matcher(email);
		return matcher.matches();

	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your email address: ");
		String email = sc.next();
		
		boolean isEmailValid = checkValidEmail(email);
		
		if (isEmailValid) {
			System.out.println(email + " is valid");
		}
		else {
			System.out.println(email + " is not valid");
		}

	}
}
