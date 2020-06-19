package com.bridgelabz.appium.myntratesting.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.bridgelabz.appium.myntratesting.base.Base;
import com.bridgelabz.appium.myntratesting.pages.Notification;

public class NotificationTest extends Base {

	public Notification notification;

	@BeforeMethod
	public void setUp() {
		initialization();
		notification = new Notification();
	}

	@Test
	public void notification() throws InterruptedException {
		notification.notificationTest();
		Thread.sleep(1000);
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}