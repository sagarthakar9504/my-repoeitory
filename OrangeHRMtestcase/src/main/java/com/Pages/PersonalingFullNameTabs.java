package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PersonalingFullNameTabs {
	WebDriver obj;
	public PersonalingFullNameTabs(WebDriver obj) {
	this.obj=obj;
	}
	public WebElement getFirstname(){
		return obj.findElement(By.xpath("//input[@id='personal_txtEmpFirstName']"));
	}
	public WebElement getMiddlename(){
		return obj.findElement(By.xpath("//input[@id='personal_txtEmpMiddleName']"));
	}
	public WebElement getlastname(){
		return obj.findElement(By.xpath("//input[@id='personal_txtEmpLastName']"));
	}
	public WebElement getSuccessfullySaveLabel() {
		return obj.findElement(By.xpath("//div[@class='message success fadable']"));
	}
	
	public void Name(String firstname, String middlename, String lastname) {
		obj.findElement(By.xpath("//input[@id='btnSave']")).click();
		getFirstname().sendKeys(firstname);
		getMiddlename().sendKeys(middlename);
		getlastname().sendKeys(lastname);
		obj.findElement(By.id("btnSave")).click();
		
		
	}



}
