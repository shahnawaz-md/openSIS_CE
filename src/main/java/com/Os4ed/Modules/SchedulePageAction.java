package com.Os4ed.Modules;

import java.util.Set;

import com.Os4ed.Pages.CreateHomePage;
import com.Os4ed.Pages.CreateSchedulePage;
import com.Os4ed.Test.SelTestCase;
import com.Os4ed.Utils.Log;

public class SchedulePageAction extends SelTestCase {
	
	public static void executeEventsOnSchedulePage() throws InterruptedException {
		Log.info("Events Going to Performed on Schedule Page ");
		
		driver.switchTo().frame("body");
		CreateHomePage.HomePageDetails.schedulingLink.click();
		Thread.sleep(2000);
		Log.info("Clicking on Scheduling Tab");
		
		/*CreateSchedulePage.SchedulePageDetails.submitButton.click();
		Thread.sleep(1000);
		Log.info("Clicking on Submit Button");*/
		CreateSchedulePage.SchedulePageDetails.StudentSchedulePageDetails.addACourseLink.click();
		Thread.sleep(1000);
		Log.info("Clicking on Add a Course Link");
		
		// Get the handle of parent window
		 String handle = driver.getWindowHandle();
		 
		 // Get all the window handles
		 Set<String> handles = driver.getWindowHandles();
		 
		 // loop through each handle
		 for(String hnd:handles) {
			 
			 // check if the handle is not parent
			 if(!hnd.equals(handles)){
				 driver.switchTo().window(hnd); // change the control to pop up window
			 }
		 }
		// print the title of the child window
		 System.out.println(driver.getTitle());
		 
		 CreateSchedulePage.SchedulePageDetails.StudentSchedulePageDetails.selectCourse.click();
		 Thread.sleep(1000);
		 Log.info("Clicking on Selected Course");
		 CreateSchedulePage.SchedulePageDetails.StudentSchedulePageDetails.selectCoursePeriod.click();
		 Thread.sleep(1000);
		 Log.info("Clicking on Selected Course Period Check Box");
		 CreateSchedulePage.SchedulePageDetails.StudentSchedulePageDetails.doneButton.click();
		 Thread.sleep(1000);
		 Log.info("Clicking on Done Button");
		 
		// Change the control to parent window
		 driver.switchTo().window(handle);
		 Thread.sleep(2000);
		 System.out.println(driver.getTitle());
		 
		 driver.switchTo().frame("body");
		 CreateHomePage.HomePageDetails.schedulingLink.click();
			Thread.sleep(1000);
			Log.info("Clicking on Scheduling Tab");
			
			CreateSchedulePage.SchedulePageDetails.StudentSchedulePageDetails.saveButton.click();
			Thread.sleep(1000);
			Log.info("Clicking on Save Button");
		 
		
	}
}
