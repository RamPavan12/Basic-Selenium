package Select;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {

      WebDriver driver = new EdgeDriver();
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      driver.get("https://www.amazon.in/");
      
    WebElement dropdown =  driver.findElement(By.id("searchDropdownBox"));
      
	Select s= new Select(dropdown);
	
	s.selectByIndex(7);
	Thread.sleep(3000);
	
	s.selectByValue("search-alias=gift-cards");
	Thread.sleep(3000);
	
	s.selectByVisibleText("Music");
	Thread.sleep(3000);
	
	
	List<WebElement> List = s.getOptions();
	for(WebElement ele:List)
	{
		System.out.println(ele.getText());
	}
	
	if(s.isMultiple())
	{
		System.out.println("Muliti select drop");
	}
    else
	{
		System.out.println("single seelect drop");
	}
	
	String text=s.getFirstSelectedOption().getText();
	System.out.println("First selected option:"+text);
	
	List<WebElement>selectedopt = s.getAllSelectedOptions();
	for(WebElement ele:selectedopt)
	{
		System.out.println("selected options :"+ele.getText());
		
	}
	
	driver.quit();
      
	}
}

