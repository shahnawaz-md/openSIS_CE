package com.Os4ed.Modules;

import com.Os4ed.Pages.CreateHomePage;
import com.Os4ed.Test.SelTestCase;
import com.Os4ed.Utils.Log;

public class HomePageAction extends SelTestCase {
	
	public static void executeEventsOnHomePage() throws InterruptedException {
		Log.info("Events Going to Performed on Home Page ");
		//Enter User Name
		driver.switchTo().frame("body");
		CreateHomePage.HomePageDetails.homeLink.click();
		Thread.sleep(2000);
		
		driver.switchTo().frame("body");
		CreateHomePage.HomePageDetails.schoolSetupLink.click();
		Thread.sleep(2000);
		
		driver.switchTo().frame("body");
		CreateHomePage.HomePageDetails.studentsLink.click();
		Thread.sleep(2000);
		
		driver.switchTo().frame("body");
		CreateHomePage.HomePageDetails.usersLink.click();
		Thread.sleep(2000);
		
		driver.switchTo().frame("body");
		CreateHomePage.HomePageDetails.schedulingLink.click();
		Thread.sleep(2000);
		
		driver.switchTo().frame("body");
		CreateHomePage.HomePageDetails.gradesLink.click();
		Thread.sleep(2000);
		
		driver.switchTo().frame("body");
		CreateHomePage.HomePageDetails.attendanceLink.click();
		Thread.sleep(2000);
		
		driver.switchTo().frame("body");
		CreateHomePage.HomePageDetails.ExtracurricularLink.click();
		Thread.sleep(2000);
		
		driver.switchTo().frame("body");
		CreateHomePage.HomePageDetails.MessagingLink.click();
		Thread.sleep(2000);
		
		driver.switchTo().frame("body");
		CreateHomePage.HomePageDetails.ToolsLink.click();
		Thread.sleep(2000);

	}
}
