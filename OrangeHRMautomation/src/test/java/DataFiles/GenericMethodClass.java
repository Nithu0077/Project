package DataFiles;import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;


public class GenericMethodClass {

    WebDriver driver;
    WebDriverWait wait;
	Robot robot;
	excel ex = new excel();
	FluentWait<WebDriver>flu_wait;

//  Constructor for initializing driver and driver elements
    public GenericMethodClass(WebDriver driver){
        this.driver = driver;
        wait  = new WebDriverWait(driver, Duration.ofSeconds(30));
    }
    
//  Method for getting OrangeHRM website url     
    public void PreConditions() {
    	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
    }
  

//  Method to click on an element
    public void clickWebElement(WebElement element) {
        element.click();
    }

    
// Method to sendKeys
    public void sendInput(WebElement InputField, String Input) {
    	InputField.sendKeys(Input);
    }

    
//  Method to use Implicit wait
    public void ImplicitWait() {
    	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
    }

    
    // Method to validate
    public void ValidateElementVisible(List<WebElement> element,String text) throws IOException {
    	for(WebElement ele : element) {
			if(ele.getText().equals(text)) {
				System.out.println(""+ text +" is Added and visible under Records");
			}
		}
    }
    
 // Method to Use down and enter robot keys
    public void RobotKey_DownEnter() throws AWTException{
    	robot = new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);

    }
    
    
//  Method to validate expected and actual text
    public void ValidatePopupMsg(WebElement popup,String expextedTitle) {
		Assert.assertEquals(popup.getText(),expextedTitle);
	}


// Method to use explicit wait 
	public void visibilityCheck(WebElement records) {
		wait.until(ExpectedConditions.visibilityOf(records));
		
	}


//  Method to Use robot keys for select text and to clear
	public void roboDelete() throws AWTException {
		robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_A);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_A);
		robot.keyPress(KeyEvent.VK_BACK_SPACE);
		
	}
	
//	Method to use different data when it shows already exist
	public String searchTitle(List<WebElement> titles, String text) throws IOException {
		int i=1;
		for(WebElement ele : titles) {
			if(ele.getText().equals(text)) {
				i++;
				text=ex.JobData(i, 2);
			}
		}
		System.out.println(text);
		return text;
	}
	
	
	
}
