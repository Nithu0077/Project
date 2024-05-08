package stepdefinition;

import org.openqa.selenium.WebDriver;

import base.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagefactory.NewCustomer;

public class CreateCustomer extends BaseClass {
	NewCustomer cost;
	WebDriver driver;
	@Given("user should on login page")
	public void user_should_on_login_page() {
		cost=new NewCustomer(driver);
		Login();
		cost.Bank();
	}

	@When("User should click on add customer and enter the customer details")
	public void user_should_click_on_add_customer_and_enter_the_customer_details() {
		cost.Customer();
		
	   
	   
	}

	@And("User should validate the pop-up and click on ok")
	public void user_should_validate_the_pop_up_and_click_on_ok() {
		cost.POPup();
	    
	    
	}

	@And("User should click on open account enter the customername,currency and click on process")
	public void user_should_click_on_open_account_enter_the_customername_currency_and_click_on_process() {
		cost.Account();
	   
	    
	}

	@And("User should validate the pop-up is displayed and click on ok")
	public void user_should_validate_the_pop_up_is_displayed_and_click_on_ok() {
		cost.Pop();
	    
	    
	}

	@Then("User should click on customers,search customer and delete")
	public void user_should_click_on_customers_search_customer_and_delete() {
		cost.Detail();
	   
	    
	}




}
