package com.Os4ed.Modules;

import com.Os4ed.Pages.CreateGradesPage;
import com.Os4ed.Pages.CreateHomePage;
import com.Os4ed.Test.SelTestCase;
import com.Os4ed.Utils.Log;

public class GradesPageAction extends SelTestCase {
	
	public static void executeEventsOnGradesPage() throws InterruptedException {
		Log.info("Events Going to Performed on Grades Page ");
		
		driver.switchTo().frame("body");
		CreateHomePage.HomePageDetails.gradesLink.click();
		Thread.sleep(2000);
		Log.info("Clicking on Grades Tab");
		CreateGradesPage.GradesPageDetails.setUpLink.click();
		Thread.sleep(1000);
		Log.info("Clicking on Setup Link");
		CreateGradesPage.GradesPageDetails.reportCardGrades.click();
		Thread.sleep(1000);
		Log.info("Clicking on Report Card Grades Link");
		CreateGradesPage.GradesPageDetails.ReportCardGradesDetails.gradeScaleTextBox.sendKeys("Main");
		Thread.sleep(1000);
		Log.info("Entering the Grade Scale Name");
		CreateGradesPage.GradesPageDetails.ReportCardGradesDetails.scaleValueTextBox.sendKeys("4");
		Thread.sleep(1000);
		Log.info("Entering the Grade Scale Value");
		CreateGradesPage.GradesPageDetails.ReportCardGradesDetails.sortOrderTextBox.sendKeys("1");
		Thread.sleep(1000);
		Log.info("Entering the Grade Value Sort Order");
		CreateGradesPage.GradesPageDetails.ReportCardGradesDetails.saveButton.click();
		Thread.sleep(2000);
		Log.info("Clicking on Save Button");
		CreateGradesPage.GradesPageDetails.ReportCardGradesDetails.mainGradeScaleTab.click();
		Thread.sleep(1000);
		Log.info("Clicking on Main Grade Scale Tab");
		
		// For A
		CreateGradesPage.GradesPageDetails.ReportCardGradesDetails.titleTextBox.clear();
		CreateGradesPage.GradesPageDetails.ReportCardGradesDetails.titleTextBox.sendKeys("A");
		Thread.sleep(1000);
		Log.info("Entering the First Name of Grade");
		CreateGradesPage.GradesPageDetails.ReportCardGradesDetails.breakOffTextBox.clear();
		CreateGradesPage.GradesPageDetails.ReportCardGradesDetails.breakOffTextBox.sendKeys("90");
		Thread.sleep(1000);
		Log.info("Entering the First Value of Grade");
		CreateGradesPage.GradesPageDetails.ReportCardGradesDetails.weightedGPTextBox.sendKeys("4");
		Thread.sleep(1000);
		Log.info("Entering the First Grade Weighted GP Value");
		CreateGradesPage.GradesPageDetails.ReportCardGradesDetails.unWeightedGPTextBox.sendKeys("4");
		Thread.sleep(1000);
		Log.info("Entering the First Grade Unweighted GP Value");
		CreateGradesPage.GradesPageDetails.ReportCardGradesDetails.orderTextBox.sendKeys("1");
		Thread.sleep(1000);
		Log.info("Entering the Sort Order of First Grade");
		CreateGradesPage.GradesPageDetails.ReportCardGradesDetails.saveButton.click();
		Thread.sleep(1000);
		Log.info("Clicking on Save Button For First Grade");
		
		//For B
		
		CreateGradesPage.GradesPageDetails.ReportCardGradesDetails.titleTextBox.clear();
		CreateGradesPage.GradesPageDetails.ReportCardGradesDetails.titleTextBox.sendKeys("B");
		Thread.sleep(1000);
		Log.info("Entering the Second Name of Grade");
		CreateGradesPage.GradesPageDetails.ReportCardGradesDetails.breakOffTextBox.clear();
		CreateGradesPage.GradesPageDetails.ReportCardGradesDetails.breakOffTextBox.sendKeys("80");
		Thread.sleep(1000);
		Log.info("Entering the Second Value of Grade");
		CreateGradesPage.GradesPageDetails.ReportCardGradesDetails.weightedGPTextBox.sendKeys("3");
		Thread.sleep(1000);
		Log.info("Entering the Second Grade Weighted GP Value");
		CreateGradesPage.GradesPageDetails.ReportCardGradesDetails.unWeightedGPTextBox.sendKeys("3");
		Thread.sleep(1000);
		Log.info("Entering the Second Grade Unweighted GP Value");
		CreateGradesPage.GradesPageDetails.ReportCardGradesDetails.orderTextBox.sendKeys("2");
		Thread.sleep(1000);
		Log.info("Entering the Sort Order of Second Grade");
		CreateGradesPage.GradesPageDetails.ReportCardGradesDetails.saveButton.click();
		Thread.sleep(1000);
		Log.info("Clicking on Save Button For Second Grade");
		
		//For C
		
		CreateGradesPage.GradesPageDetails.ReportCardGradesDetails.titleTextBox.clear();
		CreateGradesPage.GradesPageDetails.ReportCardGradesDetails.titleTextBox.sendKeys("C");
		Thread.sleep(1000);
		Log.info("Entering the Third Name of Grade");
		CreateGradesPage.GradesPageDetails.ReportCardGradesDetails.breakOffTextBox.clear();
		CreateGradesPage.GradesPageDetails.ReportCardGradesDetails.breakOffTextBox.sendKeys("70");
		Thread.sleep(1000);
		Log.info("Entering the Third Value of Grade");
		CreateGradesPage.GradesPageDetails.ReportCardGradesDetails.weightedGPTextBox.sendKeys("2");
		Thread.sleep(1000);
		Log.info("Entering the Third Grade Weighted GP Value");
		CreateGradesPage.GradesPageDetails.ReportCardGradesDetails.unWeightedGPTextBox.sendKeys("2");
		Thread.sleep(1000);
		Log.info("Entering the Third Grade Unweighted GP Value");
		CreateGradesPage.GradesPageDetails.ReportCardGradesDetails.orderTextBox.sendKeys("3");
		Thread.sleep(1000);
		Log.info("Entering the Sort Order of Third Grade");
		CreateGradesPage.GradesPageDetails.ReportCardGradesDetails.saveButton.click();
		Thread.sleep(1000);
		Log.info("Clicking on Save Button For Third Grade");
		
		//For D
		
		CreateGradesPage.GradesPageDetails.ReportCardGradesDetails.titleTextBox.clear();
		CreateGradesPage.GradesPageDetails.ReportCardGradesDetails.titleTextBox.sendKeys("D");
		Thread.sleep(1000);
		Log.info("Entering the Fourth Name of Grade");
		CreateGradesPage.GradesPageDetails.ReportCardGradesDetails.breakOffTextBox.clear();
		CreateGradesPage.GradesPageDetails.ReportCardGradesDetails.breakOffTextBox.sendKeys("60");
		Thread.sleep(1000);
		Log.info("Entering the Fourth Value of Grade");
		CreateGradesPage.GradesPageDetails.ReportCardGradesDetails.weightedGPTextBox.sendKeys("1");
		Thread.sleep(1000);
		Log.info("Entering the Fourth Grade Weighted GP Value");
		CreateGradesPage.GradesPageDetails.ReportCardGradesDetails.unWeightedGPTextBox.sendKeys("1");
		Thread.sleep(1000);
		Log.info("Entering the Fourth Grade Unweighted GP Value");
		CreateGradesPage.GradesPageDetails.ReportCardGradesDetails.orderTextBox.sendKeys("4");
		Thread.sleep(1000);
		Log.info("Entering the Sort Order of Fourth Grade");
		CreateGradesPage.GradesPageDetails.ReportCardGradesDetails.saveButton.click();
		Thread.sleep(1000);
		Log.info("Clicking on Save Button For Fourth Grade");
		
		//For F
		
		CreateGradesPage.GradesPageDetails.ReportCardGradesDetails.titleTextBox.clear();
		CreateGradesPage.GradesPageDetails.ReportCardGradesDetails.titleTextBox.sendKeys("F");
		Thread.sleep(1000);
		Log.info("Entering the Fifth Name of Grade");
		CreateGradesPage.GradesPageDetails.ReportCardGradesDetails.breakOffTextBox.clear();
		CreateGradesPage.GradesPageDetails.ReportCardGradesDetails.breakOffTextBox.sendKeys("50");
		Thread.sleep(1000);
		Log.info("Entering the Fifth Value of Grade");
		CreateGradesPage.GradesPageDetails.ReportCardGradesDetails.weightedGPTextBox.sendKeys("0");
		Thread.sleep(1000);
		Log.info("Entering the Fifth Grade Weighted GP Value");
		CreateGradesPage.GradesPageDetails.ReportCardGradesDetails.unWeightedGPTextBox.sendKeys("0");
		Thread.sleep(1000);
		Log.info("Entering the Fifth Grade Unweighted GP Value");
		CreateGradesPage.GradesPageDetails.ReportCardGradesDetails.orderTextBox.sendKeys("5");
		Thread.sleep(1000);
		Log.info("Entering the Sort Order of Fifth Grade");
		CreateGradesPage.GradesPageDetails.ReportCardGradesDetails.saveButton.click();
		Thread.sleep(1000);
		Log.info("Clicking on Save Button For Fifth Grade");
		
		driver.switchTo().defaultContent();
		
		
		
		
				
	}
}
