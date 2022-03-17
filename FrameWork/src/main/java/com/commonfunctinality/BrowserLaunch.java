package com.commonfunctinality;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserLaunch {
	public static WebDriver driver;
	public static Properties property;

	
	public static void BrowserOpen(String Browsername, String Url) throws FileNotFoundException, IOException {
		ReadProperty();
		if(Browsername.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", ".\\src\\main\\resources\\chromedriver.exe");
			 driver=new ChromeDriver();
			
		}else if(Browsername.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecho.driver",".\\src\\main\\resources\\chromedriver.exe");
			driver=new FirefoxDriver();
		}else {
			System.setProperty("webdriver.edge.driver", ".\\src\\main\\resources\\msedgedriver.exe");
		}  
		driver.get(property.getProperty(Url));
		
	}
	public static void ReadProperty() throws FileNotFoundException, IOException {
		property=new Properties();
		property.load(new FileInputStream(".\\src\\main\\resources\\config.properties"));
	}

}
