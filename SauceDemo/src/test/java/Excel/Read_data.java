package Excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_data {
	
	String username;
	String password;
	String firstname;
	String lastname;
	double zipcode;
	XSSFSheet sh;
	XSSFWorkbook wb;
 
	public void readExcel() throws IOException
	{
		File src = new File("C:\\Users\\NP16\\eclipse-workspace\\SauceDemo\\src\\test\\java\\Excel\\read.xlsx");
		FileInputStream fis= new FileInputStream(src);
		wb = new XSSFWorkbook(fis);
	}
	//method for getting UserName from excel
	public  String Uname() throws IOException
	{
		readExcel();
		sh = wb.getSheetAt(0);
		username= sh.getRow(1).getCell(0).getStringCellValue();
		return username;
		
	}
	//method for getting Password from excel
	public  String Password() throws IOException
	{
		readExcel();
		sh = wb.getSheetAt(0);
		password= sh.getRow(2).getCell(0).getStringCellValue();
		return password  ;
		
	}
	//method for getting FirstName from excel
	public  String FirstName() throws IOException
	{
		readExcel();
		sh = wb.getSheetAt(0);
		firstname= sh.getRow(1).getCell(1).getStringCellValue();
		return firstname  ;
		
	}
	//method for getting LastName from excel
	public  String LastName() throws IOException
	{
		readExcel();
		sh = wb.getSheetAt(0);
		lastname= sh.getRow(2).getCell(1).getStringCellValue();
		return lastname  ;
		
	}
	//method for getting PostelCode from excel 
	public  double ZipCode() throws IOException
	{
		readExcel();
		sh = wb.getSheetAt(0);
		zipcode= sh.getRow(3).getCell(1).getNumericCellValue();
		return zipcode  ;
		
	}
 
 
 
	
	
	
	}


