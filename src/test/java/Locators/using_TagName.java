package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class using_TagName {

	public static void main(String[] args) throws InterruptedException {

      WebDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://demowebshop.tricentis.com/");
      
      driver.get("https://demowebshop.tricentis.com/");
		List<WebElement> link = driver.findElements(By.tagName("a"));
		
		for(WebElement ele:link)
		{
			System.out.println(ele.getText());
		}
		Thread.sleep(3000);
		
		//close the Brower
		driver.quit();

      
	}

}
