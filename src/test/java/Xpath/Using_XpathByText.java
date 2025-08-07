package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_XpathByText {

	public static void main(String[] args) throws InterruptedException {

     WebDriver driver= new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://www.facebook.com/");
     
     driver.findElement(By.xpath("//a[text()=\"Create new account\"]")).click();
     Thread.sleep(3000);
     driver.findElement(By.xpath("//a[text()=\"Already have an account?\"]")).click();
     Thread.sleep(3000);

     driver.quit();
     
	}

}
