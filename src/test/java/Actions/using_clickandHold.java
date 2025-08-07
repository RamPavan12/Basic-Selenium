package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class using_clickandHold {

	public static void main(String[] args) throws InterruptedException {

    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    
    driver.get("https://demoapps.qspiders.com/ui/clickHold?sublist=0");
    
     WebElement click = driver.findElement(By.id("circle"));
     Actions act= new Actions(driver);
     act.clickAndHold(click).perform();
     Thread.sleep(3000);
     
     driver.quit();
     
    
    
    
	}

}
