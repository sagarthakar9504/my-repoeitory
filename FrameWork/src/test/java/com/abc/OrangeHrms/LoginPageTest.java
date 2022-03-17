package com.abc.OrangeHrms;

import org.testng.annotations.Test;

import com.abc.OrangeHRMs.LoginPage;
import com.commonfunctinality.BrowserLaunch;

public class LoginPageTest extends BrowserLaunch {
	
	@Test(description="user should login with valid username and valid password")
	public static void TC1(String Username, String Password) {
		LoginPage loginpage=new LoginPage(driver);

		loginpage.getUsernametxt().sendKeys(Username);
		loginpage.getPasswordtxt().sendKeys(Password);
		loginpage.getLoginbtn().click();
//		if()
		
		
	}

}
