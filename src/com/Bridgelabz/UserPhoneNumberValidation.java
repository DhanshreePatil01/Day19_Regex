package com.Bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserPhoneNumberValidation {

public static boolean checkValidPhoneNumber(String pNumber) {
		
	String pNumberregex = "^[0-9]{1,6}[0-9]{10}$";
		Pattern pattern = Pattern.compile(pNumberregex);
		
		if (pNumber == null) {
			return false;
		}
		
		Matcher matcher = pattern.matcher(pNumber);
		return matcher.matches();

	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Phone Number: ");
		String pNumber = sc.next();
		
		boolean ispNumberValid = checkValidPhoneNumber(pNumber);
		
		if (ispNumberValid) {
			System.out.println(pNumber + " is valid");
		}
		else {
			System.out.println(pNumber + " is not valid");
		}

	}
}
