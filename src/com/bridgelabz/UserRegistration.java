package com.bridgelabz;

import java.util.Scanner;

public class UserRegistration {
	Scanner scanner = new Scanner(System.in);
	String firstName;
	String lastName;
	String email;
	String phoneNumber;
	String password;

	public boolean ValidateFirstName(String firstName) {
		String expression = "^[A-Z][a-zA-Z]{2,}$";

		if (firstName.matches(expression)) {
			System.out.println("Valid First name");
			return true;
		} else {
			System.out.println("Invalid First Name Try Again");
			return false;

		}
	}

	public boolean validateLastName(String lastName) {
		String expression = "^[A-Z][a-zA-Z]{2,}$";

		if (lastName.matches(expression)) {
			System.out.println("Valid Last Name");
			return true;
		} else {
			System.out.println("Invalid Last Name Try Again");
			return false;
		}
	}

	public boolean validateEmail(String email) {
		String expression = "^[0-9a-zA-Z]+([.\\-+]?[a-zA-Z0-9]+)?\\@[0-9a-zA-Z]+.[a-zA-Z]{2,4}(.[a-zA-Z]{2,})*$";

		if (email.matches(expression)) {
			System.out.println("Valid Email id");
			return true;
		} else {
			System.out.println("Invalid Email id Try Again");
			return false;
		}
	}

	public boolean validateMobileNumber(String phoneNumber) {
		String expression = "^([\\+]?91)[6-9]{1}[0-9]{9}$";

		if (phoneNumber.matches(expression)) {
			System.out.println("Valid Mobile Number");
			return true;
		} else {
			System.out.println("Invalid Mobile Number");
			return false;
		}
	}

	public boolean validatePassword(String password) {
		String expression = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*])(?!(?:.*[!@#$%^&*]){2})[a-zA-Z0-9!@#$%^&*]{8,}$";

		if (password.matches(expression)) {
			System.out.println("Valid Password");
			return true;
		} else {
			System.out.println("Invalid Password Try Again");
			return false;
		}
	}

	public void userFirstName() {
		System.out.println("Enter the First Name :");
		firstName = scanner.next();
		boolean result = ValidateFirstName(firstName);
		if (result == false) {
			userFirstName();
		}
	}

	public void userLastName() {
		System.out.println("Enter the Last name :");
		lastName = scanner.next();
		boolean result = validateLastName(lastName);
		if (result == false) {
			userLastName();
		}
	}

	public void userEmail() {
		System.out.println("Enter the email id :");
		email = scanner.next();
		boolean result = validateEmail(email);
		if (result == false) {
			userEmail();
		}
	}

	public void userPhoneNumber() {
		System.out.println("Enter the phone number:");
		phoneNumber = scanner.next();
		boolean result = validateMobileNumber(phoneNumber);
		if (result == false) {
			userPhoneNumber();
		}
	}

	public void userPassword() {
		System.out.println("Enter the password:");
		password = scanner.next();
		boolean result = validatePassword(password);
		if (result == false) {
			userPassword();
		}

	}

	public static void main(String[] args) {
		System.out.println("Welcome to user registration");

		UserRegistration user = new UserRegistration();
		user.userFirstName();
        user.userLastName();
        user.userEmail();
        user.userPhoneNumber();
        user.userPassword();
	}
}
