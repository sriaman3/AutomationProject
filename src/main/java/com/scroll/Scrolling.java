package com.scroll;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Scrolling {
	
	JavascriptExecutor jse;
	
	public Scrolling(WebDriver driver){
		 jse = (JavascriptExecutor)driver;
	}
	
	public void scrollToSpecificWebElement(WebElement element) {
		jse.executeScript("arguments[0].scrollIntoView();", element);
	}
	
	public void scrollWithIndex() {
		jse.executeScript("window.scrollBy(0,200)");
	}
	
	public void scrollToEndOfThePage() {
		jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}

}
