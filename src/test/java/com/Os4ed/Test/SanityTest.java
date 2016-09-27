package com.Os4ed.Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Os4ed.Modules.AssignmentPageAction;
import com.Os4ed.Modules.AttendancePageAction;
import com.Os4ed.Modules.CoursePageAction;
import com.Os4ed.Modules.GradesPageAction;
import com.Os4ed.Modules.LoginPageAction;
import com.Os4ed.Modules.SchedulePageAction;
import com.Os4ed.Modules.SchoolSetupPageAction;
import com.Os4ed.Modules.StudentPageAction;
import com.Os4ed.Modules.TeacherLoginPageAction;
import com.Os4ed.Modules.UserPageAction;
import com.Os4ed.Pages.CreateAssignmentPage;
import com.Os4ed.Pages.CreateAttendancePage;
import com.Os4ed.Pages.CreateCoursePage;
import com.Os4ed.Pages.CreateGradesPage;
import com.Os4ed.Pages.CreateHomePage;
import com.Os4ed.Pages.CreateLoginPage;
import com.Os4ed.Pages.CreateSchedulePage;
import com.Os4ed.Pages.CreateSchoolSetupPage;
import com.Os4ed.Pages.CreateStudentPage;
import com.Os4ed.Pages.CreateUserPage;
import com.Os4ed.Utils.Log;


public class SanityTest extends SelTestCase {
	
	@Test(priority = 1)
	public void OpenSIS() throws InterruptedException {
		PageFactory.initElements(driver, CreateLoginPage.class);
		PageFactory.initElements(driver, CreateLoginPage.LoginPageDetails.class);
		LoginPageAction.executeEventsOnLoginPage();
		Thread.sleep(5000);
		PageFactory.initElements(driver, CreateHomePage.class);
		PageFactory.initElements(driver, CreateHomePage.HomePageDetails.class);
		PageFactory.initElements(driver, CreateSchoolSetupPage.class);
		PageFactory.initElements(driver, CreateSchoolSetupPage.SchoolSetupPageDetails.class);
		PageFactory.initElements(driver, CreateSchoolSetupPage.SchoolSetupPageDetails.CalendarPageDetails.class);
		PageFactory.initElements(driver, CreateSchoolSetupPage.SchoolSetupPageDetails.CalendarPageDetails.MarkingPeriodPageDetails.class);
		PageFactory.initElements(driver, CreateSchoolSetupPage.SchoolSetupPageDetails.CalendarPageDetails.MarkingPeriodPageDetails.RoomPageDetails.class);
		PageFactory.initElements(driver, CreateSchoolSetupPage.SchoolSetupPageDetails.CalendarPageDetails.MarkingPeriodPageDetails.RoomPageDetails.PeriodPageDetails.class);
		PageFactory.initElements(driver, CreateSchoolSetupPage.SchoolSetupPageDetails.CalendarPageDetails.MarkingPeriodPageDetails.RoomPageDetails.PeriodPageDetails.GradeLabelsPageDetails.class);
		PageFactory.initElements(driver, CreateGradesPage.class);
		PageFactory.initElements(driver, CreateGradesPage.GradesPageDetails.class);
		PageFactory.initElements(driver, CreateGradesPage.GradesPageDetails.ReportCardGradesDetails.class);
		PageFactory.initElements(driver, CreateAttendancePage.class);
		PageFactory.initElements(driver, CreateAttendancePage.AttendancePageDetails.class);
		PageFactory.initElements(driver, CreateStudentPage.class);
		PageFactory.initElements(driver, CreateStudentPage.StudentPageDetails.class);
		PageFactory.initElements(driver, CreateStudentPage.StudentPageDetails.AddStudentPageDetails.class);
		PageFactory.initElements(driver, CreateStudentPage.StudentPageDetails.AddStudentPageDetails.GeneralInfoDetails.class);
		PageFactory.initElements(driver, CreateStudentPage.StudentPageDetails.AddStudentPageDetails.GeneralInfoDetails.EnrollmentInfoDetails.class);
		PageFactory.initElements(driver, CreateStudentPage.StudentPageDetails.AddStudentPageDetails.GeneralInfoDetails.EnrollmentInfoDetails.AddressAndContactDetails.class);
		PageFactory.initElements(driver, CreateUserPage.class);
		PageFactory.initElements(driver, CreateUserPage.UserPageDetails.class);
		PageFactory.initElements(driver, CreateUserPage.UserPageDetails.AddStaffPageDetails.class);
		PageFactory.initElements(driver, CreateUserPage.UserPageDetails.AddStaffPageDetails.DemographicInfoDetails.class);
		PageFactory.initElements(driver, CreateUserPage.UserPageDetails.AddStaffPageDetails.DemographicInfoDetails.SchoolInformationDetails.class);
		PageFactory.initElements(driver, CreateCoursePage.class);
		PageFactory.initElements(driver, CreateCoursePage.CoursePageDetails.class);
		PageFactory.initElements(driver, CreateSchedulePage.class);
		PageFactory.initElements(driver, CreateSchedulePage.SchedulePageDetails.class);
		PageFactory.initElements(driver, CreateSchedulePage.SchedulePageDetails.StudentSchedulePageDetails.class);
		
		
		
		try {
		SchoolSetupPageAction.executeEventsOnSchoolSetupPage();
		Thread.sleep(5000);
		Log.info("Setup Page Action Performed Successfully");
		} catch (Exception e) {
			Log.info("Setup Page Action does not Performed Successfully");
			e.printStackTrace();
		}
		
		try {
		GradesPageAction.executeEventsOnGradesPage();
		Thread.sleep(5000);
		Log.info("Grade Page Action Performed Successfully");
		} catch (Exception e) {
			Log.info("Grade Page Action does not Performed Successfully");
			e.printStackTrace();
		}
		
		try {
		AttendancePageAction.executeEventsOnAttendancePage();
		Thread.sleep(5000);
		Log.info("Attendance Page Action Performed Successfully");
		} catch (Exception e) {
			Log.info("Attendance Page Action does not Performed Successfully");
			e.printStackTrace();
		}
	
		try {
		StudentPageAction.executeEventsOnStudentPage();
		Thread.sleep(5000);
		Log.info("Student Page Action Performed Successfully");
		} catch (Exception e) {
			Log.info("Student Page Action does not Performed Successfully");
			e.printStackTrace();
		}
		
		try {
		UserPageAction.executeEventsOnUserPage();
		Thread.sleep(5000);
		Log.info("User Page Action Performed Successfully");
		} catch (Exception e) {
			Log.info("User Page Action does not Performed Successfully");
			e.printStackTrace();
			
		}
		
		try {
		CoursePageAction.executeEventsOnCoursePage();
		Thread.sleep(5000);
		Log.info("Course Page Action Performed Successfully");
		} catch (Exception e) {
			Log.info("Course Page Action does not Performed Successfully");
			e.printStackTrace();
		}
		
		try {
		SchedulePageAction.executeEventsOnSchedulePage();
		Thread.sleep(5000);
		Log.info("Schedule Page Action Performed Successfully");
		} catch (Exception e) {
			Log.info("Schedule Page Action does not Performed Successfully");
			e.printStackTrace();
		}
		
		driver.navigate().to("http://localhost/openSIS_Update/openSIS_CE/index.php?modfunc=logout");
		Log.info("Clicking on LogOut Button");
		Thread.sleep(5000);
		
	}
	
	@Test(priority = 2)
	public void OpenSISTest() throws InterruptedException {
	
		PageFactory.initElements(driver, CreateLoginPage.class);
		PageFactory.initElements(driver, CreateLoginPage.LoginPageDetails.class);
		PageFactory.initElements(driver, CreateHomePage.class);
		PageFactory.initElements(driver, CreateHomePage.HomePageDetails.class);
		PageFactory.initElements(driver, CreateGradesPage.class);
		PageFactory.initElements(driver, CreateGradesPage.GradesPageDetails.class);
		PageFactory.initElements(driver, CreateAssignmentPage.class);
		PageFactory.initElements(driver, CreateAssignmentPage.AssignmentPageDetails.class);
		
		
		try{
		TeacherLoginPageAction.executeEventsOnTeacherLoginPage();
		Thread.sleep(5000);
		Log.info("Login Action Performed Successfully");
		} catch (Exception e) {
			Log.info("Login Action does not Performed Successfully");
			e.printStackTrace();
		}
		
		try{
		AssignmentPageAction.executeEventsOnAssignmentPage();
		Thread.sleep(5000);
		Log.info("Assignment Page Action Performed Successfully");	
		} catch (Exception e) {
			Log.info("Assignment Page Action does not Performed Successfully");
			e.printStackTrace();
		}
		
		
		
		
		driver.navigate().to("http://localhost/openSIS_Update/openSIS_CE/index.php?modfunc=logout");
		Log.info("Clicking on LogOut Button");
		
	}
}
