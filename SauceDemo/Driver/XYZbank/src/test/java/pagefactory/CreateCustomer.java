package pagefactory;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import data.Excel;

public class CreateCustomer {
	
	@FindBy(xpath="//button[text()='Bank Manager Login']")WebElement Bank;
	@FindBy(xpath="//button[@ng-class='btnClass1']")WebElement Addcustomer;
	@FindBy(xpath="//input[@placeholder='First Name']")WebElement Firstname;
    @FindBy(xpath="//input[@placeholder='Last Name']")WebElement Lastname;
    @FindBy(xpath="//input[@placeholder='Post Code']")WebElement Postcode;
	@FindBy(xpath="//button[@type='submit']")WebElement submit;
	@FindBy(xpath="//button[contains(@class,'btn-lg tab btn')]")WebElement Openaccount;
	@FindBy(xpath="//select[@name='userSelect']")WebElement customer;
	@FindBy(name="currency")WebElement Currency;
	@FindBy(xpath="//button[@type='submit']")WebElement Process;
    @FindBy(xpath="//input[@placeholder='Search Customer']")WebElement SearchCustomer;
    @FindBy(xpath="//button[text()='Delete']")WebElement Deletecustomer;
    WebDriver driver;
    Excel exe=new Excel();
    public CreateCustomer(WebDriver driver) {
 	   this.driver=driver;
 	   PageFactory.initElements(driver,this);
    }
    public void bank() {
    	Bank.click();
    	
    }
    public void addcustomer() throws IOException {
    	Addcustomer.click();
    	Firstname.sendKeys(exe.Firstname());
    	Lastname.sendKeys(exe.Lastname());
    	Postcode.sendKeys(String.valueOf(exe.Pincode()));
    	
    }
    public void finish() {
    	
    	submit.click();
    }
    public void account() {
    	
    	Openaccount.click();
    }
    public void money() {
    	Select sc=new Select(customer);
    	customer.sendKeys("Nithya");
    	Select sd=new Select(Currency);
    	Currency.sendKeys("Doller");
    }
    public void submit() {
    	Process.click();
    }
    public void customer() {
    	SearchCustomer.click();
    
    }
    public void delete() {
    	Deletecustomer.click();
    }
	
	

}
