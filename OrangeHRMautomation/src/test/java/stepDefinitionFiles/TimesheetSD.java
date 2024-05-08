package stepDefinitionFiles;
import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import PageFactoryFiles.TimesheetPF;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
 
public class TimesheetSD {
	
	//WebDriver driver=new ChromeDriver();
	//WebDriver driver=new FirefoxDriver();
	WebDriver driver=new EdgeDriver();
	TimesheetPF TPF;
	
	
	@Given("login in OrangeHRM with valid credentials")
	public void login_in_orange_hrm_with_valid_credentials() throws InterruptedException, AWTException {
		TPF = new TimesheetPF(driver);
        TPF.precondition();
		}
 
	@When("click login button and  get redirect to the dashboard")
	public void click_login_button_and_get_redirect_to_the_dashboard() throws InterruptedException, IOException {
		TPF.Login();
	}
 
	@When("navigate to Time tile and click on Timesheets")
	public void navigate_to_time_tile_and_click_on_timesheets() throws InterruptedException {
		TPF.timeTile();
	}
 
	@When("Enter Paul Collings in emplyee name and click on View button")
	public void enter_paul_collings_in_emplyee_name_and_click_on_view_button() throws InterruptedException, AWTException, IOException {
	    TPF.veiwEmployee();
	}
 
	@When("click edit button")
	public void click_edit_button() throws InterruptedException {
	    TPF.clickEdit();
	}
 
	@When("Enter Apache Software Foundation ASF Phase text in Project text field")
	public void enter_apache_software_foundation_asf_phase_text_in_project_text_field() throws InterruptedException, AWTException, IOException {
	    TPF.Projectdetails();
	}
 
	@When("Click on Activity dropdown and select Implementation")
	public void click_on_activity_dropdown_and_select_implementation() throws InterruptedException, AWTException {
	    TPF.Activitydrop();
	}
 
	@When("Enter text in all the date text fields")
	public void enter_text_in_all_the_date_text_fields() throws InterruptedException, IOException {
	    TPF.dates();
	}
 
	@Then("Click on Save button")
	public void click_on_save_button() throws InterruptedException {
		TPF.Save();
		driver.quit();
	}
 
}