package AutoSuggestions;



import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class using_DemoShop {

	public static void main(String[] args) throws InterruptedException {

      WebDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      
      driver.get("https://demowebshop.tricentis.com/");
      
      driver.findElement(By.id("small-searchterms")).sendKeys("Compu");
      
      Thread.sleep(3000);
      
    List<WebElement> autosugg =  driver.findElements(By.xpath("//a[contains(text(),'comp')]"));
    
    for(WebElement ele:autosugg)
    {
     System.out.println(ele.getText());
	}
    
    driver.quit();

}
}
