package com.automationtestframework.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.automationframework.utilities.BrowserUtilities;
import com.automationtestframework.constants.Browser;
import com.automationtestframework.pages.HomePage;

public class TestBase {
	
	HomePage homePage;
	@BeforeMethod
	public void setup() {
		homePage = new HomePage(Browser.CHROME);
	}
	
	
	
//	@AfterMethod
//	public void closeWindow() {
//		homePage.closedriver();
//	}
	
	
	public BrowserUtilities getInstance() {
		return homePage;
	}
    
}
