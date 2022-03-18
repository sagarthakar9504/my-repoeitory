package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DashboardLabel {

		WebDriver obj;
		public DashboardLabel(WebDriver obj) {
		this.obj=obj;
		}
		public WebElement getDashboardLabel() {
			return obj.findElement(By.xpath("//h1[normalize-space()='Dashboard']"));
		}
	}


