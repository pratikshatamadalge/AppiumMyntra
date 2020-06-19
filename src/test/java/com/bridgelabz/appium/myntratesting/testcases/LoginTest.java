package com.bridgelabz.appium.myntratesting.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.bridgelabz.appium.myntratesting.base.Base;
import com.bridgelabz.appium.myntratesting.pages.Login;

public class LoginTest extends Base {
	public Login login;

	@BeforeMethod
	public void setUp() {
		initialization();
		login = new Login();

	}

	@Test(priority = 1)
	public void LoginProfile() throws InterruptedException {
		login.loginProfileTest();
	}

	@Test(priority = 2)
	public void wishListTest() throws InterruptedException {
		login.wishListTest();
	}

	@Test(priority = 3)
	public void searchItemTest() throws InterruptedException {
		login.searchItemTest();
	}

	@Test(priority = 4)
	public void categoriesTest() throws InterruptedException {
		login.categories();
	}

	@Test(priority = 5)
	public void studioTest() {
		login.studio();
	}

	@Test(priority = 6)
	public void exploreTest() throws InterruptedException {
		login.explore();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}