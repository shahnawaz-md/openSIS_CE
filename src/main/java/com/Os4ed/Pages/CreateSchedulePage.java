package com.Os4ed.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CreateSchedulePage {
	
	private WebDriver driver;
	
	public CreateSchedulePage(WebDriver driver) {
		
		this.driver = driver;
	}
	
	public static class SchedulePageDetails {
		
		@FindBy(how=How.XPATH, using = ".//*[@id='submenu_5']/a[1]")
		public static WebElement studentScheduleTab;
		
		@FindBy(how=How.XPATH, using = ".//*[@id='submenu_5']/a[2]")
		public static WebElement viewScheduleTab;
		
		@FindBy(how=How.XPATH, using = ".//*[@id='submenu_5']/a[3]")
		public static WebElement studentRequestsTab;
		
		@FindBy(how=How.XPATH, using = ".//*[@id='submenu_5']/a[4]")
		public static WebElement groupScheduleTab;
		
		@FindBy(how=How.XPATH, using = ".//*[@id='submenu_5']/a[5]")
		public static WebElement groupRequestsTab;
		
		@FindBy(how=How.XPATH, using = ".//*[@id='submenu_5']/a[6]")
		public static WebElement groupDropsTab;
		
		@FindBy(how=How.XPATH, using = ".//*[@id='mm_scheduling_1']/b")
		public static WebElement reportsTab;
		
		@FindBy(how=How.XPATH, using = ".//*[@id='menu_child_scheduling_1']/a[1]")
		public static WebElement printSchedulesTab;
		
		@FindBy(how=How.XPATH, using = ".//*[@id='menu_child_scheduling_1']/a[2]")
		public static WebElement printClassListsTab;
		
		@FindBy(how=How.XPATH, using = ".//*[@id='menu_child_scheduling_1']/a[3]")
		public static WebElement printClassPicturesTab;
		
		@FindBy(how=How.XPATH, using = ".//*[@id='menu_child_scheduling_1']/a[4]")
		public static WebElement printRequestsTab;
		
		@FindBy(how=How.XPATH, using = ".//*[@id='menu_child_scheduling_1']/a[5]")
		public static WebElement scheduleReportTab;
		
		@FindBy(how=How.XPATH, using = ".//*[@id='menu_child_scheduling_1']/a[6]")
		public static WebElement requestsReportTab;
		
		@FindBy(how=How.XPATH, using = ".//*[@id='menu_child_scheduling_1']/a[7]")
		public static WebElement unfilledRequestsTab;
		
		@FindBy(how=How.XPATH, using = ".//*[@id='menu_child_scheduling_1']/a[8]")
		public static WebElement incompleteSchedulesTab;
		
		@FindBy(how=How.XPATH, using = ".//*[@id='menu_child_scheduling_1']/a[9]")
		public static WebElement addOrDropReportTab;
		
		@FindBy(how=How.XPATH, using = ".//*[@id='mm_scheduling_2']/b")
		public static WebElement setUpTab;
		
		@FindBy(how=How.XPATH, using = ".//*[@id='menu_child_scheduling_2']/a[1]")
		public static WebElement runSchedulerTab;
		
		@FindBy(how=How.XPATH, using = ".//*[@id='search']/table[4]/tbody/tr/td/input[4]")
		public static WebElement submitButton;
		
		@FindBy(how=How.XPATH, using = ".//*[@id='search']/table[4]/tbody/tr/td/input[5]")
		public static WebElement resetButton;
		
		public static class StudentSchedulePageDetails {
			
			@FindBy(how=How.XPATH, using = ".//*[@id='modify']/div/table/tbody/tr/td/table/tbody/tr/td[2]/b/a")
			public static WebElement addACourseLink;
			
			@FindBy(how=How.XPATH, using = ".//*[@id='results']/tbody/tr[2]/td/a/b")
			public static WebElement selectCourse;
			
			@FindBy(how=How.ID, using = "course_1")
			public static WebElement selectCoursePeriod;
			
			@FindBy(how=How.XPATH, using = "html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr/td/form/table[2]/tbody/tr/td[3]/input[1]")
			public static WebElement doneButton;
			
			@FindBy(how=How.XPATH, using = "html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr/td/form/table[2]/tbody/tr/td[3]/input[2]")
			public static WebElement clearAndExitButton;
			
			@FindBy(how=How.CLASS_NAME, using = "btn_medium")
			public static WebElement saveButton;
			
		}
		
	}

}
