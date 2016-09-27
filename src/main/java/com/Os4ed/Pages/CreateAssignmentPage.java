package com.Os4ed.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CreateAssignmentPage {
	
	private WebDriver driver;
	
	public CreateAssignmentPage(WebDriver driver){
		this.driver = driver;
	}
	
	
	public static class AssignmentPageDetails {
		
		@FindBy(how = How.XPATH, using = ".//*[@id='content']/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/a/img")
		public static WebElement addAssignmentType;
		
		@FindBy(how = How.ID, using = "tables[new][TITLE]")
		public static WebElement newAssignmentType;
		
		@FindBy(how = How.XPATH, using = ".//*[@id='content']/table/tbody/tr/td/form/table[1]/tbody/tr/td[2]/b/input")
		public static WebElement saveAssignmentType;
		
		@FindBy(how = How.XPATH, using = ".//*[@id='update_panel']/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr/td/a/img")
		public static WebElement addAssignment;
		
		@FindBy(how = How.ID, using = "tables[new][TITLE]")
		public static WebElement newAssignmentTitle;
		
		@FindBy(how = How.ID, using = "tables[new][POINTS]")
		public static WebElement assignmentPoints;
		
		@FindBy(how = How.XPATH, using = ".//*[@id='content']/table/tbody/tr/td/form/table[2]/tbody/tr[2]/td[1]/table/tbody/tr/td[3]/a/img")
		public static WebElement assignedCalendar;
		
		@FindBy(how = How.XPATH, using = "html/body/div/table/tbody/tr[2]/th[2]/select[2]")
		public static WebElement selectAssignedCalendarYear;
		
		@FindBy(how = How.NAME, using = "calendar-month")
		public static WebElement selectAssignedCalendarMonth;
		
		@FindBy(how = How.XPATH, using = "html/body/div/table/tbody/tr[4]/td[5]/a")
		public static WebElement selectAssignedCalendarDay;
		
		@FindBy(how = How.XPATH, using = ".//*[@id='content']/table/tbody/tr/td/form/table[2]/tbody/tr[2]/td[2]/table/tbody/tr/td[3]/a/img")
		public static WebElement dueCalendar;
		
		@FindBy(how = How.XPATH, using = "html/body/div/table/tbody/tr[2]/th[2]/select[2]")
		public static WebElement selectDueCalendarYear;
		
		@FindBy(how = How.NAME, using = "calendar-month")
		public static WebElement selectDueCalendarMonth;
		
		@FindBy(how = How.XPATH, using = "html/body/div/table/tbody/tr[8]/td[6]/a")
		public static WebElement selectDueCalendarDay;
		
		@FindBy(how = How.XPATH, using = ".//*[@id='content']/table/tbody/tr/td/form/table[1]/tbody/tr/td[2]/b/input")
		public static WebElement saveAssignment;
		
		@FindBy(how = How.XPATH, using = ".//*[@id='content']/table/tbody/tr/td/form/table/tbody/tr[1]/td[1]/font/b/select")
		public static WebElement selectAssignment;
		
		@FindBy(how = How.ID, using = "values[1][8][POINTS]")
		public static WebElement enterPoints;
		
		@FindBy(how = How.CLASS_NAME, using = "btn_medium")
		public static WebElement saveButton;


	
		
		
	}

}
