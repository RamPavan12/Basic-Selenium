package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actions {

	public static void main(String[] args) throws InterruptedException {

     WebDriver driver = new ChromeDriver();
     
     driver.manage().window().maximize();
     
     driver.get("https://demowebshop.tricentis.com/");
     
     driver.findElement(By.xpath("//input[@id=\"small-searchterms\"]")).sendKeys("Simple computer");
     Thread.sleep(3000);
     
    
     driver.findElement(By.xpath("//input[@id=\"small-searchterms\"]")).clear();
     
     driver.findElement(By.xpath("//input[@id=\"small-searchterms\"]")).sendKeys("Laptops");
     
     Thread.sleep(3000);
     
     driver.findElement(By.xpath("//input[@id=\"small-searchterms\"]")).submit();
     
     driver.quit();
     
     
     
	}

}
