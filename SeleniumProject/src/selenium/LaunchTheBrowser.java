package selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchTheBrowser {
	public static void main(String[]agrs) {
		//this method is use to register browser System.setProperty()
		System.setProperty("webdriver.chrome.driver", "./Resources/chromedriver.exe");
		//we have to create an object of chrome driver class to open chrome driver
		ChromeDriver driver=new ChromeDriver();
		//to access any website we have to use get() or navigate().to() method for launching
		driver.get("https://www.facebook.com/login/");
		// when we want to get title of any website we use getTitle method
		System.out.println(driver.getTitle());
		// when we want to refresh page then we use refresh()method
		driver.navigate().refresh();
		driver.get("https://www.youtube.com/");
		System.out.println(driver.getTitle());
		// when we want to go back on previous page we use navigate().back() method
	    driver.navigate().back();
	    // for go to forward page we use navigate().forward() method
	    driver.navigate().forward();
	}

}
