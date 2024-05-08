package Excel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Generics {
	
	WebDriver driver;  
	
//constructor initializing driver
	public Generics(WebDriver driver) {
		this.driver=driver;
	}
	
//  Method to use Implicit wait
    public void ImplicitWait() {
    	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    }
 //Method to use SendKeys   
    public void sendkeysAction( WebElement username,String text) {
        username.sendKeys(text);
    }
    //method to use click method
    public void clickAction(WebElement element) {
        element.click();
    }
    //method to use assert
    public void Assertequals(WebElement element, String ExpectedText) {
    	Assert.assertEquals(ExpectedText,element.getText());
	}
    
	public void Asserttrue(WebElement element) {
		Assert.assertEquals(true, element.isDisplayed());
	}


}
