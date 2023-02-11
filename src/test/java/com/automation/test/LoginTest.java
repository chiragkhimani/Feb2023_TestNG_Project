package com.automation.test;

import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

	@Test(groups = { "Chirag", "Smoke" })
	public void verifyLoginSuccessful() {
		driver.get("https://www.google.com");
		System.out.println("Test - Verify Login Successful");
	}

	@Test(groups = { "Krina", "Smoke" })
	public void verifyLoginUnSuccessfulWithInvalidCredentials() {
		driver.get("https://www.google.com");
		System.out.println("Test - Verify Login UnSuccessful");
	}

	@Test(groups = "HariKrishna")
	public void verifyLoginUnSuccessfulWithBlankCredentials() {
		driver.get("https://www.google.com");
		System.out.println("Test - Verify Login UnSuccessful with Blank Credentials");
	}

}
