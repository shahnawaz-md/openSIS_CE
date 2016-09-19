package com.Os4ed.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CreateHomePage {
	
private WebDriver driver;
	
	public CreateHomePage(WebDriver driver) {
	this.driver = driver;

	}
	
	public static class HomePageDetails {
		
		@FindBy(how = How.XPATH, using = ".//*[@id='cdnavheaderItem1']/span")
		public static WebElement homeLink;
		
		@FindBy(how = How.XPATH, using = ".//*[@id='cdnavheaderItem2']/span")
		public static WebElement schoolSetupLink;
		
		@FindBy(how = How.XPATH, using = ".//*[@id='cdnavheaderItem3']/span")
		public static WebElement studentsLink;
		
		@FindBy(how = How.XPATH, using = ".//*[@id='cdnavheaderItem4']/span")
		public static WebElement usersLink;
		
		@FindBy(how = How.XPATH, using = ".//*[@id='cdnavheaderItem5']/span")
		public static WebElement schedulingLink;
		
		@FindBy(how = How.XPATH, using = ".//*[@id='cdnavheaderItem6']/span")
		public static WebElement gradesLink;
		
		@FindBy(how = How.XPATH, using = ".//*[@id='cdnavheaderItem7']/span")
		public static WebElement attendanceLink;
		
		@FindBy(how = How.XPATH, using = ".//*[@id='cdnavheaderItem8']/span")
		public static WebElement ExtracurricularLink;
		
		@FindBy(how = How.XPATH, using = ".//*[@id='cdnavheaderItem9']/span")
		public static WebElement MessagingLink;
		
		@FindBy(how = How.XPATH, using = ".//*[@id='cdnavheaderItem10']/span")
		public static WebElement ToolsLink;
		

	}

}
