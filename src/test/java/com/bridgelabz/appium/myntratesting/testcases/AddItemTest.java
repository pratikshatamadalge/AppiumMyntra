package com.bridgelabz.appium.myntratesting.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.bridgelabz.appium.myntratesting.base.Base;
import com.bridgelabz.appium.myntratesting.pages.AddItem;

public class AddItemTest extends Base {

	AddItem addItem;

	@BeforeMethod
	public void setUp() {
		initialization();
		addItem = new AddItem();
	}

	@Test
	public void addItemTest() throws InterruptedException {
		addItem.addItem();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}