package Frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_frames {

	public static void main(String[] args) throws InterruptedException {
      
	    WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
		driver.get("https://www.zomato.com/india");
		
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		
		Thread.sleep(3000);
		
		driver.switchTo().frame("auth-login-ui");
		
		driver.findElement(By.xpath("//input[@type=\"number\"]")).sendKeys("8074541118");
		
		driver.findElement(By.xpath("//i[@aria-label=\"close Modal\"]")).click();
		
		//driver.navigate().refresh();
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.linkText("Sign up")).click();
		
		Thread.sleep(3000);
		
		driver.quit();
		
		
	

	}

}
