package com.automation.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertExample {

	@Test
	public void verifyAmount() {
		int actualAmount = 45;
		int expectedAmount = 46;

//		System.out.println("statement 1");
//		Assert.assertEquals(actualAmount, expectedAmount);
//		System.out.println("statement 2");
		
		SoftAssert softAssert = new SoftAssert();
		System.out.println("statement 1");
		softAssert.assertEquals(actualAmount, expectedAmount);
		System.out.println("statement 2");
		softAssert.assertAll();
	}

}
