package com.automationtestframework.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Steps {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://automationexercise.com/");
		driver.manage().window().maximize();
		
		By SignupLoginLocator=By.xpath("//a[text()=\" Signup / Login\"]");
		WebElement SignupElement =driver.findElement(SignupLoginLocator);
		SignupElement.click();
		
		
		By LoginEmailLocator=By.xpath("//div[@class=\"login-form\"]//input[@type=\"email\"]");
		WebElement LoginEmailElement=driver.findElement(LoginEmailLocator);
		LoginEmailElement.sendKeys("yedavih656@dnsclick.com");
		
		By LoginPasswordLocator=By.xpath("//input[@type=\"password\"]");
		WebElement LoginPasswordElement=driver.findElement(LoginPasswordLocator);
		LoginPasswordElement.sendKeys("password");
		
		By submitButtonLocator=By.xpath("//div[@class=\"login-form\"]//button[@type=\"submit\"]");
		WebElement submitButtonElement=driver.findElement(submitButtonLocator);
		submitButtonElement.click();
		
		
		

	}

}
