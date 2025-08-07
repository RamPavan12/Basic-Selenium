package DataProviders;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MultipleSetOfData {
	
	
	@Test(dataProvider = "data")
	public void loginTestscript(String un ,String psw)
	{
		System.out.println(un + psw);
			
	}
	@DataProvider
	public Object[][] data() 
	{
		
		Object[][] obj= new Object[3][2];
		
		obj[0][0] ="u1";
		obj[0][1] ="psw1";
		
		obj[1][0] ="u2";
		obj[1][1] ="psw2";
		
		obj[2][0] ="u3";
		obj[2][1] ="psw3";
		
		return obj;
		
	}

}

