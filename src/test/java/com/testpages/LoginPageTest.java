package com.testpages;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.pageObjects.LoginPageObject;
import com.synchronization.PageSynchronization;

public class LoginPageTest extends TestBase{
	
	
	LoginPageObject loginPageObject;
	
	@BeforeClass
	public void initialize() {
		loginPageObject = new LoginPageObject(driver);
	}
	
	@Test
	public void doLogin() throws InterruptedException {
		PageSynchronization.elementToBeClickable(driver, 5, loginPageObject.getLoginButtonOnTopMenu());
		loginPageObject.getLoginButtonOnTopMenu().click();
		Assert.assertEquals(loginPageObject.getWelcomeTextOnLoginPage().getText(), "Welcome, Please Sign In!");
		loginPageObject.getEmail().sendKeys("aman.engg0301@gmail.com");
		loginPageObject.getPassword().sendKeys("Serco@123");
		loginPageObject.getLoginButton().click();
		Thread.sleep(3000);
	}
	

}
