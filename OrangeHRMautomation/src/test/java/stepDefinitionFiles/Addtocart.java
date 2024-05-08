package stepDefinitionFiles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageFactoryFiles.AddtocartPF;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

    public class Addtocart  {
    	WebDriver driver;
    	AddtocartPF add;
    	
    @Given("enter sauce demo url in browser")
	public void enter_sauce_demo_url_in_browser() {
    	driver = new ChromeDriver();
    	add = new AddtocartPF(driver);
		add.precondition();
	    
	}

	@When("user gives credentials")
	public void user_gives_credentials() {
		add.url();
	    
	}

	@When("click login button")
	public void click_login_button() {
	    add.login();
	}

	@When("navigate to last product and add it to cart")
	public void navigate_to_last_product_and_add_it_to_cart() {
	    add.addCart();
	}

	@Then("validate the added product")
	public void validate_the_added_product() {
	    add.validateCart();
	}

}
