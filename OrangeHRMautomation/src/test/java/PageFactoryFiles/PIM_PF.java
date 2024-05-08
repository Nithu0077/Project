package PageFactoryFiles;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import DataFiles.GenericMethodClass;
import DataFiles.excel;

public class PIM_PF {

	@FindBy(name = "username")
	WebElement Username;
	@FindBy(xpath = "//input[@name='password']")
	WebElement Password;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement login;
	@FindBy(xpath = "//*[@href='/web/index.php/pim/viewPimModule']")
	WebElement PIMlink;
	@FindBy(xpath = "//a[text()='Employee List']")
	WebElement EmpList;
	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
	WebElement Addemp;
	@FindBy(css = "input.orangehrm-firstname")
	WebElement empFN;
	@FindBy(css = "input.orangehrm-middlename")
	WebElement empMN;
	@FindBy(css = "input.orangehrm-lastname")
	WebElement empLN;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement saveEmp;
	@FindBy(xpath = "//div[1]/div[2]/div/div/div[2]/input")
	WebElement Nickname;
	@FindBy(xpath = "//div[3]/div[1]/div[1]/div/div[2]/div/div/div[2]/i")
	WebElement nationality;
	@FindBy(xpath = "//*[contains(text(),\"Japanese\")]")
	WebElement japan;
	@FindBy(xpath = "//div[3]/div[1]/div[2]/div/div[2]/div/div/div[2]/i")
	WebElement marital;
	@FindBy(xpath = "(//*[@placeholder='yyyy-mm-dd'])[2]")
	WebElement DOB;
	@FindBy(xpath = "//div[2]/div[2]/div/label/span")
	WebElement radioBtn;
	@FindBy(xpath = "//div[5]/button")
	WebElement savePersonal;
	@FindBy(xpath = "(//*[@placeholder='Type for hints...'])[1]")
	WebElement EmpName;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement submit;
	@FindBy(xpath = "//button[@type='reset']")
	WebElement reset;
	@FindBy(xpath = "//div[2]/div/div[1]/div/div/label/span/i")
	WebElement secondCheckbox;
	@FindBy(xpath = "//button[text()=' No, Cancel ']")
	WebElement cancelBtn;
	@FindBy(css = "button.oxd-button--label-danger")
	WebElement deleteBtn;
	@FindBy(css="p.oxd-text--toast-message")
	WebElement popup;
	@FindBy(xpath = "//div[4]/div/div[3]/div")
	WebElement expextedName;
	WebDriver driver=new EdgeDriver();;
	Robot robot;
//	Creating object for excel class
	excel ex = new excel();

//	Creating object for Generic class
	GenericMethodClass Genric;

//  Initializing driver and driver elements
	public PIM_PF(WebDriver driver) throws AWTException {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		Genric = new GenericMethodClass(driver);
		Genric.ImplicitWait();
	}

//	Getting login to the web site
	public void Login() throws IOException {
		Genric.PreConditions();
		Genric.sendInput(Username,ex.Uname());
		Genric.sendInput(Password,ex.Password());
		Genric.clickWebElement(login);
		}

//  click PIM link from side bar and Employee list top bar item
	public void pimLink() {
		Genric.clickWebElement(PIMlink);
	}
	public void empList() {
		Genric.clickWebElement(EmpList);
	}
//	Adding Employee first name, middle name and last name
	public void EmpDetails() throws IOException {
		Genric.clickWebElement(Addemp);
		Genric.sendInput(empFN,ex.firstname());
		Genric.sendInput(empMN,ex.middlename());
		Genric.sendInput(empLN,ex.lastname());
		Genric.clickWebElement(saveEmp);
	}

//  validating popUp message
	public void Popup1() {
		String ExpectedTitle="Successfully Saved";
		Genric.visibilityCheck(popup);
		Genric.ValidatePopupMsg(popup,ExpectedTitle);
		System.out.println("Emplyee added Successfully");
	}

//  Fetching nick name from excel sheet
	public void personelDetails() throws IOException {
		Genric.sendInput(Nickname,ex.nickname());
	}

//  selecting Japan nation from the drop down
	public void nationality() throws InterruptedException {
		Genric.clickWebElement(nationality);
		Thread.sleep(1000);
		Genric.clickWebElement(japan);
	}

//  selecting Marital status from the drop down using robot keys
	public void marital() throws AWTException {
		Genric.clickWebElement(marital);
		Genric.RobotKey_DownEnter();
	}

//  fetching date input from excel
	public void dob() throws IOException {
		Genric.sendInput(DOB,ex.Date());
	}

//  clicking female radio button
	public void gender() {
		Genric.clickWebElement(radioBtn);
		Genric.clickWebElement(savePersonal);
	}
//  validating popUp message using asserts
	public void Popup2() {
		String ExpectedTitle="Successfully Updated";
		Genric.visibilityCheck(popup);
		Genric.ValidatePopupMsg(popup,ExpectedTitle);
		System.out.println("Personel details added Successfully");
		
	}

//  type employee name and select using robot keys and clicking submit to view respective user
	public void searchEmp() throws IOException, InterruptedException, AWTException {
		Genric.clickWebElement(EmpList);
		Genric.sendInput(EmpName,ex.firstname());
		Thread.sleep(3000);
		Genric.RobotKey_DownEnter();
		Genric.clickWebElement(submit);
	}

	
//  Method to take screen shot for respective user is visible under records
	public void Take_Screenshot() throws InterruptedException, IOException {
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// This  will scroll down the page by  500 pixel vertical
		js.executeScript("window.scrollBy(0,500)");
		TakesScreenshot sc=(TakesScreenshot)driver;
		File Src=sc.getScreenshotAs(OutputType.FILE);
		File dst=new File("./screenshots/scr4.png");
		FileUtils.copyFile(Src,dst);
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,-500)");
		Thread.sleep(3000);
	}

	
//  click reset to view existing employee records
	public void clickReset() throws InterruptedException {
		Genric.clickWebElement(reset);
		}

//  clicking second check box from employee records
	public void checkBx() {
		Genric.clickWebElement(secondCheckbox);
	}

//  deleting selected employee from records
	public void deleteSelected() {
		Genric.clickWebElement(deleteBtn);
	}

//  Canceling the delete action here
	public void noCancel(){
		Genric.clickWebElement(cancelBtn);
	}

}
