package com.bridgelabz.appium.myntratesting.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bridgelabz.appium.myntratesting.base.Base;
/*
 * @author: Pratiksha
 * purpose: appium Login automation script for Myntra application
 */
public class Login extends Base {

	@FindBy(xpath = "//android.view.ViewGroup[@content-desc='leftElement']/android.widget.TextView")
	WebElement hamburgermenu;

	@FindBy(xpath = "//android.widget.ImageView[@content-desc='search']")
	WebElement search;

	@FindBy(xpath = "//android.widget.ImageView[@content-desc='wishlist']\n")
	WebElement wishListIcon;

	@FindBy(xpath = "\t\n"
			+ "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup")
	WebElement roadester;

	@FindBy(xpath = "//android.widget.EditText[@content-desc='search_default_search_text_input']")
	WebElement searchItem;

	@FindBy(xpath = "//android.widget.EditText[@content-desc='mobile']")
	WebElement mbnumber;

	@FindBy(xpath = "//android.view.ViewGroup[@content-desc='form-button']")
	WebElement continue_for_login;

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[7]")
	WebElement profile_Button;

	@FindBy(xpath = "//android.widget.ImageView[@content-desc='bag']")
	WebElement bagIcon;

	@FindBy(xpath = "//android.widget.Button[@content-desc='tabButton_categories']/android.widget.ImageView")
	WebElement categoriesIcon;

	@FindBy(xpath = "//android.widget.Button[@content-desc='tabButton_studio']")
	WebElement studioIcon;

	@FindBy(xpath = "//android.widget.Button[@content-desc='tabButton_more']")
	WebElement exploreIcon;

	public Login() {

		PageFactory.initElements(driver, this);
	}

	public void loginProfileTest() throws InterruptedException {
		Thread.sleep(1000);
		hamburgermenu.click();
		Thread.sleep(1000);
		profile_Button.click();
		Thread.sleep(1000);
		mbnumber.sendKeys(property.getProperty("MB_NUMBER"));
		Thread.sleep(2000);
		continue_for_login.click();
		Thread.sleep(3000);
	}

	public void wishListTest() throws InterruptedException {
		Thread.sleep(3000);
		wishListIcon.click();
		Thread.sleep(3000);
		mbnumber.sendKeys(property.getProperty("MB_NUMBER"));
		Thread.sleep(1000);
		continue_for_login.click();
		Thread.sleep(3000);
	}

	public void searchItemTest() throws InterruptedException {
		Thread.sleep(2000);
		search.click();
		Thread.sleep(2000);
		searchItem.sendKeys(property.getProperty("ITEM"));
		Thread.sleep(3000);
		roadester.click();
		Thread.sleep(3000);

	}

	public void bagItems() {
		bagIcon.click();

	}

	public void categories() throws InterruptedException {
		categoriesIcon.click();
		Thread.sleep(3000);
	}

	public void studio() {
		studioIcon.click();

	}

	public void explore() throws InterruptedException {

		exploreIcon.click();
		Thread.sleep(1000);
	}

}
