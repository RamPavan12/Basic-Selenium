package TestNG;

import org.testng.annotations.Test;

public class Using_priorityFlag {
	
	@Test(priority = 3)
	public void login() {
		
		System.out.println("Login");
	}
	
	@Test(priority = 2)
	public void Create() {
		
		System.out.println("Create");
	}

	@Test(priority = 1)
	public void Register() {
		System.out.println("Register");
	}
}
