package pagefactory;


import java.io.IOException;
import java.util.List;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Excel.Generics;
import Excel.Read_data;
 
public class order {
	
	WebDriver driver;
	Generics gen ;
	Read_data rd = new Read_data();

	
	
	@FindBy(id="user-name") WebElement username;
	@FindBy(id="password") WebElement password;
	@FindBy(id="login-button") WebElement login;
	@FindBy(name="add-to-cart-sauce-labs-onesie") WebElement product1 ;
	@FindBy(name="add-to-cart-sauce-labs-bike-light") WebElement product2 ;
	@FindBy(className="shopping_cart_link") WebElement carticon;
	@FindBy(css=".inventory_item_price")
	public List<WebElement> price;
	@FindBy(id="checkout") WebElement checkout;
	@FindBy(id="first-name") WebElement firstname;
	@FindBy(id="last-name") WebElement lastname;
	@FindBy(id="postal-code") WebElement zipcode;
	@FindBy(name="continue") WebElement continueshop;
	@FindBy(xpath="//button[text()='Finish']") WebElement finish;
	@FindBy(id="back-to-products") WebElement backtohome;
	
	
	
	
	public order(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		gen = new Generics(driver);
		  gen.ImplicitWait();
	}
	
	//method to enter UserName
	public void Username() throws InterruptedException, IOException {
		gen.sendkeysAction(username,rd.Uname());
	}
	
	//method to enter password
	public void Password() throws InterruptedException, IOException {
		gen.sendkeysAction(password,rd.Password());
	}
	
	//method to click login
	public void Login() throws InterruptedException { 
		gen.clickAction(login);
	} 
	
	//method to add multiple products
	public void addcart() throws InterruptedException {
		gen.clickAction(product1);
		gen.clickAction(product2);
	}
	
	//method to click icon
		public void Carticon() throws InterruptedException {
		gen.clickAction(carticon);
		}
		
	//method to click checkout
		public void Checkout() throws InterruptedException {
		gen.clickAction(checkout);
		}
		
	//method to enter FirstName	
	public void Firstname() throws InterruptedException, IOException {
		gen.sendkeysAction(firstname,rd.FirstName());
		}
	
	//method to enter LastName
	public void Lastname() throws InterruptedException, IOException {
		gen.sendkeysAction(lastname,rd.LastName());
		}
	
	//method to enter PostelCode
	public void postalcode() throws InterruptedException, IOException {
		gen.sendkeysAction(zipcode,String.valueOf(rd.ZipCode()));
		}
	
	//method to click continue
	public void Continue() throws InterruptedException {
		gen.clickAction(continueshop);
		}
	
	//method to click finish
	public void Finishbutton() throws InterruptedException {
		gen.clickAction(finish);
		}
	
	//method to click back to home
	public void backhome() {
		gen.clickAction(backtohome);
	}
}