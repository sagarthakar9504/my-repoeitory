package com.Browsercode;

//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;

public class BrowserCode {

	public static WebDriver obj;//to get the common object we made common driver variable
	//public static Properties property;
	public static ExtentReports reports;

	@BeforeSuite
	public void BrowserLoading() {
	//	ReadProperty();
		//String Browsername  =property.getProperty("Browsername");
		//Browsername.equalsIgnoreCase("Chrome");
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		obj=new ChromeDriver();
		obj.get("https://opensource-demo.orangehrmlive.com/");
		obj.manage().window().maximize();
		
	//driver.get(property.getProperty("url"));
	}
	//public static void ReadProperty() {
		//try {
		 //property=new Properties();
		//property.load(new FileInputStream("src/main/resources/config.properties"));
		//property.getProperty("Browsername");
	//}catch(FileNotFoundException e) {
		
	//}catch(IOException t) {
		
	//}
	
//}
	@AfterSuite(alwaysRun=true)
	public void TearDown() {
		obj.quit();
	}
}
		


