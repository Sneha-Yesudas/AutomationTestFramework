package com.automationtestframework.test;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.automationframework.utilities.BrowserUtilities;
import com.automationframework.utilities.CloudeTestingUtility;
import com.automationtestframework.constants.Browser;
import com.automationtestframework.pages.HomePage;

public class TestBase {
	
	HomePage homePage;
	boolean isHeadless=false;
	boolean isCloudTesting=true;

	@BeforeMethod
	public void setup(ITestResult result) {
		WebDriver lambdadriver;
		if(isCloudTesting) {
			lambdadriver=CloudeTestingUtility.setupCloudConfiguration(result.getMethod().getMethodName(), Browser.CHROME);
			homePage=new  HomePage(lambdadriver);
		}
		else {
		homePage = new HomePage(Browser.CHROME,true);
		}
			
	}
	
	
	
	@AfterMethod
	public void closeWindow() {
		
		if(isCloudTesting) {
			CloudeTestingUtility.tearDownCloudSession();
		}
	}
	
	
	public BrowserUtilities getInstance() {
		return homePage;
	}
    
}
