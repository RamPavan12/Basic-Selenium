package Assertions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class USing_SoftAssert {

	
	@Test
	public void softassert() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.facebook.com/");
		

		String title = driver.getTitle();
		
		String exptitle = "Facebook – log in or sign up";
		
		SoftAssert soft = new SoftAssert();
		//soft.assertEquals(title, exptitle);//true
		//soft.assertNotEquals(title,exptitle);//fail
		
		//soft.assertFalse(title.contains(exptitle));//fail
		//soft.assertTrue(title.contains(exptitle));//true
		
		//soft.assertNull(title, exptitle);//fail
		//soft.assertNotNull(title, exptitle);//true
		
		System.out.println("verifiedtitle");
		driver.quit();
		soft.assertAll();
	}
}
