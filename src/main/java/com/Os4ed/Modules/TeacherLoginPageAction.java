package com.Os4ed.Modules;

import com.Os4ed.Pages.CreateLoginPage;
import com.Os4ed.Test.SelTestCase;
import com.Os4ed.Utils.Log;

public class TeacherLoginPageAction extends SelTestCase {
	
	public static void executeEventsOnTeacherLoginPage() throws InterruptedException {
		Log.info("Events Going to Performed on Login Page ");
		//Enter User Name 
		CreateLoginPage.LoginPageDetails.userName.clear();
		CreateLoginPage.LoginPageDetails.userName.sendKeys("mitchell");
		Log.info("Entering the Username");
		Thread.sleep(2000);
		
		//Enter Password
		CreateLoginPage.LoginPageDetails.passWord.clear();
		CreateLoginPage.LoginPageDetails.passWord.sendKeys("mitchell@123");
		Log.info("Entering the Password");
		Thread.sleep(2000);
		
		//Click on Remember Me
		CreateLoginPage.LoginPageDetails.rememberMe.click();
		Log.info("Checking the Remember Me textbox");
		Thread.sleep(2000);
		
		//Click on Login Button
		CreateLoginPage.LoginPageDetails.loginButton.click();
		Log.info("Clicking on Login Button");
		Thread.sleep(2000);
		Log.info("Logged in Successfully");
		
	}
}
