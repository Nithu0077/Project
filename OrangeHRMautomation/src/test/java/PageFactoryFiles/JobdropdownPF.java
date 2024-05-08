package PageFactoryFiles;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import DataFiles.GenericMethodClass;
import DataFiles.excel;

public class JobdropdownPF {

	@FindBy(name = "username")
	WebElement Username;
	@FindBy(xpath = "//input[@name='password']")
	WebElement Password;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement login;
	@FindBy(xpath = "//*[@href=\"/web/index.php/admin/viewAdminModule\"]")
	WebElement adminlink;
	@FindBy(xpath = "//span[text()='Job ']")
	WebElement Job;
	@FindBy(xpath = "//a[text()='Job Titles']")
	WebElement jobTitle;
	@FindBy(css = "i.oxd-button-icon")
	WebElement addButton;
	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
	WebElement Name;
	@FindBy(xpath = "//textarea[@placeholder='Type description here']")
	WebElement jobDes;
	@FindBy(xpath = "//div[@class='oxd-file-button']") 
	WebElement browse;
	@FindBy(xpath = "//textarea[@placeholder='Add note']") 
	WebElement addnote;
	@FindBy(xpath = "//button[@type='submit']") 
	WebElement save;
	@FindBy(xpath = "//a[text()='Pay Grades']") 
	WebElement payGrades;
	@FindBy(css = "i.oxd-button-icon") 
	WebElement AddButton;
	@FindBy(xpath = "//button[@type='submit']") 
	WebElement savePay;
	@FindBy(xpath = "//a[text()='Employment Status']") 
	WebElement empmntStatus;
	@FindBy(xpath = "//button[@type='submit']") 
	WebElement saveEmpStatus;
	@FindBy(xpath = "//a[text()='Job Categories']") 
	WebElement jobCategories ;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement saveCategory;
	@FindBy(xpath = "//a[text()='Work Shifts']")
	WebElement workShifts;
	@FindBy(xpath = "//input[@placeholder='Type for hints...']") 
	WebElement AssignedEmp;
	@FindBy(xpath = "//button[@type='submit']") 
	WebElement saveShifts;
	@FindBy(xpath = "//i[@class='oxd-icon bi-trash'][1]") 
	WebElement trashicon;
	@FindBy(xpath = "//*[@class='oxd-icon bi-trash oxd-button-icon']") 
	WebElement delete;
	@FindBy(css="p.oxd-text--toast-message") 
	WebElement popup;
	@FindBy(css="div[class='oxd-table-cell oxd-padding-cell']:nth-child(2)")
	List<WebElement> titles;
	WebDriver driver;
	Robot robot;
//	Creating object for excel class
	excel ex = new excel();
	String jobtitle = ex.JobData(1,2);
	String grade = ex.JobData(1,3);
	String empStatus = ex.JobData(1,4);
	String jobcat = ex.JobData(1,5);
	String wrkshift = ex.JobData(1,6);
	String Text;

	
//	Creating object for Generic class
	GenericMethodClass Genric;

	
//  constructor Initializing driver and driver elements
	public JobdropdownPF(WebDriver driver) throws AWTException, IOException{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		Genric = new GenericMethodClass(driver);
		Genric.ImplicitWait();
	}

	
//	Fetching user name and password from Excel
	public void Login() throws IOException{
		Genric.PreConditions();
		Genric.sendInput(Username,ex.Uname());
		Genric.sendInput(Password,ex.Password());
		Genric.clickWebElement(login);
		}

	
//  click admin link from side bar
	public void AdminTile() throws InterruptedException {
		Genric.clickWebElement(adminlink);
	}
	

//	click Job top bar item and Job title drop down item
	public void Jobdd() throws InterruptedException, IOException {
		Genric.clickWebElement(Job);
		Genric.clickWebElement(jobTitle);
		jobtitle = Genric.searchTitle(titles,jobtitle);
	}
	

//	click add button to add job title
    public void addBtn() {
    	Genric.clickWebElement(addButton);
    }


//  Adding job Title and Description
    public void jobDetails() throws InterruptedException, IOException {
        Genric.sendInput(Name,jobtitle);
    	Genric.sendInput(jobDes,ex.JobDescription());
    	}
 
    
//  click browse button to select file from our local device
    public void browseFile() throws InterruptedException, AWTException, IOException {
      Genric.clickWebElement(browse);
      Thread.sleep(3000);
      robot = new Robot();
//    Assigning image file path in a variable and copying path in the clip board  
  	  StringSelection filepath=new StringSelection("C:\\Users\\NARMAE\\Downloads\\IMG.jpg");
  	  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filepath,null);
//    Pasting file path in input box using robot keys which is copied in clip board
  	  robot.keyPress(KeyEvent.VK_CONTROL);
  	  robot.keyPress(KeyEvent.VK_V);
  	  Thread.sleep(1000);
  	  robot.keyRelease(KeyEvent.VK_V);
  	  robot.keyRelease(KeyEvent.VK_CONTROL);
  	  robot.keyPress(KeyEvent.VK_ENTER);
  	  robot.keyRelease(KeyEvent.VK_ENTER);
  	  System.out.println("File Uploaded Successfully");
  	  Genric.sendInput(addnote,ex.Comments());
  	  }
    
    
//  save Job details
    public void saveJob() throws InterruptedException {
    	Genric.clickWebElement(save);
    }
    
    
// Validating PopUp message
    public void Popup1() {
    	String ExpectedTitle="Successfully Saved";
    	Genric.visibilityCheck(popup);
		Genric.ValidatePopupMsg(popup,ExpectedTitle);
    	System.out.println("Job details saved successfully");
	}

    
//  Navigate back to job drop down and select Pay Grades
    public void PayGrades() throws IOException{
    	Genric.clickWebElement(Job);
    	Genric.clickWebElement(payGrades);
    	grade = Genric.searchTitle(titles,grade);
    	Genric.clickWebElement(AddButton);
    	Genric.sendInput(Name,grade);
    	Genric.clickWebElement(savePay);
    	}

    
//    Adding Employee status and save
    public void EmpStatus() throws IOException {
    	Genric.clickWebElement(Job);
    	Genric.clickWebElement(empmntStatus);
    	empStatus = Genric.searchTitle(titles,empStatus);
    	Genric.clickWebElement(AddButton);
    	Genric.sendInput(Name,empStatus);
    	Genric.clickWebElement(saveEmpStatus);
    }

    
//    Adding Job categories and save
    public void jobCategories() throws IOException {
    	Genric.clickWebElement(Job);
    	Genric.clickWebElement(jobCategories);
    	jobcat = Genric.searchTitle(titles,jobcat);
    	Genric.clickWebElement(AddButton);
    	Genric.sendInput(Name,jobcat);
    	Genric.clickWebElement(saveCategory);
    	}

    
//    Adding work shift and save
    public void Workshifts() throws IOException, InterruptedException, AWTException {
    	Genric.clickWebElement(Job);
    	Genric.clickWebElement(workShifts);
    	wrkshift = Genric.searchTitle(titles,wrkshift);
    	Genric.clickWebElement(AddButton);
    	Genric.sendInput(Name,wrkshift);
    	Genric.sendInput(AssignedEmp,ex.EmployeeName());
    	Thread.sleep(3000);
    	Genric.RobotKey_DownEnter();
		Genric.clickWebElement(saveShifts);

    }


//  check new work shift added is visible under Records found    
    public void CheckVisibility() throws IOException {
    	Genric.ValidateElementVisible(titles,wrkshift);
    }

    
//  clicking trash icon from employee records
    public void clickTrash(){
    	Genric.clickWebElement(trashicon);
}

    
//  delete respective user shift details
    public void YesDelete() {
    	Genric.clickWebElement(delete);
 }

    
//  validating pop up message
    public void Popup2() {
    	Genric.visibilityCheck(popup);
    	String expectedText = popup.getText();
    	System.out.println(expectedText);
    	Genric.ValidatePopupMsg(popup,expectedText);
		System.out.println("work shift Successfully deleted");
	}
}
