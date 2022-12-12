package com.Bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserLastNameValidation {
	
	public static boolean checkValidLastName(String lastName) {
		
		String lastNameregex = "[A-Z][a-z]{3,}";
		Pattern pattern = Pattern.compile(lastNameregex);
		
		if (lastName == null) {
			return false;
		}
		
		Matcher matcher = pattern.matcher(lastName);
		return matcher.matches();

	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Last name: ");
		String lastName = sc.next();
		
		boolean islastNameValid = checkValidLastName(lastName);
		
		if (islastNameValid) {
			System.out.println(lastName + " is valid");
		}
		else {
			System.out.println(lastName + " is not valid");
		}

	}
}
