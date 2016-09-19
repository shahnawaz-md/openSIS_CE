package com.Os4ed.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CreateSchoolSetupPage {
	
private WebDriver driver;
	
	public CreateSchoolSetupPage(WebDriver driver) {
	this.driver = driver;

	}
	
	public static class SchoolSetupPageDetails {
		
		@FindBy(how = How.XPATH, using = ".//*[@id='submenu_2']/a[1]")
		public static WebElement portalNotes;
		
		@FindBy(how = How.XPATH, using = ".//*[@id='submenu_2']/a[2]")
		public static WebElement markingPeriods;
		
		@FindBy(how = How.XPATH, using = ".//*[@id='submenu_2']/a[3]")
		public static WebElement calendars;
		
		@FindBy(how = How.XPATH, using = ".//*[@id='submenu_2']/a[4]")
		public static WebElement periods;
		
		@FindBy(how = How.XPATH, using = ".//*[@id='submenu_2']/a[5]")
		public static WebElement gradeLevels;
		
		@FindBy(how = How.XPATH, using = ".//*[@id='submenu_2']/a[6]")
		public static WebElement rooms;
		
		@FindBy(how = How.XPATH, using = ".//*[@id='mm_schoolsetup_1']/b")
		public static WebElement school;
		
		@FindBy(how = How.XPATH, using = ".//*[@id='mm_schoolsetup_2']/b")
		public static WebElement courses;
		
		@FindBy(how = How.XPATH, using = ".//*[@id='menu_child_schoolsetup_2']/a[1]")
		public static WebElement courseManager;
		
		
		public static class CalendarPageDetails {
			
			@FindBy(how = How.XPATH, using = ".//*[@id='content']/table/tbody/tr/td/form/table/tbody/tr[1]/td/font/b/table/tbody/tr/td[2]/a")
			public static WebElement createNewCalendar;
			
			@FindBy(how = How.ID, using = "title")
			public static WebElement titleTextBox;
			
			@FindBy(how = How.XPATH, using = ".//*[@id='prompt_form']/table[1]/tbody/tr[1]/td/input[2]")
			public static WebElement defaultCalendarCheckBox;
			
			@FindBy(how = How.XPATH, using = ".//*[@id='prompt_form']/table[2]/tbody/tr/td/table/tbody/tr[5]/td/input")
			public static WebElement superAdminCheckBox;
			
			@FindBy(how = How.XPATH, using = ".//*[@id='prompt_form']/table[2]/tbody/tr/td/table/tbody/tr[7]/td/input")
			public static WebElement adminCheckBox;
			
			@FindBy(how = How.XPATH, using = ".//*[@id='prompt_form']/table[2]/tbody/tr/td/table/tbody/tr[8]/td/input")
			public static WebElement teacherCheckBox;
			
			@FindBy(how = How.XPATH, using = ".//*[@id='prompt_form']/table[2]/tbody/tr/td/table/tbody/tr[9]/td/input")
			public static WebElement studentCheckBox;
			
			@FindBy(how = How.XPATH, using = ".//*[@id='prompt_form']/table[2]/tbody/tr/td/table/tbody/tr[10]/td/input")
			public static WebElement parentCheckBox;
			
			@FindBy(how = How.XPATH, using = ".//*[@id='prompt_form']/input[1]")
			public static WebElement okButton;
			
			public static class MarkingPeriodPageDetails {
				//Semester 1
				@FindBy(how = How.XPATH, using = ".//*[@id='content']/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr/td/a/img")
				public static WebElement addButtonSem1 ;
				
				@FindBy(how = How.ID, using = "tables[new][TITLE]")
				public static WebElement titleTextBoxS1;
				
				@FindBy(how = How.ID, using = "tables[new][SHORT_NAME]")
				public static WebElement shortNameTextBoxS1;
				
				@FindBy(how = How.ID, using = "tables[new][SORT_ORDER]")
				public static WebElement sortOrderTextBoxS1;
				
				@FindBy(how = How.XPATH, using = ".//*[@id='marking_period']/table[1]/tbody/tr[4]/td/table/tbody/tr/td/table/tbody/tr/td/b/table/tbody/tr[6]/td[2]/table/tbody/tr/td[3]/a/img")
				public static WebElement beginsCalendarS1;
				
				@FindBy(how = How.XPATH, using = "html/body/div/table/tbody/tr[2]/th[2]/select[2]")
				public static WebElement selectBeginsCalendarYearS1;
				
				@FindBy(how = How.NAME, using = "calendar-month")
				public static WebElement selectBeginsCalendarMonthS1;
				
				@FindBy(how = How.XPATH, using = "html/body/div/table/tbody/tr[4]/td[6]/a")
				public static WebElement selectBeginsCalendarDayS1;
				
				@FindBy(how = How.XPATH, using = ".//*[@id='marking_period']/table[1]/tbody/tr[4]/td/table/tbody/tr/td/table/tbody/tr/td/b/table/tbody/tr[7]/td[2]/table/tbody/tr/td[3]/a/img")
				public static WebElement endsCalendarS1;
				
				@FindBy(how = How.XPATH, using = "html/body/div/table/tbody/tr[2]/th[2]/select[2]")
				public static WebElement selectEndsCalendarYearS1;
				
				@FindBy(how = How.NAME, using = "calendar-month")
				public static WebElement selectEndsCalendarMonthS1;
				
				@FindBy(how = How.XPATH, using = "html/body/div/table/tbody/tr[8]/td[5]/a")
				public static WebElement selectEndsCalendarDayS1;
				
				@FindBy(how = How.XPATH, using = ".//*[@id='marking_period']/table[2]/tbody/tr[1]/td/font/b/input")
				public static WebElement saveButtonS1;
				
				// Semester 2
				@FindBy(how = How.XPATH, using = ".//*[@id='results']/tbody/tr[3]/td/a/img")
				public static WebElement addButtonSem2 ;
				
				@FindBy(how = How.ID, using = "tables[new][TITLE]")
				public static WebElement titleTextBoxS2;
				
				@FindBy(how = How.ID, using = "tables[new][SHORT_NAME]")
				public static WebElement shortNameTextBoxS2;
				
				@FindBy(how = How.ID, using = "tables[new][SORT_ORDER]")
				public static WebElement sortOrderTextBoxS2;
				
				@FindBy(how = How.XPATH, using = ".//*[@id='marking_period']/table[1]/tbody/tr[4]/td/table/tbody/tr/td/table/tbody/tr/td/b/table/tbody/tr[6]/td[2]/table/tbody/tr/td[3]/a/img")
				public static WebElement beginsCalendarS2;
				
				@FindBy(how = How.XPATH, using = "html/body/div/table/tbody/tr[2]/th[2]/select[2]")
				public static WebElement selectBeginsCalendarYearS2;
				
				@FindBy(how = How.NAME, using = "calendar-month")
				public static WebElement selectBeginsCalendarMonthS2;
				
				@FindBy(how = How.XPATH, using = "html/body/div/table/tbody/tr[4]/td[6]/a")
				public static WebElement selectBeginsCalendarDayS2;
				
				@FindBy(how = How.XPATH, using = ".//*[@id='marking_period']/table[1]/tbody/tr[4]/td/table/tbody/tr/td/table/tbody/tr/td/b/table/tbody/tr[7]/td[2]/table/tbody/tr/td[3]/a/img")
				public static WebElement endsCalendarS2;
				
				@FindBy(how = How.XPATH, using = "html/body/div/table/tbody/tr[2]/th[2]/select[2]")
				public static WebElement selectEndsCalendarYearS2;
				
				@FindBy(how = How.NAME, using = "calendar-month")
				public static WebElement selectEndsCalendarMonthS2;
				
				@FindBy(how = How.XPATH, using = "html/body/div/table/tbody/tr[8]/td[7]/a")
				public static WebElement selectEndsCalendarDayS2;
				
				@FindBy(how = How.XPATH, using = ".//*[@id='marking_period']/table[2]/tbody/tr[1]/td/font/b/input")
				public static WebElement saveButtonS2;
				
				// Quarter 1
				@FindBy(how = How.XPATH, using = ".//*[@id='content']/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr[2]/td/a")
				public static WebElement linkSemester1;
				
				@FindBy(how = How.XPATH, using = ".//*[@id='content']/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td[3]/table/tbody/tr/td/a/img")
				public static WebElement addButtonQuar1;
				
				@FindBy(how = How.ID, using = "tables[new][TITLE]")
				public static WebElement titleTextBoxQ1;
				
				@FindBy(how = How.ID, using = "tables[new][SHORT_NAME]")
				public static WebElement shortNameTextBoxQ1;
				
				@FindBy(how = How.ID, using = "tables[new][SORT_ORDER]")
				public static WebElement sortOrderTextBoxQ1;
				
				@FindBy(how = How.XPATH, using = ".//*[@id='marking_period']/table[1]/tbody/tr[4]/td/table/tbody/tr/td/table/tbody/tr/td/b/table/tbody/tr[6]/td[2]/table/tbody/tr/td[3]/a/img")
				public static WebElement beginsCalendarQ1;
				
				@FindBy(how = How.XPATH, using = "html/body/div/table/tbody/tr[2]/th[2]/select[2]")
				public static WebElement selectBeginsCalendarYearQ1;
				
				@FindBy(how = How.NAME, using = "calendar-month")
				public static WebElement selectBeginsCalendarMonthQ1;
				
				@FindBy(how = How.XPATH, using = "html/body/div/table/tbody/tr[4]/td[6]/a")
				public static WebElement selectBeginsCalendarDayQ1;
				
				@FindBy(how = How.XPATH, using = ".//*[@id='marking_period']/table[1]/tbody/tr[4]/td/table/tbody/tr/td/table/tbody/tr/td/b/table/tbody/tr[7]/td[2]/table/tbody/tr/td[3]/a/img")
				public static WebElement endCalendarQ1;
				
				@FindBy(how = How.XPATH, using = "html/body/div/table/tbody/tr[2]/th[2]/select[2]")
				public static WebElement selectEndsCalendarYearQ1;
				
				@FindBy(how = How.NAME, using = "calendar-month")
				public static WebElement selectEndsCalendarMonthQ1;
				
				@FindBy(how = How.XPATH, using = "html/body/div/table/tbody/tr[8]/td[5]/a")
				public static WebElement selectEndsCalendarDayQ1;
				
				@FindBy(how = How.XPATH, using = ".//*[@id='marking_period']/table[2]/tbody/tr[1]/td/font/b/input")
				public static WebElement saveButtonQ1;
				
				// Quarter 2
				@FindBy(how = How.XPATH, using = ".//*[@id='results']/tbody/tr[3]/td/a/img")
				public static WebElement addButtonQuar2;
				
				@FindBy(how = How.ID, using = "tables[new][TITLE]")
				public static WebElement titleTextBoxQ2;
				
				@FindBy(how = How.ID, using = "tables[new][SHORT_NAME]")
				public static WebElement shortNameTextBoxQ2;
				
				@FindBy(how = How.ID, using = "tables[new][SORT_ORDER]")
				public static WebElement sortOrderTextBoxQ2;
				
				@FindBy(how = How.XPATH, using = ".//*[@id='marking_period']/table[1]/tbody/tr[4]/td/table/tbody/tr/td/table/tbody/tr/td/b/table/tbody/tr[6]/td[2]/table/tbody/tr/td[3]/a/img")
				public static WebElement beginsCalendarQ2;
				
				@FindBy(how = How.XPATH, using = "html/body/div/table/tbody/tr[2]/th[2]/select[2]")
				public static WebElement selectBeginsCalendarYearQ2;
				
				@FindBy(how = How.NAME, using = "calendar-month")
				public static WebElement selectBeginsCalendarMonthQ2;
				
				@FindBy(how = How.XPATH, using = "html/body/div/table/tbody/tr[4]/td[6]/a")
				public static WebElement selectBeginsCalendarDayQ2;
				
				@FindBy(how = How.XPATH, using = ".//*[@id='marking_period']/table[1]/tbody/tr[4]/td/table/tbody/tr/td/table/tbody/tr/td/b/table/tbody/tr[7]/td[2]/table/tbody/tr/td[3]/a/img")
				public static WebElement endCalendarQ2;
				
				@FindBy(how = How.XPATH, using = "html/body/div/table/tbody/tr[2]/th[2]/select[2]")
				public static WebElement selectEndsCalendarYearQ2;
				
				@FindBy(how = How.NAME, using = "calendar-month")
				public static WebElement selectEndsCalendarMonthQ2;
				
				@FindBy(how = How.XPATH, using = "html/body/div/table/tbody/tr[8]/td[5]/a")
				public static WebElement selectEndsCalendarDayQ2;
				
				@FindBy(how = How.XPATH, using = ".//*[@id='marking_period']/table[2]/tbody/tr[1]/td/font/b/input")
				public static WebElement saveButtonQ2;
				
				//Quarter 3 
				@FindBy(how = How.XPATH, using = ".//*[@id='content']/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr[3]/td/a")
				public static WebElement linkSemester2;
				
				@FindBy(how = How.XPATH, using = ".//*[@id='content']/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td[3]/table/tbody/tr/td/a/img")
				public static WebElement addButtonQuar3;
				
				@FindBy(how = How.ID, using = "tables[new][TITLE]")
				public static WebElement titleTextBoxQ3;
				
				@FindBy(how = How.ID, using = "tables[new][SHORT_NAME]")
				public static WebElement shortNameTextBoxQ3;
				
				@FindBy(how = How.ID, using = "tables[new][SORT_ORDER]")
				public static WebElement sortOrderTextBoxQ3;
				
				@FindBy(how = How.XPATH, using = ".//*[@id='marking_period']/table[1]/tbody/tr[4]/td/table/tbody/tr/td/table/tbody/tr/td/b/table/tbody/tr[6]/td[2]/table/tbody/tr/td[3]/a/img")
				public static WebElement beginsCalendarQ3;
				
				@FindBy(how = How.XPATH, using = "html/body/div/table/tbody/tr[2]/th[2]/select[2]")
				public static WebElement selectBeginsCalendarYearQ3;
				
				@FindBy(how = How.NAME, using = "calendar-month")
				public static WebElement selectBeginsCalendarMonthQ3;
				
				@FindBy(how = How.XPATH, using = "html/body/div/table/tbody/tr[4]/td[6]/a")
				public static WebElement selectBeginsCalendarDayQ3;
				
				@FindBy(how = How.XPATH, using = ".//*[@id='marking_period']/table[1]/tbody/tr[4]/td/table/tbody/tr/td/table/tbody/tr/td/b/table/tbody/tr[7]/td[2]/table/tbody/tr/td[3]/a/img")
				public static WebElement endCalendarQ3;
				
				@FindBy(how = How.XPATH, using = "html/body/div/table/tbody/tr[2]/th[2]/select[2]")
				public static WebElement selectEndsCalendarYearQ3;
				
				@FindBy(how = How.NAME, using = "calendar-month")
				public static WebElement selectEndsCalendarMonthQ3;
				
				@FindBy(how = How.XPATH, using = "html/body/div/table/tbody/tr[8]/td[6]/a")
				public static WebElement selectEndsCalendarDayQ3;
				
				@FindBy(how = How.XPATH, using = ".//*[@id='marking_period']/table[2]/tbody/tr[1]/td/font/b/input")
				public static WebElement saveButtonQ3;
				
				//Quarter 4
				@FindBy(how = How.XPATH, using = ".//*[@id='results']/tbody/tr[3]/td/a/img")
				public static WebElement addButtonQuar4;
				
				@FindBy(how = How.ID, using = "tables[new][TITLE]")
				public static WebElement titleTextBoxQ4;
				
				@FindBy(how = How.ID, using = "tables[new][SHORT_NAME]")
				public static WebElement shortNameTextBoxQ4;
				
				@FindBy(how = How.ID, using = "tables[new][SORT_ORDER]")
				public static WebElement sortOrderTextBoxQ4;
				
				@FindBy(how = How.XPATH, using = ".//*[@id='marking_period']/table[1]/tbody/tr[4]/td/table/tbody/tr/td/table/tbody/tr/td/b/table/tbody/tr[6]/td[2]/table/tbody/tr/td[3]/a/img")
				public static WebElement beginsCalendarQ4;
				
				@FindBy(how = How.XPATH, using = "html/body/div/table/tbody/tr[2]/th[2]/select[2]")
				public static WebElement selectBeginsCalendarYearQ4;
				
				@FindBy(how = How.NAME, using = "calendar-month")
				public static WebElement selectBeginsCalendarMonthQ4;
				
				@FindBy(how = How.XPATH, using = "html/body/div/table/tbody/tr[4]/td[7]/a")
				public static WebElement selectBeginsCalendarDayQ4;
				
				@FindBy(how = How.XPATH, using = ".//*[@id='marking_period']/table[1]/tbody/tr[4]/td/table/tbody/tr/td/table/tbody/tr/td/b/table/tbody/tr[7]/td[2]/table/tbody/tr/td[3]/a/img")
				public static WebElement endCalendarQ4;
				
				@FindBy(how = How.XPATH, using = "html/body/div/table/tbody/tr[2]/th[2]/select[2]")
				public static WebElement selectEndsCalendarYearQ4;
				
				@FindBy(how = How.NAME, using = "calendar-month")
				public static WebElement selectEndsCalendarMonthQ4;
				
				@FindBy(how = How.XPATH, using = "html/body/div/table/tbody/tr[8]/td[7]/a")
				public static WebElement selectEndsCalendarDayQ4;
				
				@FindBy(how = How.XPATH, using = ".//*[@id='marking_period']/table[2]/tbody/tr[1]/td/font/b/input")
				public static WebElement saveButtonQ4;
				
				public static class RoomPageDetails {
					
					@FindBy(how = How.ID, using = "values[new][TITLE]")
					public static WebElement titleRoom1TextBox;
					
					@FindBy(how = How.ID, using = "values[new][CAPACITY]")
					public static WebElement capacityRoom1TextBox;
					
					@FindBy(how = How.ID, using = "values[new][SORT_ORDER]")
					public static WebElement sortOrderRoom1TextBox;
					
					@FindBy(how = How.XPATH, using = ".//*[@id='F1']/center/input")
					public static WebElement saveButtonRoom1;
					
					@FindBy(how = How.ID, using = "values[new][TITLE]")
					public static WebElement titleRoom2TextBox;
					
					@FindBy(how = How.ID, using = "values[new][CAPACITY]")
					public static WebElement capacityRoom2TextBox;
					
					@FindBy(how = How.ID, using = "values[new][SORT_ORDER]")
					public static WebElement sortOrderRoom2TextBox;
					
					@FindBy(how = How.XPATH, using = ".//*[@id='F1']/center/input")
					public static WebElement saveButtonRoom2;
					
					public static class PeriodPageDetails {
						
						@FindBy(how = How.ID, using = "values[new][TITLE]")
						public static WebElement titlePeriod1;
						
						@FindBy(how = How.ID, using = "values[new][SHORT_NAME]")
						public static WebElement shortNamePeriod1;
						
						@FindBy(how = How.ID, using = "values[new][SORT_ORDER]")
						public static WebElement sortOrderPeriod1;
						
						@FindBy(how = How.XPATH, using = ".//*[@id='students']/table/tbody/tr/td/table/tbody/tr[2]/td[5]/table/tbody/tr/td[1]/select")
						public static WebElement startHourPeriod1;
						
						@FindBy(how = How.XPATH, using = ".//*[@id='students']/table/tbody/tr/td/table/tbody/tr[2]/td[5]/table/tbody/tr/td[2]/select")
						public static WebElement startMinutePeriod1;
						
						@FindBy(how = How.XPATH, using = ".//*[@id='students']/table/tbody/tr/td/table/tbody/tr[2]/td[5]/table/tbody/tr/td[3]/select")
						public static WebElement startSecondPeriod1;
						
						@FindBy(how = How.XPATH, using = ".//*[@id='students']/table/tbody/tr/td/table/tbody/tr[2]/td[6]/table/tbody/tr/td[1]/select")
						public static WebElement endHourPeriod1;
						
						@FindBy(how = How.XPATH, using = ".//*[@id='students']/table/tbody/tr/td/table/tbody/tr[2]/td[6]/table/tbody/tr/td[2]/select")
						public static WebElement endMinutePeriod1;
						
						@FindBy(how = How.XPATH, using = ".//*[@id='students']/table/tbody/tr/td/table/tbody/tr[2]/td[6]/table/tbody/tr/td[3]/select")
						public static WebElement endSecondPeriod1;
						
						@FindBy(how = How.NAME, using = "values[new][ATTENDANCE]")
						public static WebElement usedForAttendancePeriod1;
						
						@FindBy(how = How.NAME, using = "values[new][IGNORE_SCHEDULING]")
						public static WebElement ignoreForSchedulingPeriod1;
						
						@FindBy(how = How.XPATH, using = ".//*[@id='F1']/center/input")
						public static WebElement saveButtonPeriod1;
						
						@FindBy(how = How.ID, using = "values[new][TITLE]")
						public static WebElement titlePeriod2;
						
						@FindBy(how = How.ID, using = "values[new][SHORT_NAME]")
						public static WebElement shortNamePeriod2;
						
						@FindBy(how = How.ID, using = "values[new][SORT_ORDER]")
						public static WebElement sortOrderPeriod2;
						
						@FindBy(how = How.XPATH, using = ".//*[@id='results']/tbody/tr[3]/td[5]/table/tbody/tr/td[1]/select")
						public static WebElement startHourPeriod2;
						
						@FindBy(how = How.XPATH, using = ".//*[@id='results']/tbody/tr[3]/td[5]/table/tbody/tr/td[2]/select")
						public static WebElement startMinutePeriod2;
						
						@FindBy(how = How.XPATH, using = ".//*[@id='results']/tbody/tr[3]/td[5]/table/tbody/tr/td[3]/select")
						public static WebElement startSecondPeriod2;
						
						@FindBy(how = How.XPATH, using = ".//*[@id='results']/tbody/tr[3]/td[6]/table/tbody/tr/td[1]/select")
						public static WebElement endHourPeriod2;
						
						@FindBy(how = How.XPATH, using = ".//*[@id='results']/tbody/tr[3]/td[6]/table/tbody/tr/td[2]/select")
						public static WebElement endMinutePeriod2;
						
						@FindBy(how = How.XPATH, using = ".//*[@id='results']/tbody/tr[3]/td[6]/table/tbody/tr/td[3]/select")
						public static WebElement endSecondPeriod2;
						
						@FindBy(how = How.NAME, using = "values[new][ATTENDANCE]")
						public static WebElement usedForAttendancePeriod2;
						
						@FindBy(how = How.NAME, using = "values[new][IGNORE_SCHEDULING]")
						public static WebElement ignoreForSchedulingPeriod2;
						
						@FindBy(how = How.XPATH, using = ".//*[@id='F1']/center/input")
						public static WebElement saveButtonPeriod2;
						
						public static class GradeLabelsPageDetails {
							
							@FindBy(how = How.ID, using = "values[new][TITLE]")
							public static WebElement titleGradeLevel1;
							
							@FindBy(how = How.ID, using = "values[new][SHORT_NAME]")
							public static WebElement shortNameGradeLevel1;
							
							@FindBy(how = How.ID, using = "values[new][SORT_ORDER]")
							public static WebElement sortOrdeGradeLevel1;
							
							@FindBy(how = How.XPATH, using = ".//*[@id='results']/tbody/tr[2]/td[5]/select")
							public static WebElement nextGradeLevel1;
							
							@FindBy(how = How.XPATH, using = ".//*[@id='F1']/center/input")
							public static WebElement saveButtonGradeLevel1;
							
							@FindBy(how = How.ID, using = "values[new][TITLE]")
							public static WebElement titleGradeLevel2;
							
							@FindBy(how = How.ID, using = "values[new][SHORT_NAME]")
							public static WebElement shortNameGradeLevel2;
							
							@FindBy(how = How.ID, using = "values[new][SORT_ORDER]")
							public static WebElement sortOrdeGradeLevel2;
							
							@FindBy(how = How.XPATH, using = ".//*[@id='results']/tbody/tr[3]/td[5]/select")
							public static WebElement nextGradeLevel2;
							
							@FindBy(how = How.XPATH, using = ".//*[@id='F1']/center/input")
							public static WebElement saveButtonGradeLevel2;
							
							@FindBy(how = How.XPATH, using = ".//*[@id='F1']/center/input")
							public static WebElement saveButton;
				

		
		public static class SchoolDetails {
			
			@FindBy(how = How.XPATH, using = ".//*[@id='menu_child_schoolsetup_1']/a[1]")
			public static WebElement schoolInformation;
			
			@FindBy(how = How.XPATH, using = ".//*[@id='menu_child_schoolsetup_1']/a[2]")
			public static WebElement addASchool;
			
			@FindBy(how = How.XPATH, using = ".//*[@id='menu_child_schoolsetup_1']/a[3]")
			public static WebElement copySchool;
			
			@FindBy(how = How.XPATH, using = ".//*[@id='menu_child_schoolsetup_1']/a[4]")
			public static WebElement systemPreference;
			
			@FindBy(how = How.XPATH, using = ".//*[@id='menu_child_schoolsetup_1']/a[5]")
			public static WebElement schoolCustomFields;
			
			public static class CoursesDetails {
				
				@FindBy(how = How.XPATH, using = ".//*[@id='menu_child_schoolsetup_2']/a[1]")
				public static WebElement courseManager;
				
				@FindBy(how = How.XPATH, using = ".//*[@id='menu_child_schoolsetup_2']/a[2]")
				public static WebElement courseCatalog;
				
				@FindBy(how = How.XPATH, using = ".//*[@id='menu_child_schoolsetup_2']/a[3]")
				public static WebElement printCatalogByTerm;
				
				@FindBy(how = How.XPATH, using = ".//*[@id='menu_child_schoolsetup_2']/a[4]")
				public static WebElement printCatalogByGradeLevel;
				
				@FindBy(how = How.XPATH, using = ".//*[@id='menu_child_schoolsetup_2']/a[5]")
				public static WebElement printAllCourses;
				
				@FindBy(how = How.XPATH, using = ".//*[@id='menu_child_schoolsetup_2']/a[6]")
				public static WebElement teacherReAssignment;
								}
							}
						}
				
					}
				
				}
			}
		
		}
	}
}