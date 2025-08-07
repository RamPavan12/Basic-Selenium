package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class using_getterMthods {

	public static void main(String[] args) throws InterruptedException   {

      WebDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
     
      driver.get("https://demowebshop.tricentis.com/");
      
  	
		WebElement computers = driver.findElement(By.partialLinkText("Computers")); 
		
		System.out.println(computers.getText());
		
		System.out.println(computers.getAttribute("href"));
		
		System.out.println(computers.getTagName());
		
		System.out.println(computers.getSize());
		
		System.out.println(computers.getLocation());
		
		System.out.println(computers.getRect().getHeight());

		System.out.println(computers.getRect().getWidth());
		
		System.out.println(computers.getRect().getX());
		
		System.out.println(computers.getRect().getY());
		
		System.out.println(computers.getCssValue("color"));
		
		Thread.sleep(3000);
		
		driver.quit();
		
	}
	

}
