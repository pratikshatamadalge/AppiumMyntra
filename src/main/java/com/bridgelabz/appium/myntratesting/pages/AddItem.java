package com.bridgelabz.appium.myntratesting.pages;

import java.util.List;

import org.openqa.selenium.support.PageFactory;

import com.bridgelabz.appium.myntratesting.base.Base;

import io.appium.java_client.MobileElement;
/*
 * @author: Pratiksha
 * purpose: appium add item automation script for Myntra application
 */
public class AddItem extends Base {

	public AddItem() {
		PageFactory.initElements(driver, this);
	}

	public void addItem() throws InterruptedException {
		Thread.sleep(2000);
		List<MobileElement> elements = driver.findElementsByClassName("android.view.ViewGroup");
		elements.get(0).click();
		Thread.sleep(1000);
		List<MobileElement> elements1 = driver.findElementsByClassName("android.widget.ImageView");
		elements1.get(3).click();
		Thread.sleep(1000);
		List<MobileElement> elements2 = driver.findElementsByClassName("android.widget.TextView");
		elements1.get(7).click();
		Thread.sleep(1000);
		MobileElement addTobag = driver.findElementByXPath("//android.widget.TextView[@text='ADD TO BAG']");
		System.out.println(addTobag);
		addTobag.click();
		Thread.sleep(1000);
		MobileElement wishlist = driver.findElementByXPath("//android.widget.TextView[@text='WISHLIST']");
		wishlist.click();
		System.out.println(wishlist);
		Thread.sleep(5000);

	}

}