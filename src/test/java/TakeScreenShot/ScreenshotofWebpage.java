package TakeScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotofWebpage {

	public static void main(String[] args) throws InterruptedException, IOException {

      WebDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      driver.get("https://www.flipkart.com/");
      
      Thread.sleep(3000);
      
      TakesScreenshot ts = (TakesScreenshot)driver;
      
     File src = ts.getScreenshotAs(OutputType.FILE);
     
     File dest = new File("./SCREENSHOT/flipkart.png");
     
     FileUtils.copyFile(src, dest);
     
     driver.quit();
     
     
      
      
	}

}
