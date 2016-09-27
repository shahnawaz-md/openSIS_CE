package com.Os4ed.Modules;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.Os4ed.Pages.CreateAssignmentPage;
import com.Os4ed.Pages.CreateGradesPage;
import com.Os4ed.Pages.CreateHomePage;
import com.Os4ed.Test.SelTestCase;
import com.Os4ed.Utils.Log;

public class AssignmentPageAction extends SelTestCase {
	
	public static void executeEventsOnAssignmentPage() throws InterruptedException {
		Log.info("Events Going to Performed on Assignment Page");
		
		driver.switchTo().frame("body");
		CreateHomePage.HomePageDetails.gradesLink.click();
		CreateGradesPage.GradesPageDetails.GradeBookLink.click();
		
		Actions actions = new Actions(driver);
		WebElement mainMenu = CreateGradesPage.GradesPageDetails.GradeBookLink;
		actions.moveToElement(mainMenu);
		Log.info("Mouse hover to Gradebook");

		WebElement subMenu = CreateGradesPage.GradesPageDetails.setupAssignments;
		actions.moveToElement(subMenu);
		actions.click().build().perform();
		Thread.sleep(1000);
		Log.info("Clicking on Assignment");
		
		CreateAssignmentPage.AssignmentPageDetails.addAssignmentType.click();
		CreateAssignmentPage.AssignmentPageDetails.newAssignmentType.clear();
		CreateAssignmentPage.AssignmentPageDetails.newAssignmentType.sendKeys("Class Test");
		CreateAssignmentPage.AssignmentPageDetails.saveAssignmentType.click();
		Thread.sleep(1000);
		CreateAssignmentPage.AssignmentPageDetails.addAssignment.click();
		CreateAssignmentPage.AssignmentPageDetails.newAssignmentTitle.clear();
		CreateAssignmentPage.AssignmentPageDetails.newAssignmentTitle.sendKeys("Test");
		CreateAssignmentPage.AssignmentPageDetails.assignmentPoints.sendKeys("10");
		CreateAssignmentPage.AssignmentPageDetails.assignedCalendar.click();
		
		//Assigned Date
		WebElement assignedYear = CreateAssignmentPage.AssignmentPageDetails.selectAssignedCalendarYear;
		Select selectAssignedYear = new Select(assignedYear);
		selectAssignedYear.selectByValue("2016");
		WebElement assignedMonth = CreateAssignmentPage.AssignmentPageDetails.selectAssignedCalendarMonth;
		Select selectAssignedMonth = new Select(assignedMonth);
		selectAssignedMonth.selectByValue("8");
		CreateAssignmentPage.AssignmentPageDetails.selectAssignedCalendarDay.click();
		Thread.sleep(1000);
		CreateAssignmentPage.AssignmentPageDetails.dueCalendar.click();
		
		//Due Date
		WebElement dueYear = CreateAssignmentPage.AssignmentPageDetails.selectDueCalendarYear;
		Select selectDueYear = new Select(dueYear);
		selectDueYear.selectByValue("2016");
		WebElement dueMonth = CreateAssignmentPage.AssignmentPageDetails.selectDueCalendarMonth;
		Select selectDueMonth = new Select(dueMonth);
		selectDueMonth.selectByValue("8");
		CreateAssignmentPage.AssignmentPageDetails.selectDueCalendarDay.click();
		
		CreateAssignmentPage.AssignmentPageDetails.saveAssignment.click();
		Thread.sleep(1000);
		
	}

}
