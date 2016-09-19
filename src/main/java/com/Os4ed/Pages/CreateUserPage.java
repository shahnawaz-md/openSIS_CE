package com.Os4ed.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CreateUserPage {
	
private WebDriver driver;

	public CreateUserPage(WebDriver driver) {
	
		this.driver = driver;
	
	}
	
	public static class UserPageDetails {
		
		@FindBy(how = How.XPATH, using = ".//*[@id='submenu_4']/a[1]")
		public static WebElement userPreferences;
		
		@FindBy(how = How.XPATH, using = ".//*[@id='mm_users_1']/b")
		public static WebElement userReport;
		
		@FindBy(how = How.XPATH, using = ".//*[@id='menu_child_users_1']/a[1]")
		public static WebElement userAdvancedReport;
		
		@FindBy(how = How.XPATH, using = ".//*[@id='menu_child_users_1']/a[2]")
		public static WebElement staffAdvancedReport;
		
		@FindBy(how = How.XPATH, using = ".//*[@id='mm_users_2']/b")
		public static WebElement parentTab;
		
		@FindBy(how = How.XPATH, using = ".//*[@id='menu_child_users_2']/a")
		public static WebElement parentInfo;
		
		@FindBy(how = How.XPATH, using = ".//*[@id='mm_users_3']/b")
		public static WebElement staffTab;
		
		@FindBy(how = How.XPATH, using = ".//*[@id='menu_child_users_3']/a[1]")
		public static WebElement staffInfo;
		
		@FindBy(how = How.XPATH, using = ".//*[@id='menu_child_users_3']/a[2]")
		public static WebElement addAStaff;
		
		@FindBy(how = How.XPATH, using = ".//*[@id='mm_users_4']/b")
		public static WebElement setUpTab;
		
		@FindBy(how = How.XPATH, using = ".//*[@id='menu_child_users_4']/a[1]")
		public static WebElement profilesTab;
		
		@FindBy(how = How.XPATH, using = ".//*[@id='menu_child_users_4']/a[2]")
		public static WebElement parentFields;
		
		@FindBy(how = How.XPATH, using = ".//*[@id='menu_child_users_4']/a[3]")
		public static WebElement staffFields;
		
		@FindBy(how = How.XPATH, using = ".//*[@id='mm_users_5']/b")
		public static WebElement teachersProgram;
		
		@FindBy(how = How.XPATH, using = ".//*[@id='menu_child_users_5']/a[1]")
		public static WebElement inputFinalGrades;
		
		@FindBy(how = How.XPATH, using = ".//*[@id='menu_child_users_5']/a[2]")
		public static WebElement gradebookGrades;
		
		@FindBy(how = How.XPATH, using = ".//*[@id='menu_child_users_5']/a[3]")
		public static WebElement progressReport;
		
		@FindBy(how = How.XPATH, using = ".//*[@id='menu_child_users_5']/a[4]")
		public static WebElement takeAttendance;
		
		@FindBy(how = How.XPATH, using = ".//*[@id='menu_child_users_5']/a[5]")
		public static WebElement missingAttendance;
		
		@FindBy(how = How.XPATH, using = ".//*[@id='menu_child_users_5']/a[6]")
		public static WebElement enterExtracurricular;
		
		public static class AddStaffPageDetails {
			
			@FindBy(how = How.ID, using = "tab_link[Modules_php_modname_users_Staff_php_include_DemographicInfoInc_custom_staff_category_id_1]")
			public static WebElement demographicInfo;
			
			@FindBy(how = How.ID, using = "tab_link[Modules_php_modname_users_Staff_php_include_SchoolsInfoInc_custom_staff_category_id_3]")
			public static WebElement schoolInformation;
			
			@FindBy(how = How.ID, using = "tab_link[Modules_php_modname_users_Staff_php_include_AddressInc_custom_staff_category_id_2]")
			public static WebElement addressAndContacts;
			
			@FindBy(how = How.ID, using = "tab_link[Modules_php_modname_users_Staff_php_include_CertificationInfoInc_custom_staff_category_id_4]")
			public static WebElement certificationInformation;
			
			@FindBy(how = How.ID, using = "tab_link[Modules_php_modname_users_Staff_php_include_ScheduleInc_custom_staff_category_id_5]")
			public static WebElement teacherSchedule;
			
			public static class DemographicInfoDetails {
				
				@FindBy(how = How.NAME, using = "staff[TITLE]")
				public static WebElement teacherSalutation;
				
				@FindBy(how = How.ID, using = "staff[FIRST_NAME]")
				public static WebElement teacherFirstName;
				
				@FindBy(how = How.ID, using = "staff[LAST_NAME]")
				public static WebElement teacherLastName;
				
				@FindBy(how = How.NAME, using = "staff[GENDER]")
				public static WebElement teacherGender;
				
				@FindBy(how = How.ID, using = "staff[EMAIL]")
				public static WebElement teacherEmail;
				
				@FindBy(how = How.XPATH, using = ".//*[@id='staff']/center/input")
				public static WebElement saveAndNextButton;
				
				public static class SchoolInformationDetails {
					
					@FindBy(how = How.NAME, using = "values[SCHOOL][CATEGORY]")
					public static WebElement userCategory;
					
					@FindBy(how = How.ID, using = "values[SCHOOL][JOB_TITLE]")
					public static WebElement userJobTitle;
					
					@FindBy(how = How.XPATH, using = ".//*[@id='staff']/table/tbody/tr[4]/td/table/tbody/tr/td/table/tbody/tr/td/table[1]/tbody/tr/td[2]/table/tbody/tr/td/fieldset/table/tbody/tr[3]/td[3]/table/tbody/tr/td[3]/a/img")
					public static WebElement userJoiningDateCalendar;
					
					@FindBy(how = How.XPATH, using = "html/body/div/table/tbody/tr[2]/th[2]/select[2]")
					public static WebElement joiningYear;
					
					@FindBy(how = How.XPATH, using = "html/body/div/table/tbody/tr[2]/th[2]/select[1]")
					public static WebElement joiningMonth;
					
					@FindBy(how = How.XPATH, using = "html/body/div/table/tbody/tr[4]/td[6]/a")
					public static WebElement joiningDay;
					
					@FindBy(how = How.ID, using = "noaccs")
					public static WebElement userNoAccess;
					
					@FindBy(how = How.ID, using = "r4")
					public static WebElement userAccess;
					
					@FindBy(how = How.ID, using = "values[SCHOOL][OPENSIS_PROFILE]")
					public static WebElement userProfile;
								
					@FindBy(how = How.ID, using = "USERNAME")
					public static WebElement enterUserName;
					
					@FindBy(how = How.ID, using = "PASSWORD")
					public static WebElement enterPassword;
					
					@FindBy(how = How.CLASS_NAME, using = "btn_medium")
					public static WebElement clickSaveButton;
					
				}
				
			}
			
		}
	}

}
