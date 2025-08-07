package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectElementRefernceElement {

	//declaration
	@FindBy(id="name")
	private WebElement name;
	@FindBy(id="email")
	private WebElement email;
	@FindBy(id="password")
	private WebElement password;
	@FindBy(xpath = "//button[@type=\"submit\"]")
	private WebElement register_btn;
	//initlization
	public SelectElementRefernceElement(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public WebElement getName() {
		return name;
	}
	public WebElement getEmail() {
		return email;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getRegister_btn() {
		return register_btn;
	}
	
	//utilize
	public void register(String user,String email_name,String pass) {
		name.sendKeys(user);
		email.sendKeys(email_name);
		password.sendKeys(pass);
		
	}
	

}
