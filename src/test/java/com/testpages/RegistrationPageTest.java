package com.testpages;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.pageObjects.LandingPageObject;
import com.pageObjects.RegistrationPageObject;
import com.synchronization.PageSynchronization;

public class RegistrationPageTest extends TestBase {
	

	LandingPageObject landingPageObjects;
	RegistrationPageObject registrationPageObjects;
	
	@BeforeTest
	public void initialize() {
		landingPageObjects = new LandingPageObject(driver);
		registrationPageObjects = new RegistrationPageObject(driver);
	}
	
	@Test(priority = 2)
	public void registrationFromWithValidData() throws Exception {
		landingPageObjects.clickOnRegisterButton();
		WebElement element = PageSynchronization.elementToBeClickable(driver, 10, registrationPageObjects.genderMale);
		if(element.isEnabled()) {
			registrationPageObjects.fillRegistrationForm("Aman", "Sri", "aman.engg0301@gmail.com", "Serco@123", "Serco@123");
		}
		else {
			throw new Exception("Webelement is not found" + element);
		}
	}

}
