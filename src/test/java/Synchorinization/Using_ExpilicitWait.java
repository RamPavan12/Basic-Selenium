package Synchorinization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Using_ExpilicitWait {

	public static void main(String[] args) throws InterruptedException {

		    //Launch the browser
	        WebDriver driver = new ChromeDriver();
			
			//maximize
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			
			//navigate to url
			driver.get("https://www.shoppersstack.com/");
			
			WebElement login=driver.findElement(By.xpath("//button[text()='Login']"));
			
			//Expliccit wait
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
			wait.until(ExpectedConditions.visibilityOf(login));
			
			//click on the login btn
			login.click();
			
			//Explicit wait until title contains Method
			wait.until(ExpectedConditions.titleContains("ShoppersStack | Login"));
			
			driver.findElement(By.id("Email")).sendKeys("abc@gmail.com");
			driver.findElement(By.name("Password")).sendKeys("123456");
			Thread.sleep(3000);
			
	        WebElement loginbtn = driver.findElement(By.xpath("//span[text()=\"Login\"]"));
	        wait.until(ExpectedConditions.elementToBeClickable(loginbtn));
	       
	        loginbtn.click();
		    Thread.sleep(3000);
		    driver.quit();
	}

}
