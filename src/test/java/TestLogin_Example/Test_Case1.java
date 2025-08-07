package TestLogin_Example;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_Case1 {

	public static void main(String[] args) throws InterruptedException {

      WebDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      
      driver.get("https://practicetestautomation.com/practice-test-login/");
      
      driver.findElement(By.id("username")).sendKeys("student");
      driver.findElement(By.id("password")).sendKeys("Password123");
      Thread.sleep(3000);
      
      driver.findElement(By.id("submit")).click();
      Thread.sleep(3000);
      
     String url= driver.getCurrentUrl();
     String Verifyurl= " practicetestautomation.com/logged-in-successfully/";
     if(url.equals(url)) {
    	 System.out.println("The current url is matching");
    	 System.out.println(url);
    	 System.out.println("**************************");
     }
     else {
     System.out.println("not matching the url");
     }
     WebElement display = driver.findElement(By.xpath("//strong"));
     if(display.isDisplayed()) {
    	 System.out.println("congrats student. you successfully logged in");
     }
     else {
    	 System.out.println("Login is not successfull");
     }
     WebElement logout = driver.findElement(By.xpath("//a[text()='Log out']"));
     if(logout.isDisplayed()) {
    	 System.out.println("logout element is displayed in the screen");
     }
     else {
    	 System.out.println("Logout element is not displayed in the screen");
     }
     driver.quit();
     }
      
	}
