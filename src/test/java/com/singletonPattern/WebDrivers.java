package com.singletonPattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDrivers {
	
	/*
	 * When we develop a class in such a way that it can have only instance at any time, is called Singleton design pattern.
	 * It is very useful when you need to use same object of a class across all classes or framework. 
	 * Singleton class must return the same instance again, if it is instantiated again.
	 */
	
	
	/*
	 * When you run below program, you will see browser will be launched and url will be opened in same browser. 
	 * We have instantiated two instance of class WebDrivers, but both give the same instance of driver.
	 */
	private static WebDrivers drivers;
	
	private WebDriver driver;
	
	private WebDrivers() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
	public static WebDrivers getInstance() {
		
		if(drivers == null) {
			drivers = new WebDrivers();
		}
		return drivers;
	}

	public WebDriver getDriver() {
		return driver;
	}
}


