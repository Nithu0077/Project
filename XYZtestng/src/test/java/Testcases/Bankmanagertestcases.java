package Testcases;

import java.io.IOException;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Baseclass.baseclass;
import Testpages.Bankmanagerlogin;
import Util.ExcelXYZ;

public class Bankmanagertestcases extends baseclass {
	Bankmanagerlogin login;
	ExcelXYZ excel=new ExcelXYZ();
	@BeforeSuite
	public void Login() {
		launchurl();
	}
	
@Test(priority=0)
public void AddcustomerDetails() throws IOException {
	login=new Bankmanagerlogin(driver);
	login.bankmanager();
	login.Addcustomerdteails(excel.Firstname(),excel.Lastname(),excel.postcode());
	login.clickaddcustmer();
	int cusID = login.POPup();
	excel.customerid(cusID);
}
@Test(priority=1)
public void OpenAccount() throws IOException {

	login.Openaccount();
	login.Customername(excel.Firstname()+" "+excel.Lastname());
	login.Currency(excel.currency());
	login.Process();
	int accno = login.Popup2();
	excel.accountno(accno);
	
}
@Test(priority=2)
public void Customers() throws IOException {
	login.Accountnumber();
	login.Customers(excel.Firstname()+" "+excel.Lastname());
	Screenshot();
}
}