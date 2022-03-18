package com.OrangeHRMTesting;

import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Browsercode.BrowserCode;
import com.Pages.DashboardLabel;
import com.Pages.ForgotPassword;
import com.Pages.Login;
import com.Pages.Myinfo;
import com.Pages.PersonalingFullNameTabs;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class OrangeHRMTesting extends BrowserCode {
	static ExtentTest test;
	static ExtentReports report;
	
	@BeforeClass(alwaysRun=true)
	public static void startTest() {
		report=new ExtentReports("ResultHRM/Result.html",true);
	}
	
	@Test(description="verify that user is unable to login successfully with invalid credentials")
	public void TC1() 
	{	test=report.startTest("verify that user is unable to login successfully with invalid credentials");
	Login loginpage=new Login(obj);
	loginpage.LoginPage("Admin","admin1234");
	if(loginpage.getinvalidMessageLabel().isDisplayed()) {
		test.log(LogStatus.PASS,"user is not able to login");
	}else
	{test.log(LogStatus.FAIL,"user is able to login with invalid data");
		}
	
	}
	
	@Test(description="verify forgot password")
	public void TC2() {
		test=report.startTest("verify that forgot password link is working or not");
		//LoginPage loginpage=new LoginPage(driver);
		//loginpage.Forgotpassword();
		obj.findElement(By.xpath("//a[normalize-space()='Forgot your password?']")).click();
		if(new ForgotPassword(obj).getResetLabel().isDisplayed()) {
			test.log(LogStatus.PASS, "User is able to jump to reset link");
		}else {test.log(LogStatus.FAIL, "User is not able to jump to reset link");}
		obj.navigate().back();}
	
	
	
	
	@Test (description="verify that user is able to login successfully with valid credentials")
	public void TC3() {
		test=report.startTest("verify that user is able to login successfully with valid credentials");
		Login loginpage=new Login(obj);
		loginpage.LoginPage("Admin","admin123");
		//Dashboard dash=new Dashboard(driver);
		if(new DashboardLabel(obj).getDashboardLabel().isDisplayed()) {
			test.log(LogStatus.PASS,"user is able to login usong valid data");
		}else {test.log(LogStatus.FAIL,"user is unable to login");
		
		}}
		@Test(description="Verify personal info page")
		public void TC4()  {
			test=report.startTest("verify that personal info page is display");
			Myinfo info=new Myinfo(obj);
			info.myinfo();
			if(info.getPersonalinfoLabel().isDisplayed())
			{
				test.log(LogStatus.PASS, "personal info label is displayed");
				}else {test.log(LogStatus.FAIL, "Personal info label is not displayed");}
			
		}
		@Test(description="verify first name tab")
		public void TC5() {
			test=report.startTest("verify first name tab");
			//obj.findElement(By.id("btnSave")).click();
			PersonalingFullNameTabs name=new PersonalingFullNameTabs(obj);
			name.Name("te/256","890","#$");
			if (name.getSuccessfullySaveLabel().isDisplayed())
			{test.log(LogStatus.FAIL,"Full name tab is accepting alphabets,numerical value,special characters");
			}else
			 {test.log(LogStatus.PASS, "Full name tab accepts alphabets only");
				}
			 }
		
	
	
	
	
	

	

	@AfterClass(alwaysRun=true)
	public static void endTest()
	{
		report.endTest(test);
		report.flush();
	}
	}


