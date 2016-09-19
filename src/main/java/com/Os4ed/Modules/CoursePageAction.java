package com.Os4ed.Modules;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.Os4ed.Pages.CreateCoursePage;
import com.Os4ed.Pages.CreateHomePage;
import com.Os4ed.Pages.CreateSchoolSetupPage;
import com.Os4ed.Test.SelTestCase;
import com.Os4ed.Utils.Log;

public class CoursePageAction extends SelTestCase {
	
	public static void executeEventsOnCoursePage() throws InterruptedException {
		Log.info("Events Going to Performed on Course Page ");
		
		driver.switchTo().frame("body");
		CreateHomePage.HomePageDetails.schoolSetupLink.click();
		Thread.sleep(2000);
		Log.info("Clicking on School Setup Tab");
		
		Actions actions = new Actions(driver);
		WebElement mainMenu = CreateSchoolSetupPage.SchoolSetupPageDetails.courses;
		actions.moveToElement(mainMenu);
		Log.info("Mouse hover to Courses");

		WebElement subMenu = CreateSchoolSetupPage.SchoolSetupPageDetails.courseManager;
		actions.moveToElement(subMenu);
		actions.click().build().perform();
		Thread.sleep(1000);
		Log.info("Clicking on Course Manager");
		
		CreateCoursePage.CoursePageDetails.addSubject.click();
		Thread.sleep(1000);
		Log.info("Clicking on Add Subject symbol");
		CreateCoursePage.CoursePageDetails.subjectTitle.sendKeys("Mathematics");
		Thread.sleep(1000);
		Log.info("Entering Subject Title");
		CreateCoursePage.CoursePageDetails.saveSubjectButton.click();
		Thread.sleep(1000);
		Log.info("Clicking on Subject Save Button");
		CreateCoursePage.CoursePageDetails.addCourse.click();
		Thread.sleep(1000);
		Log.info("Clicking on Add Course symbol");
		CreateCoursePage.CoursePageDetails.courseTitle.sendKeys("Algebra");
		Thread.sleep(1000);
		Log.info("Entering Course Title");
		CreateCoursePage.CoursePageDetails.courseShortName.sendKeys("Alg");
		Thread.sleep(1000);
		Log.info("Entering Course Short Name");
		CreateCoursePage.CoursePageDetails.saveCourseButton.click();
		Thread.sleep(1000);
		Log.info("Clicking on Course Save Button");
		CreateCoursePage.CoursePageDetails.addCoursePeriod.click();
		Thread.sleep(1000);
		Log.info("Clicking on Add Course Period symbol");
		CreateCoursePage.CoursePageDetails.coursePeriodShortName.sendKeys("Alg");
		Thread.sleep(1000);
		Log.info("Entering Course Period Short Name");
		WebElement calendar = CreateCoursePage.CoursePageDetails.selectCalendar;
		Select selectCalendar = new Select(calendar);
		selectCalendar.selectByValue("1");
		Thread.sleep(1000);
		Log.info("Selecting the Calendar from the Drop Down");
		WebElement primaryTeacher = CreateCoursePage.CoursePageDetails.selectPrimaryTeacher;
		Select selectPrimaryTeacher = new Select(primaryTeacher);
		selectPrimaryTeacher.selectByValue("2");
		Thread.sleep(1000);
		Log.info("Slecting the Primary Teacher from the Drop Down");
		CreateCoursePage.CoursePageDetails.enterSeats.sendKeys("20");
		Thread.sleep(1000);
		Log.info("Entering the Number of Seats");
		WebElement gradingScale = CreateCoursePage.CoursePageDetails.selectGradingScale;
		Select selectGradingScale = new Select(gradingScale);
		selectGradingScale.selectByValue("1");
		Thread.sleep(1000);
		Log.info("Selecting the Grading Scale from the Drop Down");
		CreateCoursePage.CoursePageDetails.clickMarkingPeriodRadioButton.click();
		Thread.sleep(1000);
		Log.info("Clicking on Marking Period Radio Button");
		WebElement markingPeriod = CreateCoursePage.CoursePageDetails.selectMarkingPeriod;
		Select selectMarkingPeriod = new Select(markingPeriod);
		selectMarkingPeriod.selectByValue("1");
		Thread.sleep(1000);
		Log.info("Selecting the Marking Period from the Drop Down");
		CreateCoursePage.CoursePageDetails.clickFixedScheduledRadioButton.click();
		Thread.sleep(1000);
		Log.info("Clicking on Fixed Scheduled Radio Button");
		WebElement classRoom = CreateCoursePage.CoursePageDetails.selectClassRoom;
		Select selectClassRoom = new Select(classRoom);
		selectClassRoom.selectByValue("1");
		Thread.sleep(1000);
		Log.info("Selecting the Class Room from the Drop Down");
		WebElement period = CreateCoursePage.CoursePageDetails.selectPeriodFixedType;
		Select selectPeriod = new Select(period);
		selectPeriod.selectByValue("1");
		Thread.sleep(1000);
		Log.info("Selecting Period from the Drop Down");
		CreateCoursePage.CoursePageDetails.chkbxMonday.click();
		Thread.sleep(1000);
		Log.info("Clicking on Monday Check Box");
		CreateCoursePage.CoursePageDetails.chkbxTuesday.click();
		Thread.sleep(1000);
		Log.info("Clicking on Tuesday Check Box");
		CreateCoursePage.CoursePageDetails.chkbxWednesday.click();
		Thread.sleep(1000);
		Log.info("Clicking on Wednesday Check Box");
		CreateCoursePage.CoursePageDetails.chkbxThursday.click();
		Thread.sleep(1000);
		Log.info("Clicking on Thursday Check Box");
		CreateCoursePage.CoursePageDetails.chkbxFriday.click();
		Thread.sleep(1000);
		Log.info("Clicking on Friday Check Box");
		CreateCoursePage.CoursePageDetails.enableChkbxTakesAttendance.click();
		Thread.sleep(1000);
		Log.info("Enabling the Takes Attendance Check Box");
		CreateCoursePage.CoursePageDetails.ChkbxTakesAttendanceFixedType.click();
		Thread.sleep(1000);
		Log.info("Clicking on Takes Attendance Check Box");
		CreateCoursePage.CoursePageDetails.saveCoursePeriodButton.click();
		Thread.sleep(1000);
		Log.info("Clicking on Course Period Save Button");
		
		driver.switchTo().defaultContent();
		
		
	}

}
