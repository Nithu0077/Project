package PageFactoryFiles;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class AddtocartPF {
	
	  WebDriver driver;
	 @FindBy(id="user-name") WebElement username;
	 @FindBy(id="password") WebElement password;
	 @FindBy(id="login-button") WebElement logbtn;
	 @FindBy(xpath="//div[text()='Test.allTheThings() T-Shirt (Red)']") WebElement prod;
	 @FindBy(xpath="//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']") WebElement addtocartBtn; 
	 @FindBy(css="a[class*='shopping']") WebElement cartIcon;
	 @FindBy(xpath="//div[text()='Test.allTheThings() T-Shirt (Red)']") WebElement prodName;

	public AddtocartPF(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
		
	}
	public void precondition() {
		driver.get("https://www.saucedemo.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public void url() {
		username.sendKeys("standard_user");
		password.sendKeys("secret_sauce");
		
	}
	public void login() {
		logbtn.click();
	}
	public void addCart() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		addtocartBtn.click();
		js.executeScript("window.scrollBy(0,-500)");
		cartIcon.click();
		
	}
	public void validateCart() {
		String Actual = prodName.getText();
		System.out.println(Actual);
		String expected = "Test.allTheThings() T-Shirt (Red)";
		Assert.assertEquals(Actual, expected);
		System.out.println(" selected Item is present in the cart and the title of the product is same as in the home page");
		
	}
	

}
