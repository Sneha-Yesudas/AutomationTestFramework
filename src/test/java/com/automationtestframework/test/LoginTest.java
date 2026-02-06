package com.automationtestframework.test;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.automationtestframework.constants.Browser;
import com.automationtestframework.pages.HomePage;
import com.automationtestframework.pojo.User;


@Listeners({com.automationtestframework.listeners.TestListener.class})
public class LoginTest extends TestBase {

	

	

	@Test(description = "to Verify login", dataProvider = "LoginDataProvider", dataProviderClass = com.automationframework.dataprovider.ExcelDataProvider.class)
	public void LoginTest(User user) {
		String afterLoginText = homePage.clickSigunpLogin().doLogin(user.getUsername(), user.getPassword())
				.getTextAfterLogin();
		Assert.assertEquals("Logout", "Logout");
	}
	
	@Test(description = "Check parallel mode for method")
	public void test() {
		assertEquals("false", "true");
	}
	
	

}
