package TestNG;

import org.testng.annotations.Test;

public class UsingTHreadPUllSIze {
	
	
	@Test
	public  void Spiderman() {
		System.out.println("Batman");
	}
	
	@Test(threadPoolSize = 3,invocationCount = 4)
	public void Ironman() {
		System.out.println("Hulk");
	}

}
