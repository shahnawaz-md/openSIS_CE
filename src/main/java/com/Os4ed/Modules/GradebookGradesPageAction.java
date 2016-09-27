package com.Os4ed.Modules;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.Os4ed.Pages.CreateAssignmentPage;
import com.Os4ed.Pages.CreateGradesPage;
import com.Os4ed.Test.SelTestCase;
import com.Os4ed.Utils.Log;

public class GradebookGradesPageAction extends SelTestCase{
	
	public static void executeEventsOnGradebookPage() throws InterruptedException {
	
		Log.info("Events Going to Performed on Gradebook Page");
		
		Actions actions = new Actions(driver);
		WebElement mainMenu = CreateGradesPage.GradesPageDetails.GradeBookLink;
		actions.moveToElement(mainMenu);
		Log.info("Mouse hover to Gradebook");

		WebElement subMenu = CreateGradesPage.GradesPageDetails.enterGrades;
		actions.moveToElement(subMenu);
		actions.click().build().perform();
		Thread.sleep(1000);
		Log.info("Clicking on Grades");
		
		WebElement assignment = CreateAssignmentPage.AssignmentPageDetails.selectAssignment;
		Select selectAssignment = new Select(assignment);
		selectAssignment.selectByValue("8");
		Log.info("Select Assignment Type");
		
		CreateAssignmentPage.AssignmentPageDetails.enterPoints.clear();
		CreateAssignmentPage.AssignmentPageDetails.enterPoints.sendKeys("8");
		Log.info("Enter Points on Assignment");
		CreateAssignmentPage.AssignmentPageDetails.saveButton.click();
		Log.info("Clicking on Save Button");
		
	}

}
