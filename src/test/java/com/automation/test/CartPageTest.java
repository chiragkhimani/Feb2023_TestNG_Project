package com.automation.test;

import org.testng.annotations.Test;

public class CartPageTest extends BaseTest {

	@Test(groups = {"Chirag", "Smoke"})
	public void verifyUserCanAddItemIntoCart() {
		driver.get("https://www.ebay.com");
		System.out.println("Test - Verify user can add item into cart");
	}

	@Test(groups = "Chirag")
	public void verifyUserCanChangeQuanityOfItem() {
		driver.get("https://www.ebay.com");
		System.out.println("Test - Verify user can change quantity of item");
	}

	@Test(groups = {"Chirag", "Smoke"})
	public void verifyUserCanRemoveItemFromCart() {
		driver.get("https://www.ebay.com");
		System.out.println("Test - Verify user can remove item from cart");
	}

}
