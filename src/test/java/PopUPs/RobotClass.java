package PopUPs;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class RobotClass {

	public static void main(String[] args) throws InterruptedException, AWTException {
     
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		StringSelection str= new StringSelection("C:\\Users\\RAMPAVAN\\OneDrive\\Documents");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		
		driver.get("https://the-internet.herokuapp.com/upload");
		WebElement upload = driver.findElement(By.id("file-upload"));
		
		Actions act = new Actions(driver);
		act.click(upload).perform();
		
		Thread.sleep(3000);
		
		Robot r= new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		
		Thread.sleep(3000);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(3000);
		
		driver.quit();
		
		
		
	}

}
