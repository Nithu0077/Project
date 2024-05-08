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
import pagefactory.Login;

public class login {
	WebDriver driver=new EdgeDriver();
	Login un;
	Generics gen=new Generics(driver);
	@Given("user is on the login page")
	public void user_is_on_the_login_page() throws InterruptedException {
		//System.setProperty("webdriver.edge.driver", "C:\\Users\\NP16\\Downloads\\edgedriver_win64\\msedgedriver.exe");
        //driver=new EdgeDriver();
        driver.get("https://www.saucedemo.com");
		driver.manage().window().maximize();
		un=new Login(driver);
	    
	}

	@When("user enters the username")
	public void user_enters_the_username() throws InterruptedException, IOException {
		un.Username();
		
		
	   
	}

	@And("user enters the password")
	public void user_enters_the_password() throws InterruptedException, IOException {
		un.Password();
		
	    
	}

	@And("user clicks the login button")
	public void user_clicks_the_login_button() throws InterruptedException {
		un.login();
		
	   
	   
	}

	@And("user should navigate to home page and add last product to the cart")
	public void user_should_navigate_to_home_page_and_add_last_product_to_the_cart() throws InterruptedException {
	   un.lastproduct();
	   
	    
	}

	@And("user should displayed with cart page")
	public void user_should_displayed_with_cart_page() throws InterruptedException {
	   un.Carticon();
	    
	}
//method to validate the product
	@Then("user should view the selected item on the cart")
	public void user_should_view_the_selected_item_on_the_cart() {
		WebElement title = driver.findElement(By.partialLinkText("Test.allTheThings()"));
		String ExpectedText = "Test.allTheThings() T-Shirt (Red)";
		gen.Assertequals(title, ExpectedText);
		System.out.println("Title of the product is same");
		driver.quit();
	    
	    
	}
 



	

	}


