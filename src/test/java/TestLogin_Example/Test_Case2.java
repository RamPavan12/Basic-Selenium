package TestLogin_Example;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_Case2 {

	public static void main(String[] args) throws InterruptedException {


	      WebDriver driver = new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	      
	      driver.get("https://practicetestautomation.com/practice-test-login/");
	      
	      driver.findElement(By.id("username")).sendKeys("incorrectUser");
	      driver.findElement(By.id("password")).sendKeys("Password123");
	      Thread.sleep(3000);
	      
	      driver.findElement(By.id("submit")).click();
	      Thread.sleep(3000);
	      
	  	// Inspect error msg is displayed or not
	  	WebElement error = driver.findElement(By.id("error"));
	  	if (error.isDisplayed()) {
	  		System.out.println(error.getText());
	  		
	  	}
	  	else
	  	{
	  		System.out.println("Your username is invalid! is not displayed");
	  	}
	  	
	  	Thread.sleep(3000);
	  	driver.quit();
	      
	}

}
