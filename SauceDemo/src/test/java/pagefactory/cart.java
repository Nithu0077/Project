package pagefactory;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Excel.Generics;
import Excel.Read_data;

public class cart {
	WebDriver driver;
	Generics gen; 
	Read_data rd = new Read_data();
	@FindBy(id="user-name") WebElement username;

	@FindBy(name="password") WebElement password;

	@FindBy(className="btn_action") WebElement Login;
	@FindBy(name="add-to-cart-sauce-labs-bolt-t-shirt")WebElement addcart;
	@FindBy(id="shopping_cart_container")WebElement carticon;
	@FindBy(id="continue-shopping")WebElement continueshopping;
	  public cart(WebDriver driver) {
		  this.driver=driver;
		  PageFactory.initElements(driver,this);
		  gen = new Generics(driver);
		  gen.ImplicitWait();
	}
//    method to enter the UserName
	  public void Username() throws IOException {
		  gen.sendkeysAction(username,rd.Uname());
	  }
//    method to enter the password	  
	  public void Userpass() throws IOException {
		  gen.sendkeysAction(password,rd.Password());
		  
	  }
	 
//    method to click login
	  public void login() throws InterruptedException {
		  gen.clickAction(Login);
		 
	  }
//    method to click add to cart 	  
	  public void addproduct() {
		  gen.clickAction(addcart);
		  
	  }
//     method to click icon	  
	  
	  public void Carticon() {
		  gen.clickAction(carticon);
		 
	}
//     method to click continue shopping	  
	  public void continuebutton(){
		  gen.clickAction(continueshopping);
	  	

	  }

	

}

	


