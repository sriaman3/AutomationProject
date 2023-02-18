package com.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.scroll.Scrolling;

public class RegistrationPageObject {
	
	Scrolling scroll;
	
	@FindBy(xpath="//*[text()='Male']")
	public WebElement genderMale;
	
	@FindBy(xpath="//*[text()='Female']")
	WebElement genderFemale;
	
	@FindBy(xpath="//*[@id='FirstName']")
	WebElement firstName;
	
	@FindBy(xpath="//*[@id='LastName']")
	WebElement lastName;
	
	@FindBy(xpath="//*[@id='Email']")
	WebElement email;
	
	@FindBy(xpath="//*[@id='Password']")
	WebElement password;
	
	@FindBy(xpath="//*[@id='ConfirmPassword']")
	WebElement confirmPassword;
	
	@FindBy(xpath="//*[@id='register-button']")
	WebElement registerButton;
	
	@FindBy(xpath="//div[@class='page-title']/child::h1")
	WebElement registerPageTitle;
	
	public RegistrationPageObject(WebDriver driver) {
		PageFactory.initElements(driver, this);
		scroll = new Scrolling(driver);
	}
	
	public String getTitleOfTheRegisterPage() {
		 String title = registerPageTitle.getText();
		 return title;
	}

	public void fillRegistrationForm(String fN, String lN, String email, String pass, String confPass) throws InterruptedException {
		genderMale.click();
		firstName.sendKeys(fN);
		lastName.sendKeys(lN);
		this.email.sendKeys(email);
		Thread.sleep(2000);
		scroll.scrollToEndOfThePage();
		Thread.sleep(2000);
		password.sendKeys(pass);
		confirmPassword.sendKeys(confPass);
		registerButton.click();
	}

}
