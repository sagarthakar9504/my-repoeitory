package selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiseFileExample {
	public static void main(String[]args) throws FileNotFoundException, IOException {
		//to read file from folder we have to create an object of properties class
		Properties obj=new Properties();
		//when we want to load file we use load() method with FileInputStream method
		// . represent the path of workspace and current java project
		obj.load(new FileInputStream("./config/config.properties"));
		//to get properties from properties file we use getProperty method
		System.out.println(obj.getProperty("Browsername"));
		System.out.println(obj.getProperty("Url"));
		
		//we want to set properties to file we use setProperty method
		obj.setProperty("url","www.google.com");
		//obj.store("Url","www.fb.com");
		System.out.println(obj.getProperty("Url"));
		//FileOutputStream fos=new FileOutputStream("./config/config.properties"); 
	}

}
