package com.Os4ed.Modules;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.Os4ed.Pages.CreateHomePage;
import com.Os4ed.Pages.CreateStudentPage;
import com.Os4ed.Test.SelTestCase;
import com.Os4ed.Utils.Log;

public class StudentPageAction extends SelTestCase {
	
		public static void executeEventsOnStudentPage() throws InterruptedException {
			Log.info("Events Going to Performed on Student Page ");
			
			driver.switchTo().frame("body");
			CreateHomePage.HomePageDetails.studentsLink.click();
			Thread.sleep(2000);
			Log.info("Clicking on Student Tab");
			
			CreateStudentPage.StudentPageDetails.addAStudent.click();
			Thread.sleep(1000);
			//Adding a Student
			Log.info("Clicking on Add a Student tab");
			CreateStudentPage.StudentPageDetails.AddStudentPageDetails.GeneralInfoDetails.firstName.clear();
			CreateStudentPage.StudentPageDetails.AddStudentPageDetails.GeneralInfoDetails.firstName.sendKeys("Alberto");
			Thread.sleep(1000);
			Log.info("Entering Student First Name");
			CreateStudentPage.StudentPageDetails.AddStudentPageDetails.GeneralInfoDetails.lastName.clear();
			CreateStudentPage.StudentPageDetails.AddStudentPageDetails.GeneralInfoDetails.lastName.sendKeys("Torris");
			Thread.sleep(1000);
			Log.info("Entering Student Last Name");
			WebElement gender = CreateStudentPage.StudentPageDetails.AddStudentPageDetails.GeneralInfoDetails.selectGender;
			Select selectGender = new Select(gender);
			selectGender.selectByValue("Male");
			Thread.sleep(1000);
			Log.info("Selecting Student's Gender");
			CreateStudentPage.StudentPageDetails.AddStudentPageDetails.GeneralInfoDetails.studentDOBCalender.click();
			Thread.sleep(1000);
			WebElement dobyear = CreateStudentPage.StudentPageDetails.AddStudentPageDetails.GeneralInfoDetails.selectYear;
			Select selectYear = new Select(dobyear);
			selectYear.selectByValue("2010");
			Thread.sleep(1000);
			WebElement dobmonth = CreateStudentPage.StudentPageDetails.AddStudentPageDetails.GeneralInfoDetails.selectMonth;
			Select selectMonth = new Select(dobmonth);
			selectMonth.selectByValue("0");
			Thread.sleep(1000);
			CreateStudentPage.StudentPageDetails.AddStudentPageDetails.GeneralInfoDetails.selectDay.click();
			Thread.sleep(1000);
			Log.info("Entering Student DOB using Calendar");
			WebElement grade = CreateStudentPage.StudentPageDetails.AddStudentPageDetails.GeneralInfoDetails.selectGrade;
			Select selectGrade = new Select(grade);
			selectGrade.selectByValue("2");
			Thread.sleep(1000);
			Log.info("Selecting Student Grade Level");
			CreateStudentPage.StudentPageDetails.AddStudentPageDetails.GeneralInfoDetails.enterUserName.clear();
			CreateStudentPage.StudentPageDetails.AddStudentPageDetails.GeneralInfoDetails.enterUserName.sendKeys("alberto");
			Thread.sleep(1000);
			Log.info("Entering Student Username");
			CreateStudentPage.StudentPageDetails.AddStudentPageDetails.GeneralInfoDetails.enterPassword.clear();
			CreateStudentPage.StudentPageDetails.AddStudentPageDetails.GeneralInfoDetails.enterPassword.sendKeys("alberto@123");
			Thread.sleep(1000);
			Log.info("Entering Student Password");
			CreateStudentPage.StudentPageDetails.AddStudentPageDetails.GeneralInfoDetails.clickSaveAndNextButton.click();
			Thread.sleep(1000);
			Log.info("Clicking on Save&Next Button");
			WebElement enrollmentCode = CreateStudentPage.StudentPageDetails.AddStudentPageDetails.GeneralInfoDetails.EnrollmentInfoDetails.selectEnrollmentCode;
			Select selectEnrollmentCode = new Select(enrollmentCode);
			selectEnrollmentCode.selectByValue("5");
			Thread.sleep(5000);
			Log.info("Selecting Student's Enrollment Code");
			CreateStudentPage.StudentPageDetails.AddStudentPageDetails.GeneralInfoDetails.EnrollmentInfoDetails.clickSaveButton.click();
			Thread.sleep(1000);
			Log.info("Clicking on Save Button");
			/*CreateStudentPage.StudentPageDetails.studentInfo.click();
			Thread.sleep(2000);*/
			CreateStudentPage.StudentPageDetails.AddStudentPageDetails.addressAndContactsTab.click();
			Thread.sleep(500);
			Log.info("Clicking on Address and Contact tab");
			CreateStudentPage.StudentPageDetails.AddStudentPageDetails.GeneralInfoDetails.EnrollmentInfoDetails.AddressAndContactDetails.studentAddress.clear();
			CreateStudentPage.StudentPageDetails.AddStudentPageDetails.GeneralInfoDetails.EnrollmentInfoDetails.AddressAndContactDetails.studentAddress.sendKeys("Barrackpore");
			Thread.sleep(500);
			Log.info("Entering Student Address");
			CreateStudentPage.StudentPageDetails.AddStudentPageDetails.GeneralInfoDetails.EnrollmentInfoDetails.AddressAndContactDetails.studentCity.sendKeys("Kolkata");
			Thread.sleep(500);
			Log.info("Entering Student City");
			CreateStudentPage.StudentPageDetails.AddStudentPageDetails.GeneralInfoDetails.EnrollmentInfoDetails.AddressAndContactDetails.studentState.sendKeys("WB");
			Thread.sleep(500);
			Log.info("Entering Student State");
			CreateStudentPage.StudentPageDetails.AddStudentPageDetails.GeneralInfoDetails.EnrollmentInfoDetails.AddressAndContactDetails.studentZipCode.sendKeys("700120");
			Thread.sleep(500);
			Log.info("Entering Student Zip Code");
			
			// Student's Father Details
			WebElement primary = CreateStudentPage.StudentPageDetails.AddStudentPageDetails.GeneralInfoDetails.EnrollmentInfoDetails.AddressAndContactDetails.selectPrimaryRelationship;
			Select primaryRelationship = new Select(primary);
			primaryRelationship.selectByValue("Father");
			Thread.sleep(500);
			Log.info("Selecting Primary Relationship as Father");
			CreateStudentPage.StudentPageDetails.AddStudentPageDetails.GeneralInfoDetails.EnrollmentInfoDetails.AddressAndContactDetails.primaryFirstName.sendKeys("Mike");
			Thread.sleep(500);
			Log.info("Entering Father First Name");
			CreateStudentPage.StudentPageDetails.AddStudentPageDetails.GeneralInfoDetails.EnrollmentInfoDetails.AddressAndContactDetails.primaryLastName.sendKeys("Torris");
			Thread.sleep(500);
			Log.info("Entering Father Last Name");
			CreateStudentPage.StudentPageDetails.AddStudentPageDetails.GeneralInfoDetails.EnrollmentInfoDetails.AddressAndContactDetails.primaryEmail.sendKeys("mike@gmail.com");
			Thread.sleep(500);
			Log.info("Entering Father Email Id");
			CreateStudentPage.StudentPageDetails.AddStudentPageDetails.GeneralInfoDetails.EnrollmentInfoDetails.AddressAndContactDetails.clickPrimaryUserChkbx.click();
			Thread.sleep(500);
			Log.info("Clicking on Portal User Checkbox for Father");
			CreateStudentPage.StudentPageDetails.AddStudentPageDetails.GeneralInfoDetails.EnrollmentInfoDetails.AddressAndContactDetails.primaryUserName.sendKeys("mike");
			Thread.sleep(500);
			Log.info("Entering Father UserName");
			CreateStudentPage.StudentPageDetails.AddStudentPageDetails.GeneralInfoDetails.EnrollmentInfoDetails.AddressAndContactDetails.primaryPassword.sendKeys("mike@123");
			Thread.sleep(500);
			Log.info("Entering Father Password");
			
			// Student's Mother Details
			WebElement secondary = CreateStudentPage.StudentPageDetails.AddStudentPageDetails.GeneralInfoDetails.EnrollmentInfoDetails.AddressAndContactDetails.selectSecondaryRelationship;
			Select secondaryRelationship = new Select(secondary);
			secondaryRelationship.selectByValue("Mother");
			Thread.sleep(500);
			Log.info("Selecting Secondary Relationship as Mother");
			CreateStudentPage.StudentPageDetails.AddStudentPageDetails.GeneralInfoDetails.EnrollmentInfoDetails.AddressAndContactDetails.secondaryFirstName.sendKeys("Ema");
			Thread.sleep(500);
			Log.info("Entering Mother First Name");
			CreateStudentPage.StudentPageDetails.AddStudentPageDetails.GeneralInfoDetails.EnrollmentInfoDetails.AddressAndContactDetails.secondaryLastName.sendKeys("Torris");
			Thread.sleep(500);
			Log.info("Entering Mother Last Name");
			CreateStudentPage.StudentPageDetails.AddStudentPageDetails.GeneralInfoDetails.EnrollmentInfoDetails.AddressAndContactDetails.secondaryEmail.sendKeys("ema@gmail.com");
			Thread.sleep(500);
			Log.info("Entering Mother Email Id");
			CreateStudentPage.StudentPageDetails.AddStudentPageDetails.GeneralInfoDetails.EnrollmentInfoDetails.AddressAndContactDetails.clicksecondaryUserChkbx.click();
			Thread.sleep(500);
			Log.info("Clicking on Portal User Checkbox for Mother");
			CreateStudentPage.StudentPageDetails.AddStudentPageDetails.GeneralInfoDetails.EnrollmentInfoDetails.AddressAndContactDetails.secondaryUserName.sendKeys("ema");
			Thread.sleep(500);
			Log.info("Entering Mother UserName");
			CreateStudentPage.StudentPageDetails.AddStudentPageDetails.GeneralInfoDetails.EnrollmentInfoDetails.AddressAndContactDetails.secondaryPassword.sendKeys("ema@123");
			Thread.sleep(500);
			Log.info("Entering Mother Password");
			CreateStudentPage.StudentPageDetails.AddStudentPageDetails.GeneralInfoDetails.EnrollmentInfoDetails.AddressAndContactDetails.clickSaveButton.click();
			Thread.sleep(500);
			Log.info("Clicking on Save Button");
			
			driver.switchTo().defaultContent();
			
			
		}
}
