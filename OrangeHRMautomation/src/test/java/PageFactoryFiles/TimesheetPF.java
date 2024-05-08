package PageFactoryFiles;
 
import java.awt.AWTException;
import java.awt.Robot;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import DataFiles.GenericMethodClass;
import DataFiles.excel;
 
public class TimesheetPF {
	@FindBy(name = "username") 
	WebElement Username;
	@FindBy(xpath = "//input[@name='password']") 
	WebElement Password;
	@FindBy(xpath = "//button[@type='submit']") 
	WebElement login;
	@FindBy(xpath="//span[text()=\"Time\"]") 
	WebElement Time;
	@FindBy(xpath="(//input)[2]") 
	WebElement EmpName;
	@FindBy(xpath="//button[@class=\"oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space\"]")
	WebElement view;
	@FindBy(xpath="//button[@class=\"oxd-button oxd-button--medium oxd-button--ghost\"]") 
	WebElement Edit;
	@FindBy(xpath="//i[@class=\"oxd-icon bi-trash\"]") 
	WebElement trashIcon;
	@FindBy(xpath="(//div/input)[2]") 
	WebElement project;
	@FindBy(xpath="//div[@class=\"oxd-select-wrapper\"] ") 
	WebElement Activity;
	@FindBy(xpath="//*[contains(text(),\"Implementation\")]")
	WebElement implementation;
	@FindBy(xpath="(//input[@class=\"oxd-input oxd-input--active\"])[2]") 
	WebElement Mon;
	@FindBy(xpath="//tr[1]/td[4]/div/div[2]/input") 
	WebElement Tue;
	@FindBy(xpath="//tr[1]/td[5]/div/div[2]/input") 
	WebElement Wed;
	@FindBy(xpath="//tr[1]/td[6]/div/div[2]/input") 
	WebElement Thu;
	@FindBy(xpath="//tr[1]/td[7]/div/div[2]/input") 
	WebElement Fri;
	@FindBy(xpath="//button[@class=\"oxd-button oxd-button--medium oxd-button--secondary\"]") 
	WebElement save;
	@FindBy(css="p.oxd-text--toast-message")
	WebElement popup;
	
	WebDriver driver;
	Robot robot;
	
//	Creating object for excel class
	excel ex = new excel();
	
//	Creating object for Generic class
	GenericMethodClass Genric;	

//  Initializing driver and driver elements	
	public TimesheetPF(WebDriver driver) throws AWTException {
		this.driver = driver;                    
		PageFactory.initElements(driver, this);
		Genric = new GenericMethodClass(driver);
		Genric.ImplicitWait();
	}
//  Method for opening Orange HRM url and Maximize the web page
	public void precondition() {
		Genric.PreConditions();
	}
//	Method to Get login to the web site	
	public void Login() throws IOException {
		Genric.sendInput(Username,ex.Uname());
		Genric.sendInput(Password,ex.Password());
		Genric.clickWebElement(login);
		}
	
//  click Time link from side bar and Time sheets top bar item	
	public void timeTile() throws InterruptedException {
		Genric.clickWebElement(Time);
	}
	
//  fetching employee name from excel sheet	and selecting employee using robot keys	
	public void veiwEmployee() throws InterruptedException, AWTException, IOException {
		Genric.sendInput(EmpName,ex.TimesheetEmp());
		Thread.sleep(2000);
		Genric.RobotKey_DownEnter();
//      click view to see respective employee's time sheet
		Genric.clickWebElement(view);
		
	}
	
//  click edit option to edit employee time sheet	
	public void clickEdit() throws InterruptedException {
		Genric.clickWebElement(Edit);
		Genric.clickWebElement(trashIcon);
	}
	
//  clicking project input box and giving project title	
	public void Projectdetails() throws InterruptedException, AWTException, IOException {
		Genric.clickWebElement(project);
		Genric.sendInput(project,ex.projectTitle());
		Thread.sleep(3000);
		Genric.RobotKey_DownEnter();
	}
	
//  selecting activity from drop down using robot keys	
	public void Activitydrop() throws InterruptedException, AWTException {
		Genric.clickWebElement(Activity);
		Genric.clickWebElement(implementation);
	}
	
//  adding hours in hour input box
	public void dates() throws InterruptedException, IOException {
		Genric.sendInput(Mon,String.valueOf(ex.workingHour()));
		Genric.sendInput(Tue,String.valueOf(ex.workingHour()));
		Genric.sendInput(Wed,String.valueOf(ex.workingHour()));
		Genric.sendInput(Thu,String.valueOf(ex.workingHour()));
		Genric.sendInput(Fri,String.valueOf(ex.workingHour()));
	}
	
//  validating PopUp message	
	public void Save() throws InterruptedException {
		Genric.clickWebElement(save);
		String ExpectedTitle="Successfully Saved";
		Genric.visibilityCheck(popup);
		Genric.ValidatePopupMsg(popup,ExpectedTitle);
		System.out.println("Time sheet saved Successfully");
	}
 
}