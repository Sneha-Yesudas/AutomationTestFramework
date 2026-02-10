package com.automationframework.utilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.automationtestframework.constants.Browser;

public class CloudTestingUtility {

	private static final String HUBURL = "https://hub.lambdatest.com/wd/hub";
	private static ThreadLocal<WebDriver>  driverlocal=new ThreadLocal<WebDriver>();
	private static ThreadLocal<DesiredCapabilities>  desiredCapabilitieslocal=new ThreadLocal<DesiredCapabilities>();
	
	
	public static WebDriver setupCloudConfiguration(String testName,String browser) {
		DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("browserName", browser);
        capabilities.setCapability("browserVersion", "latest");
        Map<String, Object> ltOptions = new HashMap<String, Object>();
        ltOptions.put("user", "snehamary575");
        ltOptions.put("accessKey", "LT_0wyK2Yun8crQYJcvxTHUovfKVv1KrISz62BZ1PVaFvBcXZK");
        String buildTime = LocalDateTime.now()
                .format(DateTimeFormatter.ofPattern("ddMMyy_hh"));
        ltOptions.put("build", "Selenium 4 -" + buildTime);
        ltOptions.put("name", testName);
        ltOptions.put("platformName", "Windows 10");
        ltOptions.put("seCdp", true);
        ltOptions.put("selenium_version", "latest");
        capabilities.setCapability("LT:Options", ltOptions);
        desiredCapabilitieslocal.set(capabilities);
        WebDriver driver = null;
        try {
			driver = new RemoteWebDriver(new URL(HUBURL), capabilities);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        driverlocal.set(driver);
        return driverlocal.get();
	}
	
	
	public static void tearDownCloudSession() {
		driverlocal.get().quit();
	}

}
