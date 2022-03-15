package loginpage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyInfoPage {
	public static void main(String[]args) {
		System.setProperty("webdriver.chrome.driver",".\\resources\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/pim/viewMyDetails");
		driver.manage().window().maximize();	
		//for myinfo
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement edit=driver.findElement(By.xpath("//input[@id=\"btnSave\"]"));
		edit.click();
		WebElement firstname= driver.findElement(By.xpath("//input[@id=\"personal_txtEmpFirstName\"]"));
		firstname.sendKeys("sagar");
		WebElement middlename=driver.findElement(By.xpath("//input[@id=\"personal_txtEmpMiddleName\"]"));
		middlename.sendKeys("bapu");
		WebElement lastname=driver.findElement(By.xpath("//input[@id=\"personal_txtEmpLastName\"]"));
		lastname.sendKeys("thakare");
		WebElement epid=driver.findElement(By.xpath("id=\"personal_txtEmployeeId\""));
		epid.sendKeys("123456");
		
	}

}
