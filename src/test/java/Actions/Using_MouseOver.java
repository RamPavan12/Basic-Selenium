package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Using_MouseOver {

	public static void main(String[] args) throws InterruptedException {

		 WebDriver driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	     
	     driver.get("https://www.ajio.com/shop/men");
	     
	     WebElement Men =driver.findElement(By.linkText("MEN"));
	     Actions act = new Actions(driver);
	     act.moveToElement(Men).perform();
	     
	     Thread.sleep(3000);
	     
	     driver.quit();
	     
	     
	    
	     
	}

}
