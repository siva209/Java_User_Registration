package com.bridgelabz;

import java.util.Scanner;

public class UserRegistration {
	Scanner scanner = new Scanner(System.in);
	String firstName;
	String lastName;
	String email;
	String mobileNumber;
	String password;

	public boolean ValidateFirstName(String firstName) throws UserRegistrationException {
		String expression = "^[A-Z][a-zA-Z]{2,}$";

		if (firstName.matches(expression)) {
			System.out.println("Valid First name");
			return true;
		} else {
			throw new UserRegistrationException("Please Enter Valid First Name");

		}
	}

	public boolean validateLastName(String lastName) throws UserRegistrationException {
		String expression = "^[A-Z][a-zA-Z]{2,}$";

		if (lastName.matches(expression)) {
			System.out.println("Valid Last Name");
			return true;
		} else {
			throw new UserRegistrationException("Please Enter Valid last Name");
		}
	}

	public boolean validateEmail(String email) throws UserRegistrationException {
		String expression = "^[0-9a-zA-Z]+([.\\-+]?[a-zA-Z0-9]+)?\\@[0-9a-zA-Z]+.[a-zA-Z]{2,4}(.[a-zA-Z]{2,})*$";

		if (email.matches(expression)) {
			System.out.println("Valid Email id");
			return true;
		} else {
			throw new UserRegistrationException("Please Enter Valid Email_id");
		}
	}

	public boolean validateMobileNumber(String phoneNumber) throws UserRegistrationException {
		String expression = "^([\\+]?91)[6-9]{1}[0-9]{9}$";

		if (mobileNumber.matches(expression)) {
			System.out.println("Valid Mobile Number");
			return true;
		} else {
			throw new UserRegistrationException("Please Enter Valid Mobile Number");
		}
	}

	public boolean validatePassword(String password) throws UserRegistrationException {
		String expression = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*])(?!(?:.*[!@#$%^&*]){2})[a-zA-Z0-9!@#$%^&*]{8,}$";

		if (password.matches(expression)) {
			System.out.println("Valid Password");
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
				e.printStackTrace();
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
				e.printStackTrace();
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
				e.printStackTrace();
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
				e.printStackTrace();
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
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("Welcome to user registration");

		UserRegistration user = new UserRegistration();
		user.userInput();
	}
}
