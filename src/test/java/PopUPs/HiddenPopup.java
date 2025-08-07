package PopUPs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenPopup {

	public static void main(String[] args) throws InterruptedException {
     
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.makemytrip.com/");
		
		driver.findElement(By.className("commonModal__close")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("fromCity")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//p[@class='font12 greyText appendBottom3 lineHeight14'])[4]")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("toCity")).click();
		Thread.sleep(3000); 
		driver.findElement(By.xpath("(//p[@class=\"font12 greyText appendBottom3 lineHeight14\"])[9]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[@class=\"lbl_input appendBottom10\"])[3]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@aria-label='Sat Aug 30 2025']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[@class='lbl_input appendBottom10'])[4]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@aria-label='Thu Sep 25 2025']")).click();
		Thread.sleep(3000);
		driver.quit();
		
		
	}

}
