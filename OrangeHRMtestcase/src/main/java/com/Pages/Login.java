package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {
	WebDriver obj;
	public Login(WebDriver obj) {
		this.obj=obj;
	}
	public WebElement getUsernametxt()
	{return obj.findElement(By.id("txtUsername"));
	
	}
	public WebElement getPasswordtxt() {
		return obj.findElement(By.id("txtPassword"));
	}
	public WebElement getLoginBtn() {
		return obj.findElement(By.id("btnLogin"));
	}
	public  WebElement getinvalidMessageLabel() {
		return obj.findElement(By.xpath("//span[@id='spanMessage']"));
	}
	
	public void LoginPage(String username, String password) {
		getUsernametxt().sendKeys(username);
		getPasswordtxt().sendKeys(password);
		getLoginBtn().click();
		
	}

}
