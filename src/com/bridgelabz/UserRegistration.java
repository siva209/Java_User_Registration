package com.bridgelabz;

import java.util.Scanner;

public class UserRegistration {
	Scanner sc = new Scanner(System.in);

	public void ValidateFirstName() {
		String expression = "^[A-Z][a-zA-Z]{2,}$";

		System.out.println("Enter the First Name Starting With Capital Letter");
		String firstName = sc.next();

		if (firstName.matches(expression))
			System.out.println("Validation Success");
		else {
			System.out.println("Invalid First Name Try Again With Valid Name");
			ValidateFirstName();
		}

	}

	public void ValidateLastName() {
		String expression = "^[A-Z][a-zA-Z]{2,}$";
		System.out.println("Enter the Last Name");
		String lastName = sc.next();

		if (lastName.matches(expression)) {
			System.out.println("Validation Success");
		} else {
			System.out.println("Try Again With Valid Last Name");
			ValidateLastName();
		}
	}

	public void ValidateEmail() {
		String expression = "^[a-zA-Z0-9]+([.+-_][a-zA-Z0-9]+)*@[a-zA-Z0-9]+.[a-z]{2,4}([.][a-z]{2})*$";

		System.out.println("Enter  Email id :");
		String email = sc.next();

		if (email.matches(expression)) {
			System.out.println("Email Validation Success");
		} else {
			System.out.println("Invalid Email id Try again");
			ValidateEmail();
		}
	}

	public static void main(String[] args) {
		System.out.println("Welcome to User Registration");

		UserRegistration user = new UserRegistration();
		user.ValidateFirstName();
		user.ValidateLastName();
		user.ValidateEmail();
	}
}
