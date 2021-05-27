package com.bridgelabz;


import org.junit.Test;
import org.junit.Assert;


public class UserRegistrationTest {

	@Test
	public void givenFirstName_WhenValid_ShouldReturnTrue() {
		UserRegistration userValidator = new UserRegistration();
		boolean result = userValidator.ValidateFirstName("Rahul");
		Assert.assertTrue(result);
	}

	@Test
	public void givenFirstName_WhenInvalid_ShouldReturnFalse() {
		UserRegistration userValidator = new UserRegistration();
		boolean result = userValidator.ValidateFirstName("sk");
		Assert.assertFalse(result);
	}

	@Test
	public void givenLastName_WhenValid_ShouldReturnTrue() {
		UserRegistration userValidator = new UserRegistration();
		boolean result = userValidator.validateLastName("Rakesh");
		Assert.assertTrue(result);
	}

	@Test
	public void givenLastName_WhenInvalid_ShouldReturnFalse() {
		UserRegistration userValidator = new UserRegistration();
		boolean result = userValidator.validateLastName("sk");
		Assert.assertFalse(result);
	}

	@Test
	public void givenEmailAddress_WhenValid_ShouldReturnTrue() {
		UserRegistration userValidator = new UserRegistration();
		boolean result = userValidator.validateEmail("rahul@gmail.com");
		Assert.assertTrue(result);
	}

	@Test
	public void givenEmailAddress_WhenInvalid_ShouldReturnTrue() {
		UserRegistration userValidator = new UserRegistration();
		boolean result = userValidator.validateEmail("xyz.@gmail.com");
		Assert.assertFalse(result);
	}

	@Test
	public void givenPhoneNumber_WhenValid_ShouldReturnTrue() {
		UserRegistration userValidator = new UserRegistration();
		boolean result = userValidator.validateMobileNumber("919898989898");
		Assert.assertTrue(result);
	}

	@Test
	public void givenPhoneNumber_WhenInvalid_ShouldReturnFalse() {
		UserRegistration userValidator = new UserRegistration();
		boolean result = userValidator.validateMobileNumber("989898");
		Assert.assertFalse(result);
	}

	@Test
	public void givenPassword_WhenValid_ShouldReturnTrue() {
		UserRegistration userValidator = new UserRegistration();
		boolean result = userValidator.validatePassword("Rahul@123");
		Assert.assertTrue(result);
	}

	@Test
	public void givenPassword_WhenInvalid_ShouldReturnTrue() {
		UserRegistration userValidator = new UserRegistration();
		boolean result = userValidator.validatePassword("Rahul@sk");
		Assert.assertFalse(result);
	}
}
