package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class USing_CssSelector {

	public static void main(String[] args) throws InterruptedException {

    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.flipkart.com/");
    
    //driver.findElement(By.cssSelector("input[type=\"text\"]")).sendKeys("cars");
    
    Thread.sleep(3000);
    
    driver.findElement(By.cssSelector("svg[viewBox='0 0 24 24']")).click();
    
    driver.findElement(By.cssSelector("img[alt='Login']")).click();
    
    Thread.sleep(3000);

    driver.findElement(By.cssSelector("input[class=\"r4vIwl BV+Dqf\"]")).sendKeys("8074541118");
    
    Thread.sleep(3000);

    driver.findElement(By.cssSelector("button[class=\"QqFHMw twnTnD _7Pd1Fp\"]")).click();
    
     Thread.sleep(3000);
     
     driver.quit();
	}

}
