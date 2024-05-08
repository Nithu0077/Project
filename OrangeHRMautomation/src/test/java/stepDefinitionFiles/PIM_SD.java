package stepDefinitionFiles;
import java.awt.AWTException;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import PageFactoryFiles.PIM_PF;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PIM_SD {

	//WebDriver driver=new ChromeDriver();
	//WebDriver driver=new FirefoxDriver();
	WebDriver driver=new EdgeDriver();
	PIM_PF PPF;

	@Given("login to OrangeHRM in a browser")
	public void login() throws InterruptedException, IOException, AWTException {
		PPF = new PIM_PF(driver);
		PPF.Login();

	}

	@When("user navigate to PIM tile")
	public void navigate_to_pim_tile() throws IOException, InterruptedException {
	    PPF.pimLink();
	}

	@When("click on Employee List")
	public void click_on_employee_list() {
	    PPF.empList();
	}

	@When("click on +Add button and enter values in text fields")
	public void employeeDetails() throws IOException {
	    PPF.EmpDetails();
	    PPF.Popup1();
	}

	@When("Under Personal Information click on Nick name text field Enter text")
	public void emp_personal_information() throws IOException {
		PPF.personelDetails();
	}

	@When("Click on Nationality dropdown button Select value as Japanese")
	public void nationality_dropdown() throws InterruptedException {
	    PPF.nationality();
	}

	@When("Click on Marital Status dropdown select value as Single")
	public void marital_status_dropdown() throws AWTException {
	    PPF.marital();
	}

	@When("Click on Date of Birth date")
	public void date_of_birth() throws IOException {
	    PPF.dob();
	}

	@When("Click on Female radio button Click on Save button")
	public void female_radio_button() {
		PPF.gender();
		PPF.Popup2();
	}

	@When("Navigate and click on Employee List tile and enter emplyee name to search user")
	public void search_user() throws IOException, InterruptedException, AWTException {
		PPF.searchEmp();
        PPF.Take_Screenshot();
	}

	@When("Click on Reset button")
	public void click_on_reset_button() throws InterruptedException {
		PPF.clickReset();
	}

	@When("Under Recods found click on 2nd check box")
	public void under_recods_found_click_on_2nd_check_box() {
	    PPF.checkBx();
	}

	@When("Clcik on Delete Selected button")
	public void clcik_on_delete_selected_button() {
		   PPF.deleteSelected();
	   	}

	@When("Click on No,Cancel button")
	public void click_on_no_cancel_button() throws InterruptedException {
		PPF.noCancel();

	}

	@Then("Clcik on Reset button")
	public void clcik_on_reset_button() throws InterruptedException {
		PPF.clickReset();
		driver.quit();
	}

}
