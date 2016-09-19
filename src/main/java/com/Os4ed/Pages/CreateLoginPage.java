package com.Os4ed.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CreateLoginPage {
	
private WebDriver driver;
	
	public CreateLoginPage(WebDriver driver) {
	this.driver = driver;

	}
	
	public static class LoginPageDetails {
		
		@FindBy(how = How.NAME, using = "USERNAME")
		public static WebElement userName;
		
		@FindBy(how = How.NAME, using = "PASSWORD")
		public static WebElement passWord;
		
		@FindBy(how = How.NAME, using = "remember")
		public static WebElement rememberMe;
		
		@FindBy(how = How.NAME, using = "log")
		public static WebElement loginButton;
		
	
	}

}
