package PageFactoryFiles;
import java.awt.AWTException;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import DataFiles.GenericMethodClass;
import DataFiles.excel;
public class HRMloginPF {

	@FindBy(name = "username")
	WebElement Username;
	@FindBy(xpath = "//input[@name='password']")
	WebElement Password;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement login;
	@FindBy(xpath = "//*[@href=\"/web/index.php/admin/viewAdminModule\"]")
	WebElement adminlink;
	@FindBy(xpath = "//*[contains(text(),\"User Management \")]")
	WebElement usermgt;
	@FindBy(xpath = "//*[contains(text(),\"Users\")]")
	WebElement users;
	@FindBy(xpath = "//div[2]/div[1]/button")
	WebElement addBtn;
	@FindBy(xpath = "(//*[@class='oxd-select-text--after'])[1]")
	WebElement userRole;
	@FindBy(xpath= "//input[@placeholder=\"Type for hints...\"]")
	WebElement empName;
	@FindBy(xpath = "(//*[@class='oxd-select-text--after'])[2]")
	WebElement status;
	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
	WebElement username;
	@FindBy(xpath = "(//*[@type='password'])[1]")
	WebElement psword;
	@FindBy(xpath = "(//*[@type='password'])[2]")
	WebElement confpswrd;
	@FindBy(xpath= "//button[@type=\"submit\"]")
	WebElement saveBtn;
	@FindBy(xpath= "//div[2]/input")
	WebElement AddedUser;
	@FindBy(xpath= "//div[2]/button[2]")
	WebElement searchBtn;
	@FindBy(css= "div.oxd-padding-cell")
	WebElement AddedUserVisible;
	@FindBy(css = "img.oxd-userdropdown-img")
	WebElement userProfile;
	@FindBy(xpath = "//a[@href='/web/index.php/auth/logout']")
	WebElement logoutBtn ;
	@FindBy(css = "div.orangehrm-login-branding")
	WebElement OrangeHrmLogo;
	@FindBy(css="p.oxd-text--toast-message")
	WebElement popup;
	@FindBy(xpath="(//span[@class='oxd-text oxd-text--span'])[1]")
	WebElement records;
	@FindBy(css="div[class='oxd-table-cell oxd-padding-cell']:nth-child(2)")
	List<WebElement> titles;
	String none = "No Records Found";
	String finalUser;

	WebDriver driver;
//	Creating object for excel class
	excel ex = new excel();

//	Creating object for Generic class
	GenericMethodClass Genric;

//  Constructor Initializing driver and driver elements
	public HRMloginPF(WebDriver driver) throws AWTException {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		Genric = new GenericMethodClass(driver);
		Genric.ImplicitWait();
	}
	
//  Method for opening Orange HRM url and Maximize the web page
	public void precondition() {
		Genric.PreConditions();
	}

//	login with valid credentials to OrangeHRM in edge browser
	public void Login() throws IOException {
		Genric.sendInput(Username,ex.Uname());
		Genric.sendInput(Password,ex.Password());
		Genric.clickWebElement(login);
		}

//	Method for navigate to user page
	public void ClickAdminLink() throws AWTException,IOException, InterruptedException {
		Genric.clickWebElement(adminlink);
		Genric.clickWebElement(usermgt);
		Genric.clickWebElement(users);
	}
	
//	Method to use different data when it shows already exist
	public String CheckUsername() throws IOException, AWTException {
		int i=1;
		finalUser = ex.NewUserName(2,1);
		Genric.sendInput(AddedUser, finalUser);
		Genric.clickWebElement(searchBtn);
		Genric.visibilityCheck(records);
		String text = records.getText();
		while(!text.equals(none)) {
			AddedUser.click();
			Genric.roboDelete();
			i++;
			finalUser = ex.NewUserName(i, 1);
			Genric.sendInput(AddedUser, finalUser);
			Genric.clickWebElement(searchBtn);
			text = records.getText();
		}
		System.out.println(text);
		return finalUser;
	}
	
//	Method for Adding new user	
	public void AddingNewUser() throws IOException, AWTException, InterruptedException {
		Genric.visibilityCheck(addBtn);
		Genric.clickWebElement(addBtn);
		Genric.clickWebElement(userRole);
		Genric.RobotKey_DownEnter();
		Genric.sendInput(empName,ex.EmployeeName());
		Thread.sleep(2000);
		Genric.RobotKey_DownEnter();
		Genric.clickWebElement(status);
		Genric.RobotKey_DownEnter();
		Genric.sendInput(username,finalUser);
		Genric.sendInput(psword,ex.NewPassword());
		Genric.sendInput(confpswrd,ex.NewPassword());
		Genric.clickWebElement(saveBtn);
		}

//	Validating the Pop message
	public void Popup() {
		String ExpectedTitle="Successfully Saved";
		Genric.visibilityCheck(popup);
		Genric.ValidatePopupMsg(popup,ExpectedTitle);
		System.out.println("New system user added Successfully");
	}

//	Searching and validating the added User
	public void Addeduser() throws IOException{
		Genric.sendInput(AddedUser,finalUser);
		Genric.clickWebElement(searchBtn);
		Genric.ValidateElementVisible(titles,finalUser);
		System.out.println("Added User is visible under Records");

	}

//	Getting logout and validating that successfully logged out
	public void Logout() throws InterruptedException {
		Genric.clickWebElement(userProfile);
		Genric.clickWebElement(logoutBtn);
		System.out.println("successfully logged out.");
		}
}
