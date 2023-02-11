package com.automation.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyAndPriorityTest {

	@Test(groups = { "Chirag", "Smoke" }, priority = 1, dependsOnMethods = "atestMethod2")
	public void testMethod1() {
		System.out.println("Test Method 1");
	}

	@Test(groups = { "Krina", "Smoke" }, priority = 3)
	public void atestMethod2() {
		Assert.assertEquals(true, true, "Test Failed because comparision got failed");
		Assert.assertTrue(2 > 3, "Test Failed because comparision got failed");
	}

	@Test(groups = "HariKrishna", priority = 2)
	public void testMethod3() {
		System.out.println("Test Method 3");
	}
}
