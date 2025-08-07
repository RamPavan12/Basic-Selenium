package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class using_Classname {

	public static void main(String[] args) throws InterruptedException {

		  WebDriver driver= new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("https://www.facebook.com/");
	      
	      driver.findElement(By.className("_55r1")).sendKeys("selenium");
	      
	      driver.findElement(By.className("_9npi")).sendKeys("abc122");
	      
	      driver.findElement(By.className("_42ft")).click();
	      
	      Thread.sleep(3000);
	      
	      driver.quit();
	      
	}

}
