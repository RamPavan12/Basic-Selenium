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

public class Qspideersele {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	      
	      driver.get("https://demoapps.qspiders.com/");
	      
	      Thread.sleep(3000);
	     WebElement Qspider = driver.findElement(By.id("qspiderLogo"));
	     
	     File src=  Qspider.getScreenshotAs(OutputType.FILE);
	     
	     File dest = new File("./SCREENSHOT/Qspidersele.png");
	     
	     FileUtils.copyFile(src, dest);
	     
	     driver.quit();
	      

	}

}
