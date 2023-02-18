package com.synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageSynchronization {
	
	public static void implicitWait(WebDriver driver, long seconds) {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
	}
	
	public static WebElement presenceOfElementLocated(WebDriver driver, int time, By element) {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
		 WebElement elemnt = wait.until(ExpectedConditions.presenceOfElementLocated(element));
		 System.out.println(elemnt.getTagName());
		 return elemnt;
	 }
	
	public static WebElement elementToBeClickable(WebDriver driver, int time, WebElement element) {
		
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
		 WebElement elemnt = wait.until(ExpectedConditions.elementToBeClickable(element));
		 return elemnt;
	}

}
