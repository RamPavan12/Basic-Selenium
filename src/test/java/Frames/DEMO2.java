package Frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DEMO2 {

	public static void main(String[] args) throws InterruptedException {

		    WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
			driver.get("https://demoapps.qspiders.com/ui/frames/multiple?sublist=2");
			
			WebElement Frame =driver.findElement(By.xpath("//iframe[@class=\"w-full h-96\"][1]"));
			
			Thread.sleep(3000);
			
			driver.switchTo().frame(0);
			
			driver.findElement(By.id("email")).sendKeys("rampavan355@gmail.com");
			
			driver.findElement(By.id("password")).sendKeys("Rampavan@123");
			
			driver.findElement(By.id("confirm-password")).sendKeys("Rampavan@123");
			Thread.sleep(3000);
			
			driver.findElement(By.id("submitButton")).click();
			driver.switchTo().defaultContent();			
			
			Thread.sleep(3000);
			
			//login application
			WebElement login =driver.findElement(By.xpath("(//div[@ class=\"w-1/2\"])[2]"));
			driver.switchTo().frame(1);
			
			//login 
			driver.findElement(By.id("username")).sendKeys("Pavan");
			driver.findElement(By.id("password")).sendKeys("Rampavan@123");
			driver.findElement(By.id("submitButton")).click();
			
			Thread.sleep(3000);
			
			driver.switchTo().defaultContent();
			
			//close the driver
			driver.quit();

		}


}
