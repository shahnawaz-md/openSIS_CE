package com.Os4ed.Modules;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.Os4ed.Pages.CreateHomePage;
import com.Os4ed.Pages.CreateUserPage;
import com.Os4ed.Test.SelTestCase;
import com.Os4ed.Utils.Log;

public class UserPageAction extends SelTestCase {
	
	public static void executeEventsOnUserPage() throws InterruptedException {
		Log.info("Events Going to Performed on User Page");
		
		driver.switchTo().frame("body");
		CreateHomePage.HomePageDetails.usersLink.click();
		Thread.sleep(2000);
		Log.info("Clicking on Users Tab");
		
		CreateUserPage.UserPageDetails.staffTab.click();
		Thread.sleep(1000);
		Log.info("Clicking  on Staff Tab");
		CreateUserPage.UserPageDetails.addAStaff.click();
		Thread.sleep(1000);
		Log.info("Clicking  on Add a Staff Tab");
		WebElement salutation = CreateUserPage.UserPageDetails.AddStaffPageDetails.DemographicInfoDetails.teacherSalutation;
		Select selectSalutation = new Select(salutation);
		selectSalutation.selectByValue("Mr.");
		Thread.sleep(1000);
		Log.info("Select Staff Salutation");
		CreateUserPage.UserPageDetails.AddStaffPageDetails.DemographicInfoDetails.teacherFirstName.sendKeys("Mitchell");
		Thread.sleep(1000);
		Log.info("Enter Staff First Name");
		CreateUserPage.UserPageDetails.AddStaffPageDetails.DemographicInfoDetails.teacherLastName.sendKeys("Johnson");
		Thread.sleep(1000);
		Log.info("Enter Staff Last Name");
		WebElement gender = CreateUserPage.UserPageDetails.AddStaffPageDetails.DemographicInfoDetails.teacherGender;
		Select selectGender = new Select(gender);
		selectGender.selectByValue("Male");
		Thread.sleep(1000);
		Log.info("Select Staff Gender");
		CreateUserPage.UserPageDetails.AddStaffPageDetails.DemographicInfoDetails.teacherEmail.sendKeys("mitchell@gmail.com");
		Thread.sleep(1000);
		Log.info("Enter Staff Email Id");
		CreateUserPage.UserPageDetails.AddStaffPageDetails.DemographicInfoDetails.saveAndNextButton.click();
		Thread.sleep(1000);
		Log.info("Clicking  on Save&Next Button");
		WebElement category = CreateUserPage.UserPageDetails.AddStaffPageDetails.DemographicInfoDetails.SchoolInformationDetails.userCategory;
		Select selectCategory = new Select(category);
		selectCategory.selectByValue("Teacher");
		Thread.sleep(1000);
		Log.info("Select Staff Category");
		CreateUserPage.UserPageDetails.AddStaffPageDetails.DemographicInfoDetails.SchoolInformationDetails.userJobTitle.sendKeys("Teacher");
		Thread.sleep(1000);
		Log.info("Enter Staff Job Title");
		CreateUserPage.UserPageDetails.AddStaffPageDetails.DemographicInfoDetails.SchoolInformationDetails.userJoiningDateCalendar.click();
		Thread.sleep(1000);
		Log.info("Clicking  on Staff Joining Calendar");
		WebElement year = CreateUserPage.UserPageDetails.AddStaffPageDetails.DemographicInfoDetails.SchoolInformationDetails.joiningYear;
		Select selectYear = new Select(year);
		selectYear.selectByValue("2016");
		Thread.sleep(1000);
		Log.info("Select Staff Joining Year");
		WebElement month = CreateUserPage.UserPageDetails.AddStaffPageDetails.DemographicInfoDetails.SchoolInformationDetails.joiningMonth;
		Select selectMonth = new Select(month);
		selectMonth.selectByValue("0");
		Thread.sleep(1000);
		Log.info("Select Staff Joining Month");
		CreateUserPage.UserPageDetails.AddStaffPageDetails.DemographicInfoDetails.SchoolInformationDetails.joiningDay.click();
		Thread.sleep(1000);
		Log.info("Clicking  on Staff Joining Day");
		CreateUserPage.UserPageDetails.AddStaffPageDetails.DemographicInfoDetails.SchoolInformationDetails.userAccess.click();
		Thread.sleep(1000);
		Log.info("Clicking  on Staff Access Checkbox");
		WebElement profile = CreateUserPage.UserPageDetails.AddStaffPageDetails.DemographicInfoDetails.SchoolInformationDetails.userProfile;
		Select selectProfile = new Select(profile);
		selectProfile.selectByValue("2");
		Thread.sleep(1000);
		Log.info("Select Staff Profile");
		CreateUserPage.UserPageDetails.AddStaffPageDetails.DemographicInfoDetails.SchoolInformationDetails.enterUserName.sendKeys("mitchell");
		Thread.sleep(1000);
		Log.info("Enter Staff User Name");
		CreateUserPage.UserPageDetails.AddStaffPageDetails.DemographicInfoDetails.SchoolInformationDetails.enterPassword.sendKeys("mitchell@123");
		Thread.sleep(1000);
		Log.info("Enter Staff Password");
		CreateUserPage.UserPageDetails.AddStaffPageDetails.DemographicInfoDetails.SchoolInformationDetails.clickSaveButton.click();
		Thread.sleep(1000);
		Log.info("Clicking  on Save Button");
		
		driver.switchTo().defaultContent();
		
	}

}
