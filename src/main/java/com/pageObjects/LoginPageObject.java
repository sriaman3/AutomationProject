package com.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObject {
	
	@FindBy(xpath = "//a[contains(text(),'Log in')]")
	private WebElement loginButtonOnTopMenu;
	
	@FindBy(xpath="//h1[contains(text(),'Welcome, Please Sign In!')]")
	private WebElement welcomeTextOnLoginPage;
	
	@FindBy(xpath="//*[contains(@id,'Email')]")
	private WebElement email;
	
	@FindBy(xpath="//*[contains(@id,'Password')]")
	private WebElement password;
	
	
	@FindBy(xpath="//*[contains(@class,'button-1 login-button')]")
	private WebElement loginButton;
	
	public LoginPageObject(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getLoginButtonOnTopMenu() {
		return loginButtonOnTopMenu;
	}
	
	public WebElement getWelcomeTextOnLoginPage() {
		return welcomeTextOnLoginPage;
	}
	
	public WebElement getEmail() {
		return email;
	}
	
	public WebElement getPassword() {
		return password;
	}
	
	public WebElement getLoginButton() {
		return loginButton;
	}
	
	

}
