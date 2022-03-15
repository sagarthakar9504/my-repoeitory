package loginpage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginPage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\resources\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//for username
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");;
		//for password
		driver.findElement(By.xpath("//input[@id=\"txtPassword\"]")).sendKeys("admin123");
		
		WebElement submit=driver.findElement(By.id("btnLogin"));
 		
 			submit.click();
			
			//my info
 			WebElement myinfo=driver.findElement(By.xpath("//a[@id='menu_pim_viewMyDetails']"));
 			myinfo.click();
 			//WebElement myinfo=driver.findElement(By.id("menu_admin_viewAdminModule"));
 			//myinfo.click();
 			
		}

	}


