package pagefactory;

	 
	import java.io.IOException;

import org.openqa.selenium.WebDriver;

	import org.openqa.selenium.WebElement;

	import org.openqa.selenium.support.FindBy;

	import org.openqa.selenium.support.PageFactory;

import Excel.Generics;
import Excel.Read_data;
	 
	public class Login {

		WebDriver driver;
		Generics gen; 
		Read_data rd = new Read_data();
		@FindBy(id="user-name") WebElement username;

		@FindBy(name="password") WebElement password;

		@FindBy(className="btn_action") WebElement Login;
		@FindBy(name="add-to-cart-test.allthethings()-t-shirt-(red)")WebElement addcart;
		@FindBy(id="shopping_cart_container")WebElement carticon;
		
//constructor initializing driver
	  public Login(WebDriver driver) {

		  this.driver=driver;

		  PageFactory.initElements(driver,this);
		  gen = new Generics(driver);
		  gen.ImplicitWait();

	  }
	  
	  
	//method to enterUserName
	  public void Username() throws InterruptedException, IOException {
		  gen.sendkeysAction(username,rd.Uname());
	  }
	  
	  //method to enter password
	  public void Password() throws InterruptedException, IOException {
		  gen.sendkeysAction(password,rd.Password());

		  
	 }
	  
	//method to click login 
	 public void login() throws InterruptedException {
		  gen.clickAction(Login);
	 }
	 
	 //method to click add cart
	 public void lastproduct() throws InterruptedException {
		  gen.clickAction(addcart);
	 }
	
	 //method to icon
	  public void Carticon() throws InterruptedException {
		  gen.clickAction(carticon);
	  }

	}		

	


