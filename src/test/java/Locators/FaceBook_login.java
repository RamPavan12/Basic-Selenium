package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook_login {

	public static void main(String[] args) throws InterruptedException {

      WebDriver driver= new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://www.facebook.com/");
      
      driver.findElement(By.name("email")).sendKeys("selenium");
      
      driver.findElement(By.name("pass")).sendKeys("abc122");
      
      driver.findElement(By.name("login")).click();
      
      driver.findElement(By.linkText("Forgotten password?")).click();
      
      Thread.sleep(3000);
      
      driver.quit();
	}

}
