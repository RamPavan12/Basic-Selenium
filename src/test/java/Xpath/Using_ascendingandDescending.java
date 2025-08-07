package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Using_ascendingandDescending {

	public static void main(String[] args) {

      WebDriver driver = new EdgeDriver();
      
      driver.manage().window().maximize();
      
      driver.get("https://www.amazon.in/");
      
     // driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("HotWheels");
      
      //driver.findElement(By.xpath("//input[@id=\"nav-search-submit-button\"]")).click();
      
      driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Hotwheels" + Keys.ENTER);
      
     driver.findElement(By.xpath("//span[contains(text(),'Hot Wheels GR')]")).click();
      WebElement price= driver.findElement(By.xpath("//span[@id=\"productTitle\"]/ancestor::div[@id=\"centerCol\"]/descendant::span[@class=\"a-price-whole\"]/"));
    		 
    		 System.out.println(price.getText());
    		 
    		 driver.quit();
	}

}
