package Package;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {
	XSSFWorkbook wb;
	XSSFSheet sh;
	XSSFCell cell;
	public void data() throws IOException {
		File src = new File("C:\\Users\\NP16\\Desktop\\Book1.xlsx");
		FileInputStream fis= new FileInputStream(src);
		wb = new XSSFWorkbook(fis);
		
	}
	public String Firstname() throws IOException {
		data();
		sh = wb.getSheetAt(0);
		String user= sh.getRow(1).getCell(1).getStringCellValue();
		return user;
	}
	public String Lastname() throws IOException {
		data();
		sh = wb.getSheetAt(0);
		String last= sh.getRow(2).getCell(1).getStringCellValue();
		return last;
	}
	public String Pincode() throws IOException {
		data();
		sh = wb.getSheetAt(0);
		int pin=  (int) sh.getRow(3).getCell(1).getNumericCellValue();
		String pincode = String.valueOf(pin);
		return pincode;
		
	}
	public String Customer() throws IOException {
		data();
		sh=wb.getSheetAt(0);
		String customer=sh.getRow(6).getCell(1).getStringCellValue();
		return customer;
		
	}
	public String Currency() throws IOException {
		data();
		sh=wb.getSheetAt(0);
		String currency=sh.getRow(7).getCell(1).getStringCellValue();
		return currency;
		
	}
}
