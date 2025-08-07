package PopUPs;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationPopUp {

	public static void main(String[] args) throws InterruptedException {
       
	WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
	    driver.findElement(By.xpath("//button[text()=\"Click for JS Confirm\"]")).click();
	    
        Thread.sleep(3000);
		
		Alert al = driver.switchTo().alert();
		al.accept();
		
		WebElement result = driver.findElement(By.id("result"));
		System.out.println(result.getText());
		Thread.sleep(3000);
		    
		driver.quit();
			
	}
	

}
