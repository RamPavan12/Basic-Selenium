package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteBackthedata {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		//convert the phys file to java file
		FileInputStream fis = new FileInputStream("./src/test/resources/Selenium.xlsx");	
		
		//fetch the workbook
		Workbook wb = WorkbookFactory.create(fis);
		
		//Fetch the sheet
		Sheet sh = wb.getSheet("Data");
		
		//Fetch the row
		Row r = sh.getRow(1);

		//create the cell
		Cell c = r.createCell(4);
		
		//write the data
		c.setCellValue("selenium");
		
		//coverting obj to phys
		FileOutputStream fos = new FileOutputStream("./src/test/resources/Selenium.xlsx");
		wb.write(fos);
		
		//close the excel file
		wb.close(); 
	
		
	}

}
