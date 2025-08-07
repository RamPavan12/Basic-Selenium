package BaseClass_Utility;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Baseclass {
	
	@BeforeSuite
	public void BS() {
		Reporter.log("BS-Connect with the database",true);
		
	}
	@AfterSuite
	public void AS() {
		Reporter.log("AS-DisConnect with the database",true);	
		
	}
	@BeforeTest
    public void BT() {
		Reporter.log("BT-Configure the parallel execution",true);
		
	}
	@BeforeClass
    public void BC() {
		Reporter.log("BC-Launch the browser",true);
		
	}
	@AfterMethod
    public void AM() {
		Reporter.log("AM-Logout",true);
		
	}
	@AfterClass
    public void AC() {
		Reporter.log("AC-Quit the browser",true);
		
	}
	@BeforeMethod
    public void BM() {
		Reporter.log("BM-Login",true);
		
	}
	@AfterTest
	public void AT() {
		Reporter.log("AT-Close the parallel execution",true);
		
	}
	

}
