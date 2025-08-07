package Annotations;

import org.testng.Reporter;
import org.testng.annotations.Test;

import BaseClass_Utility.Baseclass;

public class BaseClass_utilizing extends Baseclass {
	
	@Test
	public void TestScripts() {
		
		Reporter.log("Create a product",true);
	}

}
