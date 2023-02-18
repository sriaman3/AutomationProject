package com.browserStack;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserStack {
	
	WebDriver driver;
	public static final String USERNAME = "amansrivastava_5pFAvm";
	public static final String AUTOMATE_KEY = "yK9gjYsKQMKzqSzzGixf";
	public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
	
	@Test
	public void setup() throws MalformedURLException {
		
		MutableCapabilities capabilities = new MutableCapabilities();
		capabilities.setCapability("browserName", "Chrome");
		HashMap<String, Object> browserstackOptions = new HashMap<String, Object>();
		browserstackOptions.put("os", "Windows");
		browserstackOptions.put("osVersion", "11");
		browserstackOptions.put("browserVersion", "latest");
		browserstackOptions.put("resolution", "1366x768");
		browserstackOptions.put("local", "false");
		browserstackOptions.put("seleniumVersion", "4.0.0");
		capabilities.setCapability("bstack:options", browserstackOptions);
		WebDriver driver = new RemoteWebDriver(new URL(URL), capabilities);
		//WebDriverManager.chromedriver().setup();
		//driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/login?returnUrl=%2Fbooks");
		driver.manage().window().maximize();
		driver.close();
	}

}
