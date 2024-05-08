package pagefactory;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Excel.Generics;
import Excel.Read_data;

public class remove {
	WebDriver driver;
	Generics gen ;
	Read_data rd = new Read_data();
	@FindBy(id="user-name") WebElement username;

	@FindBy(name="password") WebElement password;

	@FindBy(className="btn_action") WebElement Login;
	@FindBy(id="add-to-cart-sauce-labs-bolt-t-shirt")WebElement product3;
	@FindBy(name="add-to-cart-sauce-labs-backpack")WebElement product1;
	@FindBy(id="shopping_cart_container")WebElement carticon;
	
	@FindBy(name="remove-sauce-labs-backpack")WebElement delete;
	public remove(WebDriver driver) {
		  this.driver=driver;

		  PageFactory.initElements(driver,this);
		  gen = new Generics(driver);
		  gen.ImplicitWait();
		
	}

	
//method to enter UserName
	 public void Username() throws IOException {
		   gen.sendkeysAction(username,rd.Uname());

	}
	 
//method to enter password	 
	  public void Password() throws IOException {
		  gen.sendkeysAction(password,rd.Password());

	}
//method to click login	  
	  public void Login()  {
		  gen.clickAction(Login);

//method to click product 3		
	 }
	  public void Product3 () {
		  gen.clickAction(product3);
	  }
			  
//method to click product 1			
	  public void Product1() {
		  gen.clickAction(product1);
		
	}
	  
//method to click icon	  
	  public void Carticon() {
		  gen.clickAction(carticon);
		
	}
	  
//method to click remove	  
	  public void Remove() {
		  gen.clickAction(delete);
		
	}	  
	

}
