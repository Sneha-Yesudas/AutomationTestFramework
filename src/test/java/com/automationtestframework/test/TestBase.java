package com.automationtestframework.test;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.automationframework.utilities.BrowserUtilities;
import com.automationframework.utilities.CloudTestingUtility;
import com.automationtestframework.constants.Browser;
import com.automationtestframework.pages.HomePage;

public class TestBase {

	HomePage homePage;
//	boolean isHeadless = true;
//	boolean isCloudTesting = false;

   @Parameters({"browserName","isHeadless","isCloudTesting"})
	@BeforeMethod
	public void setup(ITestResult result, String browserName,boolean isHeadless,boolean isCloudTesting) {
		WebDriver lambdadriver;
		if (isCloudTesting) {
			lambdadriver = CloudTestingUtility.setupCloudConfiguration(result.getMethod().getMethodName(),
					browserName);
			homePage = new HomePage(lambdadriver);
		} else {
			homePage = new HomePage(Browser.valueOf(browserName.toUpperCase()), isHeadless);
		}

	}
    @Parameters({"isCloudTesting"})
	@AfterMethod
	public void closeWindow(boolean isCloudTesting) {

		if (isCloudTesting) {
			CloudTestingUtility.tearDownCloudSession();
		}
	}

	public BrowserUtilities getInstance() {
		return homePage;
	}

}
