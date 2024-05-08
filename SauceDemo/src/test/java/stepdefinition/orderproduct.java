package stepdefinition;



import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagefactory.order;

public class orderproduct {
	WebDriver driver=new EdgeDriver();
	order or;
	List<WebElement>pricelist;
	ArrayList<Double>beforeprice;
	
	@Given("User should able to enter the url")
	public void user_should_able_to_enter_the_url() throws InterruptedException {
		//System.setProperty("webdriver.edge.driver", "C:\\Users\\NP16\\Downloads\\edgedriver_win64\\msedgedriver.exe");
        //driver=new EdgeDriver();
        driver.get("https://www.saucedemo.com");
		driver.manage().window().maximize();
		or=new order(driver);
			
	    
	}

	@When("User can able to enter the username")
	public void user_can_able_to_enter_the_username() throws InterruptedException, IOException {
		
		or.Username();
		
		
	}

	@And("User can able to enter the password")
	public void user_can_able_to_enter_the_password() throws InterruptedException, IOException {
		or.Password();
		
	    
	}

	@And("User is able to click the login option")
	public void user_is_able_to_click_the_login_option() throws InterruptedException {
		or.Login();
		
	    
	}
//method to validate the sorted item
	@And("User select price low to highfrom dropdown")
	public void user_select_price_low_to_highfrom_dropdown() throws InterruptedException {
		beforeprice=new ArrayList<Double>();
		pricelist=or.price;
		for(WebElement we:pricelist)
		{
			beforeprice.add(Double.valueOf(we.getText().replace("$", "")));
		}
		System.out.println(beforeprice);
		Collections.sort(beforeprice);
		Select s=new Select(driver.findElement(By.className("product_sort_container")));
	    s.selectByVisibleText("Price (low to high)");
	
	}

	@And("User sort items in homepage as selected Price Low to High")
	public void user_sort_items_in_homepage_as_selected_price_low_to_high() throws InterruptedException {
		
		ArrayList<Double>afterPrice=new ArrayList<Double>();
		pricelist=or.price;
		for(WebElement p:pricelist)
		{
			afterPrice.add(Double.valueOf(p.getText().replace("$", "")));
		}
		System.out.println(afterPrice);
		 Assert.assertEquals(beforeprice, afterPrice);
	    
	}
 
		
	    
	

	@And("User should add multiple products to the cart")
	public void user_should_add_multiple_products_to_the_cart() throws InterruptedException {
		or.addcart();
		
		
	    
	}

	@And("User can able to displayed with the cart page")
	public void user_can_able_to_displayed_with_the_cart_page() throws InterruptedException {
		
		or.Carticon();
		
	    
	}

	@And("User click on checkout button")
	public void user_click_on_checkout_button() throws InterruptedException {
		or.Checkout();
		
	   
	}

	@And("User enter the first name")
	public void user_enter_the_first_name() throws InterruptedException, IOException {
		or.Firstname();
		
	    
	}

	@And("User enter the last name")
	public void user_enter_the_last_name() throws InterruptedException, IOException {
		or.Lastname();
		
	    
	}

	@And("User enter the postel in the text field")
	public void user_enter_the_postel_in_the_text_field() throws InterruptedException, IOException {
		or.postalcode();
		
	    
	}

	@And("User should able to displayed with Checkout: Overview page")
	public void user_should_able_to_displayed_with_checkout_overview_page() throws InterruptedException {
		or.Continue();
		
	    
	}

	@And("User should able to displayed with Checkout: Complete! Page")
	public void user_should_able_to_displayed_with_checkout_complete_page() throws InterruptedException {
		or.Finishbutton();
		
	    
	}
//method to display the order message by using screenshot
	@And("User should able to displayed with Thank you for your order!")
	public void user_should_able_to_displayed_with_thank_you_for_your_order() throws InterruptedException, IOException {
		TakesScreenshot sc=(TakesScreenshot)driver;
		File Src=sc.getScreenshotAs(OutputType.FILE);
		File dst=new File("./screenshot/scr1.png");
		FileUtils.copyFile(Src,dst);
		
	    
	}

	@Then("User should able to navigated back to Home page.")
	public void user_should_able_to_navigated_back_to_home_page() {
		or.backhome();
		
	    
	}

	}


