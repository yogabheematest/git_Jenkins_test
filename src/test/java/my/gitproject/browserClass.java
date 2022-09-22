package my.gitproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class browserClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 System.setProperty("webdriver.chrome.driver","./driver_folder/chromedriver.exe"); 
		   WebDriver driver=new ChromeDriver();
		   driver.get("https://www.demo.guru99.com/V4/index.php");
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		   
		   //UserId
		   WebElement userID=driver.findElement(By.xpath("//input[@name=\"uid\"]"));
		   userID.sendKeys("mngr406136");
		   
		   //password
		   WebElement userPWD=driver.findElement(By.xpath("//input[@name=\"password\"]"));
		   userPWD.sendKeys("YzemuvE");
		   
		   //submit
		   WebElement btnLogin=driver.findElement(By.xpath("//input[@name=\"btnLogin\"]"));
		   btnLogin.click();
	}

}
