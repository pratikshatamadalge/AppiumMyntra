package com.bridgelabz.appium.myntratesting.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Base {
	public static AppiumDriver<MobileElement> driver;
	public static DesiredCapabilities desiredCapabilities;
	public static URL url;
	public static Properties property;

	public Base() {
		property = new Properties();
		FileInputStream fis;
		try {
			fis = new FileInputStream(
					"F:\\eclipsespace\\myntratesting\\src\\main\\java\\com\\bridgelabz\\appium\\myntratesting\\config\\config.properties");
			property.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void initialization() {
		desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,
				property.getProperty("AUTOMATION_NAME"));
		desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, property.getProperty("PLATFORM_NAME"));
		desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,
				property.getProperty("PLATFORM_VERSION"));
		desiredCapabilities.setCapability(MobileCapabilityType.UDID, property.getProperty("UDID"));
		desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, property.getProperty("DEVICE_NAME"));
		desiredCapabilities.setCapability("appPackage", property.getProperty("APP_PACKAGE"));
		desiredCapabilities.setCapability("appActivity", property.getProperty("APP_ACTIVITY"));
		desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, property.getProperty("UI_AUTOMATOR"));

		try {
			url = new URL("http://127.0.0.1:4723/wd/hub");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		driver = new AppiumDriver<MobileElement>(url, desiredCapabilities);
	}
}
