package PageFactoryFiles;

import java.awt.AWTException;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import DataFiles.GenericMethodClass;
import DataFiles.excel;

public class LeavePf {

	@FindBy(name = "username")
	WebElement Username;
	@FindBy(xpath = "//input[@name='password']")
	WebElement Password;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement login;
	@FindBy(css="[href='/web/index.php/leave/viewLeaveModule']")
	WebElement Leave;
	@FindBy(xpath = "//*[contains(text(),'Assign Leave')]")
	WebElement assignLeave;
	@FindBy(xpath = "//input[@placeholder='Type for hints...']")
	WebElement Empname;
	@FindBy(css="i.oxd-select-text--arrow")
	WebElement LeaveType;
	@FindBy(xpath = "(//input[@class=\"oxd-input oxd-input--active\"])[2]")
	WebElement FromDate;
	@FindBy(xpath = "(//*[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[2]")
	WebElement Duration;
	@FindBy(css = "textarea.oxd-textarea")
	WebElement comments;
	@FindBy(xpath = "//*[@type='submit']")
	WebElement assign;
	@FindBy(xpath = "//button[text()=' Ok ']")
	WebElement OkBtn;

	WebDriver driver;
//	Creating object for excel class
	excel ex = new excel();

//	Creating object for Generic class
	GenericMethodClass Genric;

//  constructor for Initializing driver and driver elements
	public LeavePf(WebDriver driver) throws AWTException {
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

//  click Leave link from side bar and assignLeave top bar item
	public void AssignLeave() throws InterruptedException {
		Genric.clickWebElement(Leave);
		Genric.clickWebElement(assignLeave);

	}

//	Adding leave details and Assigning leave to the respective employee
	public void leaveDetails() throws InterruptedException, AWTException, IOException {
		Genric.sendInput(Empname,ex.EmployeeName());
		Thread.sleep(2000);
		Genric.RobotKey_DownEnter();
		Genric.clickWebElement(LeaveType);
		Thread.sleep(3000);
		Genric.RobotKey_DownEnter();
		Genric.sendInput(FromDate,ex.Date());
		Genric.sendInput(comments,ex.Comments());
		Genric.clickWebElement(assign);

	}

//	Click save button
	public void popUp() throws InterruptedException {
		Genric.clickWebElement(OkBtn);
		driver.quit();
	}

}
