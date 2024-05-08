package stepDefinitionFiles;
import java.awt.AWTException;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import DataFiles.GenericMethodClass;
import PageFactoryFiles.HRMloginPF;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HRMlogin {

	//WebDriver driver=new ChromeDriver();
	//WebDriver driver=new FirefoxDriver();
	WebDriver driver=new EdgeDriver();
	HRMloginPF log;
	GenericMethodClass Genric;
	
	


		@Given("login with valid credentials to OrangeHRM in a browser")
		public void login() throws InterruptedException, AWTException {
			log = new HRMloginPF(driver);
            log.precondition();

		}

		@When("click login button and navigate to the dashboard")
		public void dashboard() throws InterruptedException, IOException {
			log.Login();

		}

		@When("navigate to Admin tile and add a new user")
		public void add_a_new_user() throws AWTException,IOException,InterruptedException {
			log.ClickAdminLink();
			log.CheckUsername();
			log.AddingNewUser();
			log.Popup();
		}

		@When("Enter username in username field to search created user")
		public void search_created_user() throws IOException, InterruptedException {
			log.Addeduser();

		}

		@Then("navigate to user profile and get logout")
		public void logout() throws InterruptedException {
		    log.Logout();

		    driver.quit();
		}



}
