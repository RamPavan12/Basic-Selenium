package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_Validation {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		//WebElement Computers=driver.findElement(By.partialLinkText("Computers"));
		
		//System.out.println(Computers.isDisplayed());
		//System.out.println(Computers.isSelected());
		//System.out.println(Computers.isEnabled());
		WebElement tf = driver.findElement(By.id("newsletter-email"));
		System.out.println(tf.isDisplayed());
		if(tf.isDisplayed())
		{
			tf.sendKeys("selenium");
		}
		else
		{
			System.out.println("Element is not displayed on the web page");
	
		}
		
		//Inspect the Subscribe Button
		WebElement subscribe = driver.findElement(By.xpath("//input[@value='Subscribe']"));
		System.out.println(subscribe.isEnabled());
		if(subscribe.isEnabled())
		{
			System.out.println("Hi Mike");
		}
		else
		{
			System.out.println("Bye Mike");
		}
		//Inspect Radio Button
		WebElement Radio = driver.findElement(By.id("pollanswers-1"));
				Radio.click();
		System.out.println(Radio.isEnabled());
		Thread.sleep(3000);
		if(Radio.isEnabled())
		{
			System.out.println("ammu");

		}
		else
		{
			System.out.println("nani");
		}
		WebElement topcartlink = driver.findElement(By.id("topcartlink"));
		topcartlink.click();
        System.out.println(topcartlink.isSelected());
        Thread.sleep(3000);
        if(topcartlink.isSelected())
        {
        	System.out.println("Pavan");
        }
       else
       {
        	System.out.println("Ram");
        }
		Thread.sleep(3000);
		 
		driver.quit();
	}

}
