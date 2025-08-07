package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Using_LinkText {

	public static void main(String[] args) throws InterruptedException {

     WebDriver driver= new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://www.facebook.com/");
     
    // driver.findElement(By.linkText("Forgotten password?")).click();
     
       driver.findElement(By.partialLinkText("Forgotten")).click();
     
     Thread.sleep(3000);
     
     driver.quit();
	}

}
