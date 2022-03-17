package com.abc.OrangeHrms;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.abc.OrangeHRMs.Dashboard;
import com.abc.OrangeHRMs.LoginPage;
import com.commonfunctinality.BrowserLaunch;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class LoginPageTest extends BrowserLaunch {
	
	static ExtentTest test;
	static ExtentReports report;
	@BeforeClass(alwaysRun=true)
	public static void startTest() {
		report=new ExtentReports("Result/Result.html",true);
	}
	
	@Test (description="verify that user is able to login successfully with valid credentials")
	public void TC1() {
		test=report.startTest("verify that user is able to login successfully with valid credentials");
		LoginPage loginpage=new LoginPage(driver);
		loginpage.Login("Admin","admin123");
		if(new Dashboard(driver).getDashboardLabel().isDisplayed()) {
			test.log(LogStatus.PASS,"user is able to login");
		}else {test.log(LogStatus.FAIL,"user is unable to login");
		
		}
		
		
	}
	@Test(description="verify that user is unable to login successfully with invalid credentials")
	public void TC2() {	test=report.startTest("verify that user is unable to login successfully with invalid credentials");
	LoginPage loginpage=new LoginPage(driver);
	loginpage.Login("Admin","admin1203");
	if(new LoginPage(driver).getinvalidMessageLabel().isDisplayed()) {
		test.log(LogStatus.PASS,"user is not able to login");
	}else {test.log(LogStatus.FAIL,"user is able to login");
	}
	
	}
	@AfterClass(alwaysRun=true)
	public static void endTest()
	{
		report.endTest(test);
	report.flush();
	}
	



		
	}


