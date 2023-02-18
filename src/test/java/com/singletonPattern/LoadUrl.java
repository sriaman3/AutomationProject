package com.singletonPattern;

import org.openqa.selenium.WebDriver;

import com.base.TestBase;

public class LoadUrl {

	public static void main(String[] args) {
		
		  WebDrivers sbc1= WebDrivers.getInstance(); 
		  WebDriver driver1 = sbc1.getDriver(); 
		  driver1.get("https://www.amazon.in");
		  
		  WebDrivers sbc2= WebDrivers.getInstance(); 
		  WebDriver driver2 = sbc2.getDriver(); 
		  driver2.get("https://www.google.com");
		 
		
			
			/*
			 * TestBase tb =new TestBase(); tb.setup();
			 * 
			 * TestBase tb1 =new TestBase(); tb1.setup();
			 */
			 
	}

}
