package Runnerfile;
import org.junit.runner.RunWith;



import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
 
@RunWith(Cucumber.class)
@CucumberOptions(
		features={"src\\test\\java\\Featurefile\\login.feature"}
		,glue= {"stepdefinition"}
		,plugin = {"pretty" , "html:target/Login_report.html","io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"}
		)

public class Login {

}
