package com.Os4ed.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CreateGradesPage {
	
	private WebDriver driver;
	
	public CreateGradesPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public static class GradesPageDetails {
		
		@FindBy(how = How.ID, using = "mm_grades_2")
		public static WebElement setUpLink;
		
		@FindBy(how = How.XPATH, using = ".//*[@id='menu_child_grades_2']/a[1]")
		public static WebElement reportCardGrades;
		
		@FindBy(how = How.XPATH, using = ".//*[@id='menu_child_grades_2']/a[2]")
		public static WebElement reportCardComments;
		
		@FindBy(how = How.XPATH, using = ".//*[@id='menu_child_grades_2']/a[3]")
		public static WebElement honorRollSetup;
		
		//Teacher Login Grade Part for creating Assignment
		
		@FindBy(how = How.ID, using = "mm_grades_1")
		public static WebElement GradeBookLink;
		
		@FindBy(how = How.XPATH, using = ".//*[@id='menu_child_grades_1']/a[1]")
		public static WebElement enterGrades;
		
		@FindBy(how = How.XPATH, using = ".//*[@id='menu_child_grades_1']/a[2]")
		public static WebElement setupAssignments;
		
		@FindBy(how = How.XPATH, using = ".//*[@id='menu_child_grades_1']/a[3]")
		public static WebElement anomalousGrades;
		
		@FindBy(how = How.XPATH, using = ".//*[@id='menu_child_grades_1']/a[4]")
		public static WebElement progressReports;
		
		
		public static class ReportCardGradesDetails {
			
			@FindBy(how = How.ID, using = "values[new][TITLE]")
			public static WebElement gradeScaleTextBox;
			
			@FindBy(how = How.ID, using = "values[new][GP_SCALE]")
			public static WebElement scaleValueTextBox;
			
			@FindBy(how = How.ID, using = "values[new][SORT_ORDER]")
			public static WebElement sortOrderTextBox;
									
			@FindBy(how = How.XPATH, using = ".//*[@id='div_margin']/table/tbody/tr[4]/td/table/tbody/tr/td/center/input")
			public static WebElement saveButton;
			
			@FindBy(how = How.XPATH, using = ".//*[@id='F1']/center/table/tbody/tr/td[2]/table/tbody/tr/td[1]/table/tbody/tr/td[2]/a")
			public static WebElement mainGradeScaleTab;
			
			@FindBy(how = How.ID, using = "values[new][TITLE]")
			public static WebElement titleTextBox;
			
			@FindBy(how = How.ID, using = "values[new][BREAK_OFF]")
			public static WebElement breakOffTextBox;
			
			@FindBy(how = How.ID, using = "values[new][GPA_VALUE]")
			public static WebElement weightedGPTextBox;
			
			@FindBy(how = How.ID, using = "values[new][UNWEIGHTED_GP]")
			public static WebElement unWeightedGPTextBox;
			
			@FindBy(how = How.ID, using = "values[new][SORT_ORDER]")
			public static WebElement orderTextBox;
			
			
		}
	}

}
