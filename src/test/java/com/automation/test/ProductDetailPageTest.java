package com.automation.test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ProductDetailPageTest extends BaseTest {
	
	@Parameters("browser")
	@Test(groups = { "Priya", "Smoke" })
	public void verifyPriceOnProductDetailPage(String browser) {
		driver.get("https://www.facebook.com");
		System.out.println("Test - Verify Price on Product details page");
		System.out.println(browser);
	}
	
	
	

	@Test(groups = "Priya")
	public void verifyStockInformation() {
		driver.get("https://www.facebook.com");
		System.out.println("Test - Verify Stock Information on Product details page");
	}

}
