package stepdefinition;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import Excel.Generics;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagefactory.cart;

public class cart1 {
	WebDriver driver=new EdgeDriver();
	cart ca;
	Generics gen=new Generics(driver);;
	@Given("user should on the login page")
	public void user_should_on_the_login_page() throws InterruptedException {
		//WebDriver driver=new EdgeDriver();
		//System.setProperty("webdriver.edge.driver", "C:\\Users\\NP16\\Downloads\\edgedriver_win64\\msedgedriver.exe");
       // driver=new EdgeDriver();
        driver.get("https://www.saucedemo.com");
		driver.manage().window().maximize();
		ca=new cart(driver);
		
	   
	    
	}
	@When("user shouldenters the username")
	public void user_shouldenters_the_username() throws InterruptedException, IOException {
		ca.Username();
		
	    
	    
	}
	@And("user should enters the password")
	public void user_should_enters_the_password() throws InterruptedException, IOException {
		ca.Userpass();
		
	    
	}
	@And("user shouldclicks the login button")
	public void user_shouldclicks_the_login_button() throws InterruptedException {
		ca.login();
		
	    
	    
	}
	@And("user should add last product to the cart")
	public void user_should_add_3rd_product_to_the_cart() throws InterruptedException {
		ca.addproduct();
		
	    
	    
	}
	@And("user is on displayed with cart page")
	public void user_is_on_displayed_with_cart_page() throws InterruptedException {
		ca.Carticon();
		
	    
	    
	}
// method to validate the item is Displayed or not
	@And("user should view the selected items in the cart and displayed in home page")
	public void user_should_view_the_selected_items_in_the_cart_and_displayed_in_home_page() {
		WebElement itemdisplay = driver.findElement(By.linkText("Sauce Labs Bolt T-Shirt"));
		gen.Asserttrue(itemdisplay);
		System.out.println("Selected item is present ");
		
		WebElement title = driver.findElement(By.className("inventory_item_price"));
        String ExpectedText = "$15.99";
		gen.Assertequals(title, ExpectedText);
		System.out.println("Price of the product is same");
	    
	}
	


	@And("user should able to click on continue shopping")
	public void user_should_able_to_click_on_continue_shopping() throws InterruptedException {
		ca.continuebutton();
		
	    
	    
	}

	@Then("user should navigated to home page")
	public void user_should_navigated_to_home_page() {
		driver.quit();
	    
	    
	}
	}


