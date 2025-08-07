package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FetchTheDataFromPropertyfile {

	public static void main(String[] args) throws IOException {

		//covert physical file to java obj
		FileInputStream fis = new FileInputStream("./data.properties");
		
		//create an obj of property file
		Properties p = new Properties();
		
		//load pop obj
		p.load(fis);
		
	 	//fetch the data from prop obj
	    String data = p.getProperty("browser");
	    System.out.println(data);
	    
	    String data1 = p.getProperty("url");
	    System.out.println(data1);
	    
	    String data2 = p.getProperty("username");
	    System.out.println(data2);
	    
	    String data3 = p.getProperty("password");
	    System.out.println(data3);
	    
	    String data4 = p.getProperty("timeouts");
	    System.out.println(data4);
	    
	   
	    
	    
	}

}
