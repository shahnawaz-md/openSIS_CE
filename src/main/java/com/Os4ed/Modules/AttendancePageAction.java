package com.Os4ed.Modules;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.Os4ed.Pages.CreateAttendancePage;
import com.Os4ed.Pages.CreateHomePage;
import com.Os4ed.Test.SelTestCase;
import com.Os4ed.Utils.Log;

public class AttendancePageAction extends SelTestCase {
	
	public static void executeEventsOnAttendancePage() throws InterruptedException {
		Log.info("Events Going to Performed on Attendance Page ");
		
		driver.switchTo().frame("body");
		CreateHomePage.HomePageDetails.attendanceLink.click();
		Thread.sleep(2000);
		Log.info("Clicking on Attendance Tab");
		
		CreateAttendancePage.AttendancePageDetails.setUpLink.click();
		Thread.sleep(1000);
		Log.info("Clicking on Setup Link");
		CreateAttendancePage.AttendancePageDetails.attendanceCodes.click();
		Thread.sleep(1000);
		Log.info("Clicking on Attendance Code Link");
		
		
		// Present
		CreateAttendancePage.AttendancePageDetails.titleTextBox.clear();
		CreateAttendancePage.AttendancePageDetails.titleTextBox.sendKeys("Present");
		Thread.sleep(1000);
		Log.info("Entering Attendance Code Name as Present");
		CreateAttendancePage.AttendancePageDetails.shortNameTextBox.clear();
		CreateAttendancePage.AttendancePageDetails.shortNameTextBox.sendKeys("P");
		Thread.sleep(1000);
		Log.info("Entering Attendance Code Short Name for Present");
		CreateAttendancePage.AttendancePageDetails.sortOrderTextBox.sendKeys("1");
		Thread.sleep(1000);
		Log.info("Entering Attendance Code Sort Order for Present");
		WebElement type1 = CreateAttendancePage.AttendancePageDetails.typeMenuList;
		Select selectAttendanceType = new Select(type1);
		selectAttendanceType.selectByValue("teacher");
		Thread.sleep(1000);
		Log.info("Selecting Attendance Marked By Teachers");
		CreateAttendancePage.AttendancePageDetails.defaultForOfficeTeacherChkx.click();
		Thread.sleep(1000);
		Log.info("Clicking on Default For Office Teacher Checkbox");
		WebElement stateCode1 = CreateAttendancePage.AttendancePageDetails.stateCodeMenuList;
		Select selectStateCode1 = new Select(stateCode1);
		selectStateCode1.selectByValue("P");
		Thread.sleep(1000);
		Log.info("Selecting the Present State Code");
		CreateAttendancePage.AttendancePageDetails.saveButton1.click();
		Thread.sleep(1000);
		Log.info("Clicking on Save Button for Present");
		//Absent
		CreateAttendancePage.AttendancePageDetails.titleTextBox.clear();
		CreateAttendancePage.AttendancePageDetails.titleTextBox.sendKeys("Absent");
		Thread.sleep(1000);
		Log.info("Entering Attendance Code Name as Absent");
		CreateAttendancePage.AttendancePageDetails.shortNameTextBox.clear();
		CreateAttendancePage.AttendancePageDetails.shortNameTextBox.sendKeys("A");
		Thread.sleep(1000);
		Log.info("Entering Attendance Code Short Name for Absent");
		CreateAttendancePage.AttendancePageDetails.sortOrderTextBox.sendKeys("2");
		Thread.sleep(1000);
		Log.info("Entering Attendance Code Sort Order for Absent");
		WebElement type2 = CreateAttendancePage.AttendancePageDetails.typeMenuList;
		Select selectAttendanceType1 = new Select(type2);
		selectAttendanceType1.selectByValue("teacher");
		Thread.sleep(1000);
		Log.info("Selecting Attendance Marked By Teachers");
		//CreateAttendancePage.AttendancePageDetails.defaultForOfficeTeacherChkx.click();
		WebElement stateCode2 = CreateAttendancePage.AttendancePageDetails.stateCodeMenuList;
		Select selectStateCode2 = new Select(stateCode2);
		selectStateCode2.selectByValue("A");
		Thread.sleep(1000);
		Log.info("Selecting the Absent State Code");
		CreateAttendancePage.AttendancePageDetails.saveButton2.click();
		Thread.sleep(1000);
		Log.info("Clicking on Save Button for Absent");
		
		//Half
		CreateAttendancePage.AttendancePageDetails.titleTextBox.clear();
		CreateAttendancePage.AttendancePageDetails.titleTextBox.sendKeys("Half Day");
		Thread.sleep(1000);
		Log.info("Entering Attendance Code Name as Half");
		CreateAttendancePage.AttendancePageDetails.shortNameTextBox.clear();
		CreateAttendancePage.AttendancePageDetails.shortNameTextBox.sendKeys("H");
		Thread.sleep(1000);
		Log.info("Entering Attendance Code Short Name for Half");
		CreateAttendancePage.AttendancePageDetails.sortOrderTextBox.sendKeys("3");
		Thread.sleep(1000);
		Log.info("Entering Attendance Code Sort Order for Half");
		WebElement type3 = CreateAttendancePage.AttendancePageDetails.typeMenuList;
		Select selectAttendanceType2 = new Select(type3);
		selectAttendanceType2.selectByValue("official");
		Thread.sleep(1000);
		Log.info("Selecting Attendance Marked By Office Only");
		//CreateAttendancePage.AttendancePageDetails.defaultForOfficeTeacherChkx.click();
		WebElement stateCode3 = CreateAttendancePage.AttendancePageDetails.stateCodeMenuList;
		Select selectStateCode3 = new Select(stateCode3);
		selectStateCode3.selectByValue("H");
		Thread.sleep(1000);
		Log.info("Selecting the Half State Code");
		CreateAttendancePage.AttendancePageDetails.saveButton2.click();
		Thread.sleep(1000);
		Log.info("Clicking on Save Button for Half");
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("body");
		CreateHomePage.HomePageDetails.homeLink.click();
		Thread.sleep(2000);
		Log.info("Clicking on Home Tab");
		
		driver.switchTo().defaultContent();
		
		
		
		
		
	}

}
