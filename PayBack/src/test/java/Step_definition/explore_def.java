package Step_definition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagefactory.explore;

public class explore_def {
	WebDriver driver;
	explore in=new explore(driver);
	@Given("user is in homepage")
	public void user_is_in_homepage() {
		in.homepage();
	}
	@When("user clicks on explore")
	public void user_clicks_on_explore() {
	    in.explore();
	}

	@And("click on instant vouchers")
	public void click_on_instant_vouchers() {
	    in.ins_vouc();
	}

	@And("select filter option")
	public void select_filter_option() {
	    in.check();
	    in.apply();
	}

	@And("clicks on buy now button")
	public void clicks_on_buy_now_button() {
	    in.product();
	}

	@Then("user navigates to product page")
	public void user_navigates_to_product_page() {
	    in.pro_page();
	}

	

	}
