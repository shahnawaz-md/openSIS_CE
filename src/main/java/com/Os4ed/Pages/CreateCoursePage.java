package com.Os4ed.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CreateCoursePage {
	
	private WebDriver driver;
	
	public CreateCoursePage(WebDriver driver) {
		
		this.driver = driver;
		
	}
	
	public static class CoursePageDetails {
		
		@FindBy(how=How.XPATH, using = ".//*[@id='content']/table/tbody/tr/td/table[2]/tbody/tr/td/table/tbody/tr/td/a/img")
		public static WebElement addSubject;
		
		@FindBy(how=How.ID, using = "tables[course_subjects][new][TITLE]")
		public static WebElement subjectTitle;
		
		@FindBy(how=How.CLASS_NAME, using = "btn_medium")
		public static WebElement saveSubjectButton;
		
		@FindBy(how=How.XPATH, using = ".//*[@id='update_panel']/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr/td/a/img")
		public static WebElement addCourse;
		
		@FindBy(how=How.ID, using = "tables[courses][new][TITLE]")
		public static WebElement courseTitle;
		
		@FindBy(how=How.ID, using = "tables[courses][new][SHORT_NAME]")
		public static WebElement courseShortName;
		
		@FindBy(how=How.NAME, using = "tables[courses][new][GRADE_LEVEL]")
		public static WebElement selectGrade;
		
		@FindBy(how=How.CLASS_NAME, using = "btn_medium")
		public static WebElement saveCourseButton;
		
		@FindBy(how=How.XPATH, using = ".//*[@id='update_panel']/table/tbody/tr/td/table/tbody/tr/td[3]/table/tbody/tr/td/a/img")
		public static WebElement addCoursePeriod;
		
		@FindBy(how=How.ID, using = "tables[course_periods][new][SHORT_NAME]")
		public static WebElement coursePeriodShortName;
		
		@FindBy(how=How.ID, using = "calendar_id")
		public static WebElement selectCalendar;
		
		@FindBy(how=How.NAME, using = "tables[course_periods][new][TEACHER_ID]")
		public static WebElement selectPrimaryTeacher;
		
		@FindBy(how=How.NAME, using = "tables[course_periods][new][SECONDARY_TEACHER_ID]")
		public static WebElement selectSecondaryTeacher;
		
		@FindBy(how=How.ID, using = "tables[course_periods][new][TOTAL_SEATS]")
		public static WebElement enterSeats;
		
		@FindBy(how=How.XPATH, using = ".//*[@id='F2']/table[2]/tbody/tr[1]/td/font/b/table/tbody/tr[2]/td[1]/select")
		public static WebElement selectGradingScale;
		
		@FindBy(how=How.ID, using = "inputtables[course_periods][new][CREDITS]")
		public static WebElement enterCreditHours;
		
		@FindBy(how=How.NAME, using = "tables[course_periods][new][GENDER_RESTRICTION]")
		public static WebElement selectGenderRestriction;
		
		@FindBy(how=How.XPATH, using = ".//*[@id='F2']/table[2]/tbody/tr[1]/td/font/b/table/tbody/tr[2]/td[4]/a")
		public static WebElement ChooseParentPeriod;
		
		@FindBy(how=How.ID, using = "course_breakoff_id")
		public static WebElement chkbxAllowTeacherGradeScale;
		
		@FindBy(how=How.ID, using = "course_weight_id")
		public static WebElement chkbxCourseIsWeighted;
		
		@FindBy(how=How.NAME, using = "tables[course_periods][new][DOES_HONOR_ROLL]")
		public static WebElement chkbxAffectsHonorRoll;
		
		@FindBy(how=How.ID, using = "half_day")
		public static WebElement chkbxHalfDay;
		
		@FindBy(how=How.NAME, using = "tables[course_periods][new][DOES_CLASS_RANK]")
		public static WebElement chkbxAffectsClassRank;
		
		@FindBy(how=How.ID, using = "preset")
		public static WebElement clickMarkingPeriodRadioButton;
		
		@FindBy(how=How.ID, using = "marking_period")
		public static WebElement selectMarkingPeriod;
		
		@FindBy(how=How.ID, using = "custom")
		public static WebElement selectCustomDateRange;
		
		@FindBy(how=How.ID, using = "fixed_schedule")
		public static WebElement clickFixedScheduledRadioButton;
		
		@FindBy(how=How.ID, using = "F_room")
		public static WebElement selectClassRoom;
		
		@FindBy(how=How.ID, using = "F_period")
		public static WebElement selectPeriodFixedType;
		
		@FindBy(how=How.NAME, using = "tables[course_period_var][new][DAYS][M]")
		public static WebElement chkbxMonday;
		
		@FindBy(how=How.NAME, using = "tables[course_period_var][new][DAYS][T]")
		public static WebElement chkbxTuesday;
		
		@FindBy(how=How.NAME, using = "tables[course_period_var][new][DAYS][W]")
		public static WebElement chkbxWednesday;
		
		@FindBy(how=How.NAME, using = "tables[course_period_var][new][DAYS][H]")
		public static WebElement chkbxThursday;
		
		@FindBy(how=How.NAME, using = "tables[course_period_var][new][DAYS][F]")
		public static WebElement chkbxFriday;
		
		@FindBy(how=How.XPATH, using = ".//*[@id='divtables[course_period_var][new][DOES_ATTENDANCE]']/div/img")
		public static WebElement enableChkbxTakesAttendance;
		
		@FindBy(how=How.ID, using = "F_does_attendance")
		public static WebElement ChkbxTakesAttendanceFixedType;
		
		@FindBy(how=How.ID, using = "variable_schedule")
		public static WebElement clickVariableScheduledRadioButton;
		
		@FindBy(how=How.ID, using = "days")
		public static WebElement selectDays;
		
		@FindBy(how=How.ID, using = "F_period")
		public static WebElement selectPeriodVariableType;
		
		@FindBy(how=How.ID, using = "F_room")
		public static WebElement selectRoom;
		
		@FindBy(how=How.ID, using = "F_does_attendance")
		public static WebElement ChkbxTakesAttendanceVariableType;
		
		@FindBy(how=How.ID, using = "blocked_schedule")
		public static WebElement clickEnterByCalendarDaysRadioButton;
		
		@FindBy(how=How.CLASS_NAME, using = "btn_large")
		public static WebElement clickSaveAndContinueButton;
		
		@FindBy(how=How.CLASS_NAME, using = "btn_medium")
		public static WebElement saveCoursePeriodButton;
		
			
		
		
		
		
		
	}

}
