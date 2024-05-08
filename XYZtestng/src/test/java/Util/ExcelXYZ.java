package Util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelXYZ {
	String filepath = "C:\\Users\\NP16\\Desktop\\XYZDatas.xlsx";
	XSSFWorkbook wb;
	XSSFSheet sh;
	XSSFCell cell;
	XSSFRow row;
	FileInputStream fis;
	FileOutputStream fos;

	public void fileInputStreamPreconditions() throws IOException {
		File src=new File(filepath);
		fis=new FileInputStream(src);
		wb=new XSSFWorkbook(fis);
		sh=wb.getSheetAt(0);
	}
	public String Firstname() throws IOException {
		fileInputStreamPreconditions();
		String CustomerFirstname=sh.getRow(0).getCell(1).getStringCellValue();
		return CustomerFirstname;
	}
	public String Lastname() throws IOException {
		fileInputStreamPreconditions();
		String CustomerLastname=sh.getRow(1).getCell(1).getStringCellValue();
		return CustomerLastname;
	}
	
	public String postcode() throws IOException {
		fileInputStreamPreconditions();
		int pincode=(int) sh.getRow(1).getCell(2).getNumericCellValue();
		return String.valueOf(pincode);
	}
	
	public void customerid(int cusid) throws IOException {
		fileInputStreamPreconditions();
        cell =sh.getRow(0).createCell(3);
    	XSSFCell cellvalue =sh.getRow(1).createCell(3);
    	cell.setCellValue("CutomerID");
    	cellvalue.setCellValue(cusid);
		fos= new FileOutputStream(filepath);
		wb.write(fos);
	}
	public void accountno(int AccNo) throws IOException {
		fileInputStreamPreconditions();
        cell =sh.getRow(0).createCell(4);
    	XSSFCell cellvalue =sh.getRow(1).createCell(4);
    	cell.setCellValue("AccountNo");
    	cellvalue.setCellValue(AccNo);
		fos= new FileOutputStream(filepath);
		wb.write(fos);
	}
	public String currency() throws IOException {
		fileInputStreamPreconditions();
		String Currency=sh.getRow(1).getCell(5).getStringCellValue();
		return Currency;
	}
	public String depositeamt() throws IOException {
		fileInputStreamPreconditions();
		String Deposite=sh.getRow(1).getCell(6).getStringCellValue();
		return Deposite;
	}
	public String withdrawamt() throws IOException {
		fileInputStreamPreconditions();
		String Withdraw=sh.getRow(1).getCell(7).getStringCellValue();
		return Withdraw;
	}
	
		
		
		
		
		
		
		
		
		
	


	
	

}


