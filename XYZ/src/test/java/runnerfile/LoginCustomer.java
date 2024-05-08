package runnerfile;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features={"../XYZ/src/test/java/featuefile/Loginpage.feature"}
		,glue= {"stepdefinition"}//,plugin = {"pretty" , "html:target/LoginCustomer_report.html","io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"}
		)


public class LoginCustomer {

}
