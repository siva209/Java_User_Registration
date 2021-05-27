package com.bridgelabz;

import static org.junit.Assert.*;

import org.junit.Test;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class ValidateEmailsTest {

	private String email;
	String expectedResult;
	private UserRegistration userEmail;

	public ValidateEmailsTest(String email, String expectedResult) {
		this.email = email;
		this.expectedResult = expectedResult;
	}

	@Before
	public void initialize() {
		userEmail = new UserRegistration();
	}

	@Parameterized.Parameters
	public static Collection input() {
		return Arrays.asList(new Object[][] { { "abc@yahoo.com", "true" }, { "abc-100@yahoo.com", "true" },
				{ "abc.100@yahoo.com", "true" }, { "abc111@abc.com", "true" }, { "abc-100@abc.net", "true" },
				{ "abc.100@abc.com.au", "true" }, { "abc@1.com", "true" }, { "abc@gmail.com.com", "true" },
				{ "abc+100@gmail.com", "true" }, { "abc", "false" }, { "abc@.com.my", "false" },
				{ "abc123@gmail.a", "false" }, { "abc123@.com", "false" }, { "abc123@.com.com", "false" },
				{ ".abc@abc.com", "false" }, { "abc()*@gmail.com", "false" }, { "abc@%*.com", "false" },
				{ "abc..2002@gmail.com", "false" }, { "abc.@gmail.com", "false" }, { "abc@abc@gmail.com", "false" },
				{ "abc@gmail.com.1a", "false" }, { "abc@gmail.com.aa.au", "false" } });
	}

	@Test
	public void testUserEmail() {
		assertEquals(expectedResult, userEmail.validateEmail(email));
	}
}
