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
import pagefactory.remove;
public class removecart {
	WebDriver driver=new EdgeDriver();
	remove re;
	Generics gen=new Generics(driver);
	@Given("User should enter the url")
	public void user_should_enter_the_url() throws InterruptedException {
		//System.setProperty("webdriver.edge.driver", "C:\\Users\\NP16\\Downloads\\edgedriver_win64\\msedgedriver.exe");
       // driver=new EdgeDriver();
        driver.get("https://www.saucedemo.com");
		driver.manage().window().maximize();
		re=new remove(driver);
			
			
	    
	}

	@When("User should able to enter the username")
	public void user_should_able_to_enter_the_username()throws InterruptedException, IOException {
		
	    
		re.Username();
	   
	}

	

	@And("User should able to enter the password")
	public void user_should_able_to_enter_the_password() throws InterruptedException, IOException {
		re.Password();
		
	    
	}

	@And("User should able to click the login button")
	public void user_should_able_to_click_the_login_button() throws InterruptedException {
		re.Login();
		
	    
	}

	@And("User should able to add the 3rd product to the cart")
	public void user_should_able_to_add_the_3rd_product_to_the_cart() throws InterruptedException {
		re.Product3();
		
	    
	}

	@And("User should add the 1st product to the cart")
	public void user_should_add_the_1st_product_to_the_cart() throws InterruptedException {
		re.Product1();
		
	    
	}

	@And("User should be displayed with cart page")
	public void user_should_be_displayed_with_cart_page() throws InterruptedException {
		re.Carticon();
		
	    
	}
//method to validate selected product is displayed or not
	@And("User should able to view the selected item in the cart")
	public void user_should_able_to_view_the_selected_item_in_the_cart()  {
		WebElement product1= driver.findElement(By.linkText("Sauce Labs Bolt T-Shirt"));
		gen.Asserttrue(product1);
		System.out.println("Selected Product1 is displayed ");
		
		WebElement product2 = driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']"));
		gen.Asserttrue(product2);
		System.out.println("Selected product2 is displayed ");
	}

	@And("User clicks the remove button of 2nd product")
	public void user_clicks_the_remove_button_of_2nd_product() throws InterruptedException  {
		re.Remove();
		
		
	}
//method to validate the product is removed
	@Then("User should remove 2nd product from the cart")
	public void user_should_remove_2nd_product_from_the_cart() {
		WebElement product1= driver.findElement(By.linkText("Sauce Labs Bolt T-Shirt"));
		gen.Asserttrue(product1);
		System.out.println("Selected Product is removed");
	   



	

	}

}