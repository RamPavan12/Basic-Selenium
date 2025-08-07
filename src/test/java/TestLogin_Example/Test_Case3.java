package TestLogin_Example;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_Case3 {

	public static void main(String[] args) throws InterruptedException {

	WebDriver driver=new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//implict wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//navigate to an application
		driver.get("https://practicetestautomation.com/practice-test-login/");
		
		//identify UN TF
		driver.findElement(By.id("username")).sendKeys("student");
		
		//identify Pswd TF
		driver.findElement(By.id("password")).sendKeys("incorrectPassword");
		
		//click on button
		driver.findElement(By.id("submit")).click();
		
		Thread.sleep(3000);
		
				// Identify Submit btn
				driver.findElement(By.id("submit")).click();
				// Inspect error msg is displayed or not
				WebElement error = driver.findElement(By.id("error"));
				if (error.isDisplayed()) {
					System.out.println(error.getText());
					
				}
				else
				{
					System.out.println("Your password is invalid! is not displayed");
				}
				
				Thread.sleep(3000);
				
				driver.quit();
				

			}

		}
		
		