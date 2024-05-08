package Testpages;

import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.reporters.Files;


import Util.GenericXYZ;

public class Bankmanagerlogin extends GenericXYZ {
	
	@FindBy(xpath = "//button[text()='Bank Manager Login']")
	WebElement bankmanagerlogin;
	@FindBy(xpath = "//button[@ng-class='btnClass1']")
	WebElement addcustomerBtn;
	@FindBy(xpath = "//input[@ng-model='fName']")
	WebElement fname;
	@FindBy(xpath = "//input[@ng-model='lName']")
	WebElement lastname;
	@FindBy(xpath = "//input[@ng-model='postCd']")
	WebElement postcode;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement submitdetails;
	@FindBy(xpath = "//button[@ng-click='openAccount()']")
	WebElement openaccBtn;
	@FindBy(id="userSelect")
	WebElement cusName;
	@FindBy(id="currency")
	WebElement currency;
	@FindBy(xpath = "//button[@ng-click='showCust()']")
	WebElement custTile;
	@FindBy(xpath = "//input[@ng-model='searchCustomer']")
	WebElement searchCus;
	WebDriver driver;
	 public Bankmanagerlogin (WebDriver driver) {
     super(driver) ;
	 this.driver=driver;
	  PageFactory.initElements(driver,this);
	 }
		
	  public void bankmanager() {
			Click(bankmanagerlogin);
		}
		public void Addcustomerdteails(String first,String last,String pin) {
			Click(addcustomerBtn);
			sendKeys(fname,first);
			sendKeys(lastname,last);
			sendKeys(postcode,pin);
			
			
			
		}
		public void clickaddcustmer() {
			Click(submitdetails);
			
		}
		public int POPup() {
			String ID =driver.switchTo().alert().getText();
			String customerID=ID.split(":")[1];
			int customer=Integer.parseInt(customerID);
			driver.switchTo().alert().accept();
			System.out.println(customer);
			return customer;
			
			
		}
		public void CustomerId() {
			
		}
		public void Openaccount() {
			Click(openaccBtn);
			
		}
		public void Customername(String customer) {
			sendKeys(cusName,customer);
			
		}
		public void Currency(String curr) {
			sendKeys(currency,curr);
			
		}
		public void Process() {
			Click(submitdetails);
			
		}
		public int Popup2() {
			String pop =driver.switchTo().alert().getText();
			String customerpop=pop.split(":")[1];
			int opencustomer=Integer.parseInt(customerpop);
			driver.switchTo().alert().accept();
			System.out.println(opencustomer);
			return opencustomer;
			
		}
		public void Accountnumber() {
			Click(custTile);
			
			
		}
		public void Customers(String search) {
			sendKeys(searchCus,search);
			
			
		}
		
		


}

