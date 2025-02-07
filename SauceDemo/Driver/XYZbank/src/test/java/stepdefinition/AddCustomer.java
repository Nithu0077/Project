package stepdefinition;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagefactory.CreateCustomer;

public class AddCustomer {
	
	WebDriver driver=new EdgeDriver();
	CreateCustomer cost=new CreateCustomer(driver);
	
	@Given("user should enter the login page")
public void user_should_enter_the_login_page() {
		driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
		driver.manage().window().maximize();
    
}

@When("user should click bankmanager")
public void user_should_click_bankmanager() {
	cost.bank();
	
   
}

@And("user should addcustomer and enter the customer details")
public void user_should_addcustomer_and_enter_the_customer_details() throws IOException {
	cost.addcustomer();
    
   
}

@And("user should validate the popup click ok")
public void user_should_validate_the_popup_click_ok() {
	cost.finish();
	driver.switchTo().alert().accept();
	   System.out.println(cost);
    
}

@And("user sholud click open account and add details of customer")
public void user_sholud_click_open_account_and_add_details_of_customer() {
	cost.account();
    
}

@And("user should check the popup click on ok")
public void user_should_check_the_popup_click_on_ok() {
	cost.money();
	driver.switchTo().alert().accept();
	   System.out.println(cost);
   
}

@Then("user should go to customer and go to newly created account")
public void user_should_go_to_customer_and_go_to_newly_created_account() throws IOException {
	TakesScreenshot s=(TakesScreenshot)driver;
	File Src=s.getScreenshotAs(OutputType.FILE);
	File dst=new File("\"./screenshot/scr1.png\"");
	FileUtils.copyFile(Src,dst);
	cost.submit();
   
}

}
