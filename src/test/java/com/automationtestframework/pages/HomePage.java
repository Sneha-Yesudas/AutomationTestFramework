package com.automationtestframework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.automationframework.utilities.BrowserUtilities;
import com.automationframework.utilities.ReadPropertyFile;
import com.automationtestframework.constants.Browser;
import com.automationtestframework.constants.Env;

public final class HomePage extends BrowserUtilities {

	public HomePage(WebDriver driver) {
		super(driver);		
//     	navigateToUrl(ReadPropertyFile.ReadPropertyFile(Env.QA));
//		maximize();
	}
	
	public HomePage(Browser browser,boolean isHeadless) {
		super(browser,isHeadless);		
     	navigateToUrl(ReadPropertyFile.ReadPropertyFile(Env.QA));
		maximize();
	}

	private static final By SIGNUPLOGINLOCATOR = By.xpath("//a[contains(text(),\"Signup\")]");

	public LoginPage clickSigunpLogin() {
		clickElement(SIGNUPLOGINLOCATOR);
		LoginPage loginPage=new LoginPage(getDriver());
		return loginPage;
	}

}
