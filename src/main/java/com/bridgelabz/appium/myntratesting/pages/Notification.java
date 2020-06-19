package com.bridgelabz.appium.myntratesting.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bridgelabz.appium.myntratesting.base.Base;

public class Notification extends Base {

	@FindBy(xpath = "//android.widget.ImageView[@content-desc='notification']")
	WebElement notifyButton;

	public Notification() {
		PageFactory.initElements(driver, this);
	}

	public void notificationTest() throws InterruptedException {
		Thread.sleep(2000);
		notifyButton.click();
	}

}
