package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class NewCustomer {
	@FindBy(xpath="//button[@ng-click='manager()']") WebElement Bankmanager;
	@FindBy(xpath="//button[@ng-class='btnClass1']") WebElement Addcustomer;
	@FindBy(xpath="//input[@placeholder='First Name']") WebElement Firstname;
	@FindBy(xpath="//input[@placeholder='Last Name']") WebElement Lastname;
	@FindBy(xpath="//input[@placeholder='Post Code']") WebElement Pincode;
	@FindBy(xpath="//button[@type='submit']") WebElement submit;
	@FindBy(xpath="//button[@ng-class='btnClass2']") WebElement Openaccount;
	@FindBy(id="userSelect")WebElement customername;
	@FindBy(name="currency")WebElement currency;
	@FindBy(xpath="//button[text()='Process']")WebElement process;
	@FindBy(xpath="//button[@ng-class='btnClass3']")WebElement customer;
	@FindBy(xpath="//input[@placeholder='Search Customer']")WebElement Searchcustomer;
	@FindBy(xpath="//button[text()='Delete']")WebElement delete;
	WebDriver driver;
public NewCustomer(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver,this);
}
public void Bank() {
	Bankmanager.click();
}
public void Customer() {
	Addcustomer.click();
	Firstname.sendKeys("Nithya");
	Lastname.sendKeys("P");
	Pincode.sendKeys("12345");
	submit.click();
}
public void POPup() {
	String value=driver.switchTo().alert().getText();
	driver.switchTo().alert().accept();
	System.out.println(value);
}
	
public void Account() {
	customername.click();
	Select sc=new Select(customername);
	sc.selectByVisibleText("Nithya P");
	currency.click();
	Select se=new Select(currency);
	se.selectByVisibleText("Doller");
	process.click();
}
public void Pop() {
	String method=driver.switchTo().alert().getText();
	driver.switchTo().alert().accept();
	System.out.println(method);
}
public void Detail() {
	customer.click();
	Searchcustomer.sendKeys("Nithya");
	delete.click();
	
	
	
	
}

}

