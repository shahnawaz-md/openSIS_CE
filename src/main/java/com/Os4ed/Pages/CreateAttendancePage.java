package com.Os4ed.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CreateAttendancePage {
	
	private WebDriver driver;
	
	public CreateAttendancePage(WebDriver driver) {
		this.driver = driver;
		
	}
	
	public static class AttendancePageDetails {
		
		@FindBy(how = How.ID, using = "mm_attendance_3")
		public static WebElement setUpLink;
		
		@FindBy(how = How.XPATH, using = ".//*[@id='menu_child_attendance_3']/a")
		public static WebElement attendanceCodes;
		
		@FindBy(how = How.ID, using = "values[new][TITLE]")
		public static WebElement titleTextBox;
		
		@FindBy(how = How.ID, using = "values[new][SHORT_NAME]")
		public static WebElement shortNameTextBox;
		
		@FindBy(how = How.ID, using = "values[new][SORT_ORDER]")
		public static WebElement sortOrderTextBox;
		
		@FindBy(how = How.NAME, using = "values[new][TYPE]")
		public static WebElement typeMenuList;
		
		@FindBy(how = How.NAME, using = "values[new][DEFAULT_CODE]")
		public static WebElement defaultForOfficeTeacherChkx;
		
		@FindBy(how = How.NAME, using = "values[new][STATE_CODE]")
		public static WebElement stateCodeMenuList;
		
		@FindBy(how = How.XPATH, using = ".//*[@id='students']/table/tbody/tr[4]/td/table/tbody/tr/td/center/input")
		public static WebElement saveButton1;
		
		@FindBy(how = How.XPATH, using = ".//*[@id='div_margin']/table/tbody/tr[4]/td/table/tbody/tr/td/center/input")
		public static WebElement saveButton2;
		
		@FindBy(how = How.XPATH, using = ".//*[@id='div_margin']/table/tbody/tr[4]/td/table/tbody/tr/td/center/input")
		public static WebElement saveButton3;
		
		
		
	}
	

}
