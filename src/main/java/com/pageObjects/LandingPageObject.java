package com.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPageObject {
	
	
	@FindBy(xpath="//*[text()='Register']")
	WebElement registerButton;
	
	@FindBy(xpath="//*[text()='Log in']")
	WebElement loginButton;
	
	public LandingPageObject(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnRegisterButton() {
		registerButton.click();
	}
	
	

}
