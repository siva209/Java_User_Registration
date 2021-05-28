package com.bridgelabz;


import org.junit.Test;
import org.junit.Assert;


public class UserRegistrationTest {

	@Test
	public void givenFirstName_WhenValid_ShouldReturnTrue() {
		UserRegistration userValidator = new UserRegistration();
		try {
			Assert.assertTrue(userValidator.ValidateFirstName("Rahul"));
		} catch (UserRegistrationException e) {
		}
	}

	@Test
	public void givenFirstName_WhenInvalid_ShouldReturnFalse() {
		UserRegistration userValidator = new UserRegistration();
		try {
			userValidator.ValidateFirstName("sk");
		} catch (UserRegistrationException e) {
			Assert.assertEquals("Please enter a valid first name", e.getMessage());
		}
	}

	@Test
	public void givenLastName_WhenValid_ShouldReturnTrue() {
		UserRegistration userValidator = new UserRegistration();
		try {
			Assert.assertTrue(userValidator.validateLastName("Rakesh"));
		} catch (UserRegistrationException e) {
		}
	}

	@Test
	public void givenLastName_WhenInvalid_ShouldReturnFalse() {
		UserRegistration userValidator = new UserRegistration();
		try {
			userValidator.validateLastName("sk");
		} catch (UserRegistrationException e) {
			Assert.assertEquals("Please enter a valid last name", e.getMessage());
		}
	}

	@Test
	public void givenEmailAddress_WhenValid_ShouldReturnTrue() {
		UserRegistration userValidator = new UserRegistration();
		try {
			Assert.assertTrue(userValidator.validateEmail("rahulsk@gmail.com"));
		} catch (UserRegistrationException e) {
		}
	}

	@Test
	public void givenEmailAddress_WhenInvalid_ShouldReturnTrue() {
		UserRegistration userValidator = new UserRegistration();
		try {
			userValidator.validateEmail("xyz)*@gmail.com");
		} catch (UserRegistrationException e) {
			Assert.assertEquals("Please enter a valid email id", e.getMessage());
		}
	}

	@Test
	public void givenPhoneNumber_WhenValid_ShouldReturnTrue() {
		UserRegistration userValidator = new UserRegistration();
		try {
			Assert.assertTrue(userValidator.validateMobileNumber("919898989898"));
		} catch (UserRegistrationException e) {
		}
	}

	@Test
	public void givenPhoneNumber_WhenInvalid_ShouldReturnFalse() {
		UserRegistration userValidator = new UserRegistration();
		try {
			userValidator.validateMobileNumber("989898");
		} catch (UserRegistrationException e) {
			Assert.assertEquals("Please enter a valid phone number", e.getMessage());
		}
	}

	@Test
	public void givenPassword_WhenValid_ShouldReturnTrue() {
		UserRegistration userValidator = new UserRegistration();
		try {
			Assert.assertTrue(userValidator.validatePassword("Rahul@123"));
		} catch (UserRegistrationException e) {
		}
	}

	@Test
	public void givenPassword_WhenInvalid_ShouldReturnFalse() {
		UserRegistration userValidator = new UserRegistration();
		try {
			userValidator.validatePassword("rahul@$94");
		} catch (UserRegistrationException e) {
			Assert.assertEquals("Please enter a valid password", e.getMessage());
		}
	}
}
