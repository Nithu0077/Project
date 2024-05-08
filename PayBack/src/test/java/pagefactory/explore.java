package pagefactory;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class explore
{
	WebDriver driver;
	
	@FindBy(how=How.XPATH,using="//ul[@class='nav navbar-nav pb-main-menu']/li[4]")
	WebElement Explore;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"myNavbar\"]/ul[2]/li[1]/ul/li[4]/a")
	WebElement voucher;
	
	@FindBy(how=How.XPATH,using="//*[@id=\\\"__next\\\"]/section[3]/div/div[2]/div[1]/div/div/div/div[5]/div/div/p[2]/label")
	WebElement label;
	
	@FindBy(how=How.XPATH,using="//*[@id=\\\"__next\\\"]/section[3]/div/div[2]/div[1]/div/div/div/div[2]/button[1]")
	WebElement button;
	
	@FindBy(how=How.XPATH,using="//*[@id=\\\"__next\\\"]/section[3]/div/div[2]/div[3]/div/div[1]/div[1]/div/div[1]/div/img")
	WebElement img;
	
	By pg = By.xpath("//*[@id=\\\"product_crousel\\\"]/a[1]");
	
	@FindBy(how = How.LINK_TEXT, using=("Add to cart"))
	WebElement cart;
	
	public explore(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void homepage() {
		System.setProperty("swebdriver.chrome.driver","‪C:\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.payback.in/");
		driver.manage().window().maximize();
	}
	public void explore() {
		Actions actions = new Actions(driver);
		actions.moveToElement(Explore).build().perform();
	}
	public void ins_vouc() {
		Actions actions = new Actions(driver);
		String newWindow=driver.getWindowHandle();
		actions.moveToElement(voucher).click().build().perform();
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL+"t");
	    driver.get("https://www.gyftr.com/payback?token=TEMPXYZ786&utm_source=undefined");
	}
	public void check() {
		label.click();
	}
	public void apply() {
		button.click();
	}
	public void product() {
		img.click();
	}
	public void pro_page() {
		driver.findElement(pg).isDisplayed();
		cart.click();
	}
	
	
	
	
	
	

}
