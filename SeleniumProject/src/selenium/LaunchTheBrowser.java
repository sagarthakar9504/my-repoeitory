package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LaunchTheBrowser {
	public static void main(String[]agrs) throws InterruptedException {
		//this method is use to register browser System.setProperty()
		System.setProperty("webdriver.chrome.driver", "./Resources/chromedriver.exe");
		//we have to create an object of chrome driver class to open chrome driver
		ChromeDriver driver=new ChromeDriver();
		//to access any website we have to use get() or navigate().to() method for launching
		//driver.get("https://www.facebook.com/login/");
		// when we want to get title of any website we use getTitle method
		//System.out.println(driver.getTitle());
		// when we want to refresh page then we use refresh()method
		//driver.navigate().refresh();
		driver.get("https://www.youtube.com/");
		System.out.println(driver.getTitle());
		// when we want to go back on previous page we use navigate().back() method
	   // driver.navigate().back();
	    // for go to forward page we use navigate().forward() method
	   // driver.navigate().forward();
	    driver.manage().window().maximize();
	    WebElement button=driver.findElement(By.xpath("//button[@aria-label='Settings']"));
	    button.click();
	    Thread.sleep(1000);
	    WebElement theme=driver.findElement(By.xpath("//yt-icon[@class='style-scope ytd-toggle-theme-compact-link-renderer']"));
	   theme.click();
	   WebElement darktheme=driver.findElement(By.xpath("//div[@id='submenu']//ytd-compact-link-renderer[3]//a[1]//tp-yt-paper-item[1]//div[2]//yt-formatted-string[1]"));
	    darktheme.click();
	   
	}

}
