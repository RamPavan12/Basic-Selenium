package TestNG;

import org.testng.annotations.Test;

public class USIng_depencedsONFlag {
	
	@Test
	public void java() {
		
		System.out.println("java");
	}

	
	@Test(dependsOnMethods = "java")
	public void Automation() {
		System.out.println("selenium");
	}
}
