package com.Os4ed.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CreateStudentPage {
	
private WebDriver driver;
	
	public CreateStudentPage(WebDriver driver) {
		this.driver = driver;
		
	}
	
	public static class StudentPageDetails {
		
		@FindBy(how = How.XPATH, using = ".//*[@id='submenu_3']/a[1]")
		public static WebElement studentInfo;
		
		@FindBy(how = How.XPATH, using = ".//*[@id='submenu_3']/a[2]")
		public static WebElement addAStudent;
		
		@FindBy(how = How.XPATH, using = ".//*[@id='submenu_3']/a[3]")
		public static WebElement groupAssignStudentInfo;
		
		@FindBy(how = How.XPATH, using = ".//*[@id='submenu_3']/a[4]")
		public static WebElement studentReEnroll;
		
		@FindBy(how = How.XPATH, using = ".//*[@id='mm_students_1']/b")
		public static WebElement reports;
		
		@FindBy(how = How.XPATH, using = ".//*[@id='mm_students_2']/b")
		public static WebElement setUp;
		
		public static class AddStudentPageDetails {
			
			@FindBy(how = How.ID, using = "tab_link[Modules_php_modname_students_Student_php_include_GeneralInfoInc_category_id_1]")
			public static WebElement generalInfoTab;
			
			@FindBy(how = How.ID, using = "tab_link[Modules_php_modname_students_Student_php_include_EnrollmentInfoInc_category_id_6]")
			public static WebElement enrollmentInfoTab;
			
			@FindBy(how = How.ID, using = "tab_link[Modules_php_modname_students_Student_php_include_AddressInc_category_id_3]")
			public static WebElement addressAndContactsTab;
			
			@FindBy(how = How.ID, using = "tab_link[Modules_php_modname_students_Student_php_include_MedicalInc_category_id_2]")
			public static WebElement medicalTab;
			
			@FindBy(how = How.ID, using = "tab_link[Modules_php_modname_students_Student_php_include_CommentsInc_category_id_4]")
			public static WebElement commentsTab;
			
			@FindBy(how = How.ID, using = "tab_link[Modules_php_modname_students_Student_php_include_GoalInc_category_id_5]")
			public static WebElement goalsTab;
			
			@FindBy(how = How.ID, using = "tab_link[Modules_php_modname_students_Student_php_include_FilesInc_category_id_7]")
			public static WebElement filesTab;
			
			public static class GeneralInfoDetails {
				
				@FindBy(how = How.ID, using = "students[FIRST_NAME]")
				public static WebElement firstName;
				
				@FindBy(how = How.ID, using = "students[LAST_NAME]")
				public static WebElement lastName;
				
				@FindBy(how = How.XPATH, using = ".//*[@id='student_isertion']/table/tbody/tr[4]/td/table/tbody/tr[1]/td/table/tbody/tr[2]/td[1]/table[1]/tbody/tr[3]/td[3]/select")
				public static WebElement selectGender;
				
				@FindBy(how = How.XPATH, using = ".//*[@id='student_isertion']/table/tbody/tr[4]/td/table/tbody/tr[1]/td/table/tbody/tr[2]/td[1]/table[1]/tbody/tr[6]/td[3]/table/tbody/tr/td[3]/a/img")
				public static WebElement studentDOBCalender;
				
				@FindBy(how = How.XPATH, using = "html/body/div/table/tbody/tr[2]/th[2]/select[2]")
				public static WebElement selectYear;
				
				@FindBy(how = How.XPATH, using = "html/body/div/table/tbody/tr[2]/th[2]/select[1]")
				public static WebElement selectMonth;
				
				@FindBy(how = How.XPATH, using = "html/body/div/table/tbody/tr[6]/td[6]/a")
				public static WebElement selectDay;
				
				@FindBy(how = How.XPATH, using = ".//*[@id='student_isertion']/table/tbody/tr[4]/td/table/tbody/tr[3]/td/table/tbody/tr[3]/td[3]/select")
				public static WebElement selectGrade;
				
				@FindBy(how = How.ID, using = "students[USERNAME]")
				public static WebElement enterUserName;
				
				@FindBy(how = How.ID, using = "students[PASSWORD]")
				public static WebElement enterPassword;
				
				@FindBy(how = How.XPATH, using = ".//*[@id='student_isertion']/center/input")
				public static WebElement clickSaveAndNextButton;
				
				public static class EnrollmentInfoDetails {
					
					@FindBy(how = How.NAME, using = "values[student_enrollment][1][CALENDAR_ID]")
					public static WebElement selectCalendar;
					
					@FindBy(how = How.NAME, using = "values[student_enrollment][1][NEXT_SCHOOL]")
					public static WebElement selectRollingRetentionOption;
					
					@FindBy(how = How.XPATH, using = ".//*[@id='results']/tbody/tr[2]/td[1]/table/tbody/tr/td[3]/a/img")
					public static WebElement calendarStudentStartDate;
					
					@FindBy(how = How.XPATH, using = "html/body/div/table/tbody/tr[2]/th[2]/select[2]")
					public static WebElement calendarYear;
					
					@FindBy(how = How.XPATH, using = "html/body/div/table/tbody/tr[2]/th[2]/select[1]")
					public static WebElement calendarMonth;
					
					@FindBy(how = How.XPATH, using = "")
					public static WebElement calendarDay;
					
					@FindBy(how = How.XPATH, using = ".//*[@id='results']/tbody/tr[2]/td[2]/table/tbody/tr/td/select")
					public static WebElement selectEnrollmentCode;
					
					@FindBy(how = How.CLASS_NAME, using = "btn_medium")
					public static WebElement clickSaveButton;
					
					public static class AddressAndContactDetails {
						
						@FindBy(how = How.ID, using = "values[student_address][HOME][STREET_ADDRESS_1]")
						public static WebElement studentAddress;
						
						@FindBy(how = How.ID, using = "values[student_address][HOME][CITY]")
						public static WebElement studentCity;
						
						@FindBy(how = How.ID, using = "values[student_address][HOME][STATE]")
						public static WebElement studentState;
						
						@FindBy(how = How.ID, using = "values[student_address][HOME][ZIPCODE]")
						public static WebElement studentZipCode;
						
						@FindBy(how = How.ID, using = "values[people][PRIMARY][RELATIONSHIP]")
						public static WebElement selectPrimaryRelationship;
						
						@FindBy(how = How.ID, using = "values[people][PRIMARY][FIRST_NAME]")
						public static WebElement primaryFirstName;
						
						@FindBy(how = How.ID, using = "values[people][PRIMARY][LAST_NAME]")
						public static WebElement primaryLastName;
						
						@FindBy(how = How.ID, using = "values[people][PRIMARY][EMAIL]")
						public static WebElement primaryEmail;
						
						@FindBy(how = How.ID, using = "portal_1")
						public static WebElement clickPrimaryUserChkbx;
						
						@FindBy(how = How.ID, using = "values[people][PRIMARY][USER_NAME]")
						public static WebElement primaryUserName;
						
						@FindBy(how = How.ID, using = "values[people][PRIMARY][PASSWORD]")
						public static WebElement primaryPassword;
						
						@FindBy(how = How.ID, using = "values[people][SECONDARY][RELATIONSHIP]")
						public static WebElement selectSecondaryRelationship;
						
						@FindBy(how = How.ID, using = "values[people][SECONDARY][FIRST_NAME]")
						public static WebElement secondaryFirstName;
						
						@FindBy(how = How.ID, using = "values[people][SECONDARY][LAST_NAME]")
						public static WebElement secondaryLastName;
						
						@FindBy(how = How.ID, using = "values[people][SECONDARY][EMAIL]")
						public static WebElement secondaryEmail;
						
						@FindBy(how = How.ID, using = "portal_2")
						public static WebElement clicksecondaryUserChkbx;
						
						@FindBy(how = How.ID, using = "values[people][SECONDARY][USER_NAME]")
						public static WebElement secondaryUserName;
						
						@FindBy(how = How.ID, using = "values[people][SECONDARY][PASSWORD]")
						public static WebElement secondaryPassword;
						
						@FindBy(how = How.CLASS_NAME, using = "btn_medium")
						public static WebElement clickSaveButton;
						
					}
					
				}
			}
			
		}
	}

}
