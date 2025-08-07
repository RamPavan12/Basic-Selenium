package POM_TEST;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pom.SelectElementRefernceElement;

public class Qspiders {

	public static void main(String[] args) throws IOException, InterruptedException {
		FileInputStream fis=new FileInputStream("./Logindata.properties");
		Properties p=new Properties();
		p.load(fis);
		String name=p.getProperty("username");
		String email=p.getProperty("email");
		String password=p.getProperty("password");
		String url=p.getProperty("url");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);
		SelectElementRefernceElement demo=new SelectElementRefernceElement(driver);
		demo.register(name, email, password);
		Thread.sleep(3000);
		demo.getRegister_btn().submit();
		driver.quit();
	
}
}
