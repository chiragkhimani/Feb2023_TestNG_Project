package com.automation.test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenTesting {

	@Test(dataProvider = "validAmount")
	public void verifyTransactionWithValidAmount(double amont) {
		System.out.println("Validating with amount " + amont);
	}
	
	@Test(dataProvider = "invalidAmount")
	public void verifyTransactionWithInvalidAmount(double amont) {
		System.out.println("Validating with amount " + amont);
	}

	@DataProvider(name = "validAmount")
	public Object[] getValidData() {
		Object[] listOfAmount = { 1, 100, 99.99, 1.0001, 45 };
		return listOfAmount;
	}

	@DataProvider(name = "invalidAmount")
	public Object[] getInvalidData() {
		Object[] listOfAmount = { 101, 0, -10, 100.01, 9.99 };
		return listOfAmount;
	}

}
