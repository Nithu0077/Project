package stepDefinitionFiles;
import java.awt.AWTException;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import PageFactoryFiles.JobdropdownPF;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Jobdropdown {
    
	//WebDriver driver=new ChromeDriver();
	//WebDriver driver=new FirefoxDriver();
	WebDriver driver=new EdgeDriver();;
	JobdropdownPF JPF;
	String text;
	@Given("Get login to OrangeHRM in a browser")
	public void login() throws InterruptedException, IOException, AWTException {
		JPF = new JobdropdownPF(driver);
		JPF.Login();
  
	}

	@When("user get navigate to Admin tile")
	public void admin_tile() throws InterruptedException {
		JPF.AdminTile();
	}

	@When("click job dropdown and select job titles")
	public void job_titles() throws InterruptedException, IOException {
		JPF.Jobdd();
		
	}

	@When("click +Add button")
	public void click_add_button() {
	    JPF.addBtn();
	}

	@When("click and enter values in text fields at add job titles page")
	public void add_job_titles() throws InterruptedException, IOException {
	    JPF.jobDetails();
	}

	@When("Click on Browse button under Job Specification and Select file from system Click on Open\\/apply")
	public void browse_file() throws InterruptedException, AWTException, IOException {
	    JPF.browseFile();
	}

	@When("click save button")
	public void click_save_button() throws InterruptedException {
	    JPF.saveJob();
	    JPF.Popup1();
	}

	@When("Navigate back to job dropdown and select Pay Grades")
	public void pay_grades() throws IOException, InterruptedException {
	   JPF.PayGrades();

	}

	@When("click Navigate back to job dropdown and select Employement status")
	public void employement_status() throws IOException {
	    JPF.EmpStatus();

	}

	@When("Navigate back to job dropdown and select Job categories")
	public void job_categories() throws InterruptedException, IOException {
	   JPF.jobCategories();

	}

	@When("Navigate back to job dropdown and select Work Shifts")
	public void work_shifts() throws InterruptedException, IOException, AWTException {
		JPF.Workshifts();

	}

	@When("check new work shift added is visible under Records found")
	public void check_visiblity() throws InterruptedException, IOException {
		JPF.CheckVisibility();
	}

	@When("Click on Delete icon")
	public void click_delete_icon() throws InterruptedException {
		JPF.clickTrash();
	}

	@Then("Click on Yes Delete button on pop-up window")
	public void pop_up_window() {
	    JPF.YesDelete();
	    JPF.Popup2();
	    driver.quit();
	}


}
