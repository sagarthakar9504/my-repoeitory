package com.abc.OrangeHRMs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	public static WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebElement getUsernametxt() {
		return driver.findElement(By.id("txtUsername"));
		
	}
	public WebElement getPasswordtxt() {
		return driver.findElement(By.xpath("//input[@id=\"txtPassword\"]"));
	}
	public WebElement getLoginbtn() {
		return driver.findElement(By.id("btnLogin"));
	}
	public WebElement getInvalidmassagelable() {
		return driver.findElement(By.id("spanMessage"));
	}
	
}
