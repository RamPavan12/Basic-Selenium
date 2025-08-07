package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Handling_ScrollBar {

	public static void main(String[] args) throws InterruptedException {
      
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.amazon.in/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(100,1000)");
		
		Thread.sleep(3000);
		
		WebElement ele =driver.findElement(By.xpath("//a[text()='Sell on Amazon']"));
		//js.executeScript("aruguments[0],scrollIntoview(true)",ele);
		
		Thread.sleep(3000);	
		
		int xaxis = ele.getLocation().getX();
		int yaxis = ele.getLocation().getY();
		
		//js.executeScript("window.scrollBy("+ xaxis + "," + yaxis + ")");
		Thread.sleep(3000);
		
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(3000);
		
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		Thread.sleep(3000);
		
		driver.quit();
		
	}

}
