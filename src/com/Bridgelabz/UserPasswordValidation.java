package com.Bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserPasswordValidation {

	public static boolean checkValidPassword(String password) {
		
		String passwordregex = "(?=.*[A-Z])(?=.*[0-9]).{8,}";
		Pattern pattern = Pattern.compile(passwordregex);
		
		if (password == null) {
			return false;
		}
		
		Matcher matcher = pattern.matcher(password);
		return matcher.matches();

	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your password: ");
		String password = sc.next();
		
		boolean ispasswordValid = checkValidPassword(password);
		
		if (ispasswordValid) {
			System.out.println(password + " is valid");
		}
		else {
			System.out.println(password + " is not valid");
		}

	}
}