package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FB_login {

	public static void main(String[] args) throws InterruptedException {

		
		// Launch the browser
				WebDriver driver = new ChromeDriver();
				
				// Maximize the window
				driver.manage().window().maximize();
				
				// Implicit wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				// Navigate to an application
				driver.get("https://www.facebook.com/");
				Thread.sleep(3000);
				
				
				// Identify UN TF 
			WebElement Email = driver.findElement(By.id("email"));
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].value=arguments[1]",Email,"abc@gmail.com");
			
			Thread.sleep(3000);
			
			// Identify Password TF 
			WebElement pass = driver.findElement(By.id("pass"));
			js.executeScript("arguments[0].value=arguments[1]",pass,"123456");
			
			Thread.sleep(3000);
			
			// Identify login btn
			WebElement loginbtn = driver.findElement(By.name("login"));
			js.executeScript("arguments[0].click()",loginbtn);
			 
			Thread.sleep(3000);
			
			// Close the browser 
			driver.quit();
			

			}

}
