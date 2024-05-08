package stepdefinition;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import Excel.Generics;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagefactory.reset;


public class resetproduct {
	WebDriver driver=new EdgeDriver();
	reset re;
	Generics gen=new Generics(driver);
	List<WebElement>price;
	@Given("User should enter the saucedemo website")
	public void user_should_enter_the_saucedemo_website() throws InterruptedException {
		//System.setProperty("webdriver.edge.driver", "C:\\Users\\NP16\\Downloads\\edgedriver_win64\\msedgedriver.exe");
       // driver=new EdgeDriver();
        driver.get("https://www.saucedemo.com");
		driver.manage().window().maximize();
		re=new reset (driver);
			
	    
	}

	@When("User Enter the valid username")
	public void user_enter_the_valid_username() throws InterruptedException, IOException {
		
		re.Username();
		
	    
	}

	@And("User enter the valid password")
	public void user_enter_the_valid_password() throws InterruptedException, IOException {
		re.Password();
	    
	}

	@And("User click on login button")
	public void user_click_on_login_button() throws InterruptedException {
		re.Login();
	    
	}

	@And("User click the dropdown ZtoA button")
	public void user_click_the_dropdown_zto_a_button() {
		ArrayList<String> beforeprice=new ArrayList<String>();
		price=re.price;
		for(WebElement we:price)
		{
			beforeprice.add(we.getText());
		}
		System.out.println(beforeprice);
		Collections.sort(beforeprice);
		Collections.reverse(beforeprice);
 
		Select s=new Select(driver.findElement(By.className("product_sort_container")));
	    s.selectByVisibleText("Name (Z to A)");
	    
		ArrayList<String> afterPrice=new ArrayList<String>();
		price=re.price;
		for(WebElement p:price)
		{
			afterPrice.add(p.getText());
		}
		System.out.println(afterPrice);
		 Assert.assertEquals(beforeprice, afterPrice);    
	}
	    
	

	@And("User shold able to add multiple items")
	public void user_shold_able_to_add_multiple_items() throws InterruptedException {
		re.addcart();
	    
	}

	@And("User clicks add to cart of any product")
	public void user_clicks_add_to_cart_of_any_product() {
	    
	}

	@And("User should view the added items")
	public void user_should_view_the_added_items() {
		WebElement title = driver.findElement(By.xpath("//span[text()='2']"));
        String ExpectedText = "2";
		gen.Assertequals(title,ExpectedText);
		System.out.println("Number of the product in cart is same");
	      
	}
	    


	@And("User click on Reset app state")
	public void user_click_on_reset_app_state() throws InterruptedException {
		re.Reset();
	    
	}

	@And("User should validate the cart is empty")
	public void user_should_validate_the_cart_is_empty() {
		WebElement itemdisplay = driver.findElement(By.cssSelector("a.shopping_cart_link"));
		gen.Asserttrue(itemdisplay);
		System.out.println("The cart is empty");
		
	    
	}

	@Then("User should perform logout")
	public void user_should_perform_logout() {
		re.logout();  
	}
	}


