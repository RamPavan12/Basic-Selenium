package Synchorinization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class using_fluentWait {

	public static void main(String[] args) {

      WebDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://en-gb.facebook.com/");
      
      //FluentWait
      FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
      
      //Mentioning time duration to wait
      wait.withTimeout(Duration.ofSeconds(10));
      
      //customizing the polling time
      wait.pollingEvery(Duration.ofSeconds(1));
      
      //ignoring the exception
      wait.ignoring(Exception.class);
      
      WebElement un=driver.findElement(By.id("email"));
      
      wait.until(ExpectedConditions.visibilityOf(un));
      
      un.sendKeys("selenium");
      
      driver.quit();
	}
}
