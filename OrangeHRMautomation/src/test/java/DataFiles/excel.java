package DataFiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excel {

	String username;
	String password;
	XSSFCell cell;
	XSSFSheet sh;
	XSSFWorkbook wb;
	String AssignEmp;
	String NewUser;
	String NewPassW;
	String ConfNewPswd;
	String timesheetemp;
	String leaveDate;
	String leaveComment;
	String jobdata;
	String jobDescription;
	String payGrade;
    String employeeStatus;
    String jobCategory;
    String shiftName;
    String Firstname;
    String Lastname;
    String Middlename;
    String Nickname;
    String dob;
    String ProjectTitle;
    Double workinghour;

//  Read Excel file by assigning a file path in one variable
	public void readExcel() throws IOException
	{
		File src = new File("C:\\Users\\NARMAE\\eclipse-workspace\\OrangeHRMautomation\\src\\test\\java\\DataFiles\\OrangeExcelDatas.xlsx");
		FileInputStream fis= new FileInputStream(src);
		wb = new XSSFWorkbook(fis);
	}
//	Read user name from a excel file which is used in log in scenario 
	public  String Uname() throws IOException
	{
		readExcel();
		sh = wb.getSheetAt(0);
		username= sh.getRow(1).getCell(0).getStringCellValue();
		return username;
		}
    
//	Read password from a excel file which is used in log in scenario
	public  String Password() throws IOException
	{
		readExcel();
		sh = wb.getSheetAt(0);
		password= sh.getRow(2).getCell(0).getStringCellValue();
		return password;

	}
	
//	Read Employee name from a excel file which is used in Adding new user scenario
	public String EmployeeName() throws IOException {
		readExcel();
		sh = wb.getSheetAt(0);
		AssignEmp= sh.getRow(1).getCell(1).getStringCellValue();
		return AssignEmp;
	}
	
//	Read New user name from a excel file which is used in Adding new user scenario
	public String NewUserName(int rowNo,int clmNo) throws IOException {
		readExcel();
		sh = wb.getSheetAt(0);
		NewUser= sh.getRow(rowNo).getCell(clmNo).getStringCellValue();
		return NewUser;
	}
	
//	Read New password from a excel file which is used in Adding new user scenario
	public String NewPassword() throws IOException {
		readExcel();
		sh = wb.getSheetAt(0);
		NewPassW= sh.getRow(12).getCell(1).getStringCellValue();
		return NewPassW;
	}
	
//	Read  comment from a excel file which is used in Assign leave scenario	
	public String Comments() throws IOException {
		readExcel();
		sh = wb.getSheetAt(0);
		leaveComment= sh.getRow(8).getCell(2).getStringCellValue();
		return leaveComment;
	}
	
//	Read  employee job data from a excel file which is used in Adding job details scenario		
	public String JobData(int rowno, int colno) throws IOException {
		readExcel();
		sh = wb.getSheetAt(0);
		jobdata= sh.getRow(rowno).getCell(colno).getStringCellValue();
		return jobdata;
	}
	
//	Read  Job description from a excel file which is used in Adding job details scenario	
	public String JobDescription() throws IOException {
		readExcel();
		sh = wb.getSheetAt(0);
		jobDescription= sh.getRow(8).getCell(2).getStringCellValue();
		return jobDescription;
	}
	
//	Read  first name from a excel file which is used in Adding job details scenario		
	public String firstname() throws IOException {
		readExcel();
		sh = wb.getSheetAt(0);
		Firstname= sh.getRow(1).getCell(8).getStringCellValue();
		return Firstname;
	}
	
//	Read  last name from a excel file which is used in Adding job details scenario
	public String lastname() throws IOException {
		readExcel();
		sh = wb.getSheetAt(0);
		Lastname= sh.getRow(3).getCell(8).getStringCellValue();
		return Lastname;
	}
	
//	Read  middle name from a excel file which is used in Adding job details scenario	
	public String middlename() throws IOException {
		readExcel();
		sh = wb.getSheetAt(0);
		Lastname= sh.getRow(2).getCell(8).getStringCellValue();
		return Lastname;
	}
	
//	Read  nick name from a excel file which is used in Adding job details scenario
	public String nickname() throws IOException {
		readExcel();
		sh = wb.getSheetAt(0);
		Nickname= sh.getRow(4).getCell(8).getStringCellValue();
		return Nickname;
	}
	
//	Read  Date from a excel file which is used in Adding job details scenario	
	public String Date() throws IOException {
		readExcel();
		sh = wb.getSheetAt(0);
		dob= sh.getRow(1).getCell(7).getStringCellValue();
		return dob;
	}
	
//	Read  employee name from a excel file which is used in edit employee time sheet scenario	
	public String TimesheetEmp() throws IOException {
		readExcel();
		sh = wb.getSheetAt(0);
		timesheetemp= sh.getRow(1).getCell(9).getStringCellValue();
		return timesheetemp;
	}
//	Read  project title from a excel file which is used in edit employee time sheet scenario
	public String projectTitle() throws IOException {
		readExcel();
		sh = wb.getSheetAt(0);
		ProjectTitle= sh.getRow(2).getCell(9).getStringCellValue();
		return ProjectTitle;
	}
	
//	Read  working hour from a excel file which is used in edit employee time sheet scenario	
	public Double workingHour() throws IOException {
		readExcel();
		sh = wb.getSheetAt(0);
		workinghour= sh.getRow(3).getCell(9).getNumericCellValue();
		return workinghour;
	}

}
