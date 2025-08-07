package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class using_DisabledElements {

	public static void main(String[] args) throws InterruptedException {

		
		WebDriver driver = new ChromeDriver();
		
		// Maximize the window
		driver.manage().window().maximize();
		
		// Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// Navigate to an application
		driver.get("file:///C:/Users/RAMPAVAN/OneDrive/Documents/sample%20web%20page.html");
		
		Thread.sleep(3000);
		
		WebElement user = driver.findElement(By.id("user"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].value=arguments[1]",user,"Pavan");
		
		Thread.sleep(3000);
		
		//Handling disabled button
	   WebElement button= driver.findElement(By.id("login"));
		js.executeScript("arguments[0].disabled=false",button);
		button.click();
		
		Thread.sleep(3000);
		
		
		driver.quit();
		
		
	}

}
