package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFile {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		//covert the physical file to java obj
		FileInputStream fis = new FileInputStream("./src/test/resources/Selenium.xlsx");
		
		//Fetch the workbook
	    Workbook wb =	WorkbookFactory.create(fis);
	    
	    //Fetch the sheet
	    Sheet  sh =   wb.getSheet("Data");
	    
	    //Fetch the row
	    Row r =  sh.getRow(1);
	    
	    //Fetch the cell
	    Cell c =  r.getCell(0);
	    
	    Cell num_c = r.getCell(1);
	    
	    //Fetch the data
	    String data = c.getStringCellValue();	
	    
	    //Fetch the numeric data
	    double numData = num_c.getNumericCellValue();
	    
	    //Fetch the data in string formate irrespective the datatype stored in excel
	    String datanum = num_c.toString();
	    System.out.println(data+" "+datanum);
       
	    //Close the wb
	    wb.close();
	}

}
