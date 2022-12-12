package com.Bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	
	public static boolean checkValidFirstName(String firstName) {
		
		String firstNameregex = "[A-Z][a-z]{3,}";
		Pattern pattern = Pattern.compile(firstNameregex);
		
		if (firstName == null) {
			return false;
		}
		
		Matcher matcher = pattern.matcher(firstName);
		return matcher.matches();

	}

	public static void main(String[] args) {
		
		String firstName = "Dhanshree";
		
		boolean isfirstNameValid = checkValidFirstName(firstName);
		
		if (isfirstNameValid) {
			System.out.println(firstName + " is valid");
		}
		else {
			System.out.println(firstName + " is not valid");
		}

	}
}
