package PopUPs;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart_popup {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.name("q")).sendKeys("Mobiles "+Keys.ENTER);
		String parentwindow = driver.getWindowHandle();
		driver.findElement(By.xpath("//div[text()='POCO C71 (Desert Gold, 128 GB)']")).click();
		Set<String> childwindows = driver.getWindowHandles();
		System.out.println(childwindows.toString());
		Thread.sleep(3000);
		for(String s : childwindows) {
			driver.switchTo().window(s);
			if (driver.getTitle().contains(s)) {
				   
				   // Inspect Add Cart Btn
				   driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
				   Thread.sleep(3000);	   
				   break;
				
			}
			   
		}
		   driver.switchTo().window(parentwindow);
		   System.out.println(driver.getTitle());
		   driver.quit();

			}

		}
