package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Myinfo {
	WebDriver obj;
	public Myinfo(WebDriver obj) {
		this.obj=obj;
	}
	public WebElement getMyinfo(){
		return obj.findElement(By.xpath("//a[@id='menu_pim_viewMyDetails']"));
	}
	public WebElement getPersonalinfoLabel() {
		return obj.findElement(By.xpath("//li[@class='selected']"));
	}
	
	public void myinfo() {
		getMyinfo().click();
	}

}
