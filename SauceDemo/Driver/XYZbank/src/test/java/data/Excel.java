package data;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {
	String firstname;
	String lastname;
	Double pincode;
	XSSFWorkbook wb;
	XSSFSheet sh;
	XSSFCell cell;
	public void data() throws IOException {
		File src = new File("C:\\Users\\NP16\\Desktop");
		FileInputStream fis= new FileInputStream(src);
		wb = new XSSFWorkbook(fis);
		
	}
	public String Firstname() throws IOException {
		data();
		sh = wb.getSheetAt(0);
		String user= sh.getRow(1).getCell(1).getStringCellValue();
		return firstname;
	}
	public String Lastname() throws IOException {
		data();
		sh = wb.getSheetAt(0);
		String last= sh.getRow(2).getCell(1).getStringCellValue();
		return lastname;
	}
	public Double Pincode() throws IOException {
		data();
		sh = wb.getSheetAt(0);
		String pin= sh.getRow(3).getCell(1).getStringCellValue();
		return pincode;
		
	}
	

}
