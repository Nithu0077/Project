package stepDefinitionFiles;
import java.awt.AWTException;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import PageFactoryFiles.LeavePf;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LeaveSD {
    
	//WebDriver driver=new ChromeDriver();
	//WebDriver driver=new FirefoxDriver();
	WebDriver driver=new EdgeDriver();
	LeavePf LPF;
	@Given("do login in OrangeHRM with in a browser")
	public void login() throws InterruptedException, AWTException {
		LPF = new LeavePf(driver);
		LPF.precondition();
	}

	@When("click on login button and  get navigate to the dashboard")
	public void dashboard() throws InterruptedException, IOException {
		LPF.Login();

	}

	@When("navigate to Leave tile and click on Assign leave")
	public void leave_tile() throws InterruptedException {
	    LPF.AssignLeave();
	}

	@When("Enter inputs in text fields click Assign button")
	public void assign_leave() throws InterruptedException, AWTException, IOException {
	    LPF.leaveDetails();
	}

	@Then("Click on Ok button on pop-up")
	public void click_on_ok_button_on_pop_up() throws InterruptedException {
	    LPF.popUp();
	    driver.quit();
	}

}
