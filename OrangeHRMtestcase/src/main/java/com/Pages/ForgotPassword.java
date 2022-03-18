package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ForgotPassword {
	WebDriver obj;
	public ForgotPassword(WebDriver obj) {
	this.obj=obj;
	}
	public WebElement getResetLabel() {
		return obj.findElement(By.xpath("//div[@class='formbuttons']"));
	}
}



