package com.makemytrip.MavenForTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignOn {
	
	@FindBy(linkText = "SIGN-ON")
	private WebElement signOn;
	
	public SignOn(WebDriver x) {
		PageFactory.initElements(x, this);
	}
	
	public WebElement getSignOn() {
		return signOn;
	}

}
