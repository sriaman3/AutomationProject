package com.testpages;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.pageObjects.LandingPageObject;
import com.pageObjects.RegistrationPageObject;

public class LandingPageTest extends TestBase{
	
	
	LandingPageObject landingPageObject;
	RegistrationPageObject registrationPageObject;
	
	@BeforeClass
	public void initialize() {
		landingPageObject = new LandingPageObject(driver);
		registrationPageObject = new RegistrationPageObject(driver);
	}
	
	@Test(priority = 1)
	public void redirectionOnRegisterPage() throws InterruptedException {
		landingPageObject.clickOnRegisterButton();
		Assert.assertEquals(registrationPageObject.getTitleOfTheRegisterPage(), "Register");
		Thread.sleep(2000);
	}
	
}


