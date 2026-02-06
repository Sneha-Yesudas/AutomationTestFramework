package com.automationtestframework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.automationframework.utilities.BrowserUtilities;
import com.automationtestframework.pojo.User;

public class LoginPage extends BrowserUtilities {

	private static final By LOGINEMAILLOCATOR = By.xpath("//div[@class=\"login-form\"]//input[@type=\"email\"]");
	private static final By LOGINPASSWORDLOCATOR = By.xpath("//input[@type=\"password\"]");
	private static final By SUBMITBUTTONLOCATOR = By.xpath("//div[@class=\"login-form\"]//button[@type=\"submit\"]");

	public LoginPage(WebDriver driver) {
		super(driver);

	}
	
	
	public DashboardPage doLogin(String email,String password ) {
		sendKeys(LOGINEMAILLOCATOR, email);
		sendKeys(LOGINPASSWORDLOCATOR, password);
		clickElement(SUBMITBUTTONLOCATOR);
		DashboardPage dashboardpage=new DashboardPage(getDriver());
		return dashboardpage;
	}

}
