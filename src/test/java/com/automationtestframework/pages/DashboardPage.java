package com.automationtestframework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.automationframework.utilities.BrowserUtilities;

public class DashboardPage extends BrowserUtilities {

	private static final By VERIFYLOGINLOCATOR = By.xpath("//a[contains(text(),\"Logout\")]");

	public DashboardPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	

	public String getTextAfterLogin() {
		return getText(VERIFYLOGINLOCATOR);
	}

}
