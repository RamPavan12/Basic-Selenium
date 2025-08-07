package Synchorinization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_Implicitlywait {

	public static void main(String[] args) throws InterruptedException {

       //launch the browser
		WebDriver driver =new ChromeDriver();
		//Maximizew the browser
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		//navigate to an apppln
		driver.get("https://shoppersstack.com/");
		
		//Wait time
		Thread.sleep(3000);
		
		//navigate to login btn
		driver.findElement(By.id("loginBtn")).click();
		
		Thread.sleep(3000);
		
		//identify the element
		driver.findElement(By.xpath("//input[@id=\"Email\"]")).sendKeys("pavan");
		
		driver.findElement(By.xpath("//input[@name=\"Password\"]")).sendKeys("1234");
		
		
		driver.quit();
		
		
	}

}
