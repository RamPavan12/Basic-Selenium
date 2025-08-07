package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class using_DragandDrop {

	public static void main(String[] args) throws InterruptedException {

     WebDriver driver = new ChromeDriver();
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     
     driver.get("https://demo.guru99.com/test/drag_drop.html");
     
     
        WebElement drag1 = driver.findElement(By.id("credit2"));
		WebElement drop1 = driver.findElement(By.id("bank"));
		
		WebElement drag2 = driver.findElement(By.id("fourth"));
		WebElement drop2 = driver.findElement(By.id("amt7"));
		
		WebElement drag3 =driver.findElement(By.id("credit1"));
		WebElement drop3 = driver.findElement(By.id("loan"));
		
		WebElement drag4 = driver.findElement(By.id("fourth"));
		WebElement drop4 = driver.findElement(By.id("amt8"));
		
		
		Actions act=new Actions(driver);
		act.dragAndDrop(drag1, drop1).perform();
		act.dragAndDrop(drag2, drop2).perform();
		act.dragAndDrop(drag3 ,drop3).perform();
		act.dragAndDrop(drag4, drop4).perform();
	
	    Thread.sleep(3000);
	    WebElement perfect = driver.findElement(By.xpath("//a[text()='Perfect!']"));
		System.out.println(perfect.getText());
	
	    driver.quit();
	
	}

}
