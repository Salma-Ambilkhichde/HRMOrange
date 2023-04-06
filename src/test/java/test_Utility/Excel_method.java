package test_Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_method {

		public static String fetchDataFromExcel(int i, int j) throws EncryptedDocumentException, IOException
				{
			
		String data="";
		String path="src"+File.separator+"test"+File.separator+"resources"+File.separator+"excel_file"+File.separator+"User1.xlsx";
		//file separator add karke dega string
		//  "\\"winsows h to aisa separator
		//  "/"mac h to aisa separator
		
		FileInputStream file= new FileInputStream(path);
		Sheet s=WorkbookFactory.create(file).getSheet("User1");
		Cell c=s.getRow(i).getCell(j);
		 CellType type =  c.getCellType();		
		if(type==CellType.STRING)
		{
			data = c.getStringCellValue();
		}
		else if(type==CellType.NUMERIC) {
			double number = c.getNumericCellValue();
			// data= String.valueOf(number);
			data= Double.toString(number); 	//Double is wrapper class of  data type
			
		}
		else if (type==CellType.BLANK)
		{
			data="";	//to return value or pass the value
			
		}
	return data;
	}

}
