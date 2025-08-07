package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class writebackdatatopropfile {

	public static void main(String[] args) throws IOException {
	
		        //covert physical file to java obj
				FileInputStream fis = new FileInputStream("./data.properties");
				
				//create an obj of property file
				Properties p = new Properties();
				
				//load pop obj
				p.load(fis);
				
				//write data to prop obj
				p.put("mahi","heart");
				
				FileOutputStream fos = new FileOutputStream("./data.properties");
				p.store(fos,"my heart");
				
				
		

	}

}
