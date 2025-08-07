package TakeScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot_WebElement {

	public static void main(String[] args) throws IOException {

      WebDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      
      driver.get("https://www.flipkart.com/");
      
     WebElement flipkart = driver.findElement(By.xpath("//img[@title=\"Flipkart\"]"));
     
     File src=  flipkart.getScreenshotAs(OutputType.FILE);
     
     File dest = new File("./SCREENSHOT/flipkartele.png");
     
     FileUtils.copyFile(src, dest);
     
     driver.quit();
      
      
	}

}
