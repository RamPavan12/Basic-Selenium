package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naviagtetoanaappln {

	public static void main(String[] args) throws InterruptedException {
		
		
		    WebDriver driver = new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		    
		    String url ="https://www.facebook.com/";
		    
		    JavascriptExecutor js = (JavascriptExecutor)driver;
		    js.executeScript("window.location=arguments[0]",url);
		    
		    
		    Thread.sleep(3000);

		    
		    driver.quit();
		
		
			}
	  

}
