package com.automationframework.utilities;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.automationtestframework.constants.Browser;

public abstract class BrowserUtilities {

	private ThreadLocal<WebDriver> driverLocal = new ThreadLocal<WebDriver>();

	public BrowserUtilities(WebDriver driver) {
		super();
		this.driverLocal.set(driver);
	}

	public BrowserUtilities(Browser browser, boolean isHeadless) {
		if (browser == Browser.CHROME) {
			if (isHeadless) {
				ChromeOptions chromeOptions=new ChromeOptions();
				chromeOptions.addArguments("--headless");
				chromeOptions.addArguments("--window-size=1920,1080");
				driverLocal.set(new ChromeDriver(chromeOptions));

			} else {
				driverLocal.set(new ChromeDriver());
			}

		}

		else {
			System.err.println("Giver proper value of browser");
		}

	}

	public WebDriver getDriver() {
		return driverLocal.get();
	}

	public void maximize() {
		driverLocal.get().manage().window().maximize();
	}

	public void navigateToUrl(String url) {
		driverLocal.get().navigate().to(url);
	}

	public void clickElement(By locator) {
		WebElement element = driverLocal.get().findElement(locator);
		element.click();
	}

	public void sendKeys(By locator, String text) {
		WebElement element = driverLocal.get().findElement(locator);
		element.sendKeys(text);
	}

	public String getText(By locator) {
		WebElement element = driverLocal.get().findElement(locator);
		return element.getText();
	}

	public void closedriver() {
		driverLocal.get().close();
	}

	public String takeScreenshot() {
		TakesScreenshot ts = (TakesScreenshot) driverLocal.get();
		File src = ts.getScreenshotAs(OutputType.FILE);
		DateTimeFormatter datetime = DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss");
		String dateformatter = LocalDateTime.now().format(datetime);
		String path = System.getProperty("user.dir") + "//screenshot//screenshot//" + dateformatter + "//.png";
		File file = new File(path);
		try {
			FileUtils.copyFile(src, file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return path;
	}

}
