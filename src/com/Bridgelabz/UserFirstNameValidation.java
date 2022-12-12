package com.Bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserFirstNameValidation {
	
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
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your First name: ");
		String firstName = sc.next();
		
		boolean isfirstNameValid = checkValidFirstName(firstName);
		
		if (isfirstNameValid) {
			System.out.println(firstName + " is valid");
		}
		else {
			System.out.println(firstName + " is not valid");
		}

	}
}
