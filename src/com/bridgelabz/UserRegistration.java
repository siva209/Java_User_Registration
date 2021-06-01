package com.bridgelabz;

import java.util.Scanner;
import java.util.function.Predicate;

public class UserRegistration {
	Scanner scanner = new Scanner(System.in);
	String firstName;
	String lastName;
	String email;
	String mobileNumber;
	String password;

	public boolean ValidateFirstName(String firstName) throws UserRegistrationException {
		Predicate<String> validCheck = n -> n.matches("^[A-Z][a-z]{2,}$");
		if (validCheck.test(firstName)) {
			return true;
		} else {
			throw new UserRegistrationException("Please Enter Valid First Name");

		}
	}

	public boolean validateLastName(String lastName) throws UserRegistrationException {
		Predicate<String> validCheck = n -> n.matches("^[A-Z][a-z]{2,}$");
		if (validCheck.test(lastName)) {
			return true;
		} else {
			throw new UserRegistrationException("Please Enter Valid last Name");
		}
	}

	public boolean validateEmail(String email) throws UserRegistrationException {
		Predicate<String> validCheck = n -> n
				.matches("^[0-9a-zA-Z]+([.\\-+]?[a-zA-Z0-9]+)?\\@[0-9a-zA-Z]+.[a-zA-Z]{2,4}(.[a-zA-Z]{2,})*$");
		if (validCheck.test(email)) {
			return true;
		} else {
			throw new UserRegistrationException("Please Enter Valid Email_id");
		}
	}

	public boolean validateMobileNumber(String mobileNumber) throws UserRegistrationException {
		Predicate<String> validCheck = n -> n.matches("^([\\+]?91)[6-9]{1}[0-9]{9}$");
		if (validCheck.test(mobileNumber)) {
			return true;
		} else {
			throw new UserRegistrationException("Please Enter Valid Mobile Number");
		}
	}

	public boolean validatePassword(String password) throws UserRegistrationException {
		Predicate<String> validCheck = n -> n
				.matches("^(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*])(?!(?:.*[!@#$%^&*]){2})[a-zA-Z0-9!@#$%^&*]{8,}$");
		if (validCheck.test(password)) {
			return true;
		} else {
			throw new UserRegistrationException("Please Enter Valid Password");
		}
	}

	public void userInput() {
		while (true) {
			System.out.println("Enter the First name :");
			firstName = scanner.next();
			try {
				boolean result = ValidateFirstName(firstName);
				if (result == true) {
					break;
				}
			} catch (UserRegistrationException e) {
				System.out.println(e);
			}
		}
		while (true) {
			System.out.println("Enter the Last name :");
			lastName = scanner.next();
			try {
				boolean result = validateLastName(lastName);
				if (result == true) {
					break;
				}
			} catch (UserRegistrationException e) {
				System.out.println(e);
			}
		}
		while (true) {
			System.out.println("Enter the email id :");
			email = scanner.next();
			try {
				boolean result = validateEmail(email);
				if (result == true) {
					break;
				}
			} catch (UserRegistrationException e) {
				System.out.println(e);
			}
		}
		while (true) {
			System.out.println("Enter the phone number:");
			mobileNumber = scanner.next();
			try {
				boolean result = validateMobileNumber(mobileNumber);
				if (result == true) {
					break;
				}
			} catch (UserRegistrationException e) {
				System.out.println(e);
			}
		}
		while (true) {
			System.out.println("Enter the password:");
			password = scanner.next();
			try {
				boolean result = validatePassword(password);
				if (result == true) {
					break;
				}
			} catch (UserRegistrationException e) {
				System.out.println(e);
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("Welcome to user registration");

		UserRegistration user = new UserRegistration();
		user.userInput();
	}
}
