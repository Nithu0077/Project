package pagefactory;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Excel.Generics;
import Excel.Read_data;

public class reset {
	WebDriver driver;
	Generics gen ;
	Read_data rd = new Read_data();
	@FindBy(id="user-name") WebElement username;
	@FindBy(id="password") WebElement password;
	@FindBy(id="login-button") WebElement login;
	@FindBy(id="add-to-cart-test.allthethings()-t-shirt-(red)") WebElement item1;
	@FindBy(id="add-to-cart-sauce-labs-onesie") WebElement item2;
	@FindBy(css="div.inventory_item_name")
	public List<WebElement> price;
	@FindBy(xpath="//button[text()='Open Menu']") WebElement openmenu;
	@FindBy(xpath="//a[text()='Reset App State']") WebElement reset;
	@FindBy(xpath="//a[text()='Logout']") WebElement signout;
	
	
	
	
	public reset(WebDriver driver) {
		  this.driver=driver;

		  PageFactory.initElements(driver,this);
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
	  public void Login() throws InterruptedException  {
		  gen.clickAction(login);

	  }
	  //method to add multiple product
		  public void addcart() throws InterruptedException {
			  gen.clickAction(item1);
			  gen.clickAction(item2);
		  }
		  
	 //method to click Menu&Reset
		  
		  public void Reset() throws InterruptedException {
		  gen.clickAction(openmenu);
		  gen.clickAction(reset);
		 
		}
		  
	//method to Logout 	  
		  public void logout() {
			  gen.clickAction(signout);
			
	  }
	

}
