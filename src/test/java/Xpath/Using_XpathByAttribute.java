package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_XpathByAttribute {

	public static void main(String[] args) throws InterruptedException {

      WebDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://www.facebook.com/");
      
      driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("selenium");
      
      driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("abc@1232");
      
      driver.findElement(By.xpath("//button[@value=\"1\"]")).click();
      Thread.sleep(3000);

      driver.navigate().back();
      
      Thread.sleep(3000);

     // driver.findElement(By.xpath("//a[id=\"u_0_6_/K\"]")).click();
      Thread.sleep(3000);
      
      driver.quit();
      
      }

}
