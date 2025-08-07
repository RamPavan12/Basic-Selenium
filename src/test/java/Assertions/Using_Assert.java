package Assertions;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

import java.time.Duration;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Using_Assert {

	
	@Test
	public void Hardassert() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.facebook.com/");
		

		String title = driver.getTitle();
		
		String exptitle = "Facebook – log in or sign up";
		
		//Assert.assertEquals(title,exptitle);//true
		//Assert.assertNotEquals(title,exptitle);//fail
		
		//Assert.assertFalse(title.contains(exptitle));//fail
		//Assert.assertTrue(title.contains(exptitle));true
		
		//Assert.assertNull(exptitle);//fail
		//Assert.assertNotNull(title, exptitle);//true
		
		
		System.out.println("verified title");
		Assert.fail();
		
		driver.quit();
		
		
	}
}
