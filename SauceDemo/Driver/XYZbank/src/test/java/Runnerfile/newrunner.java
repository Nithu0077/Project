package Runnerfile;



import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features={"/XYZbank/src/test/java/featurefile/newcustomer.feature"},
glue={"stepdefinition"},
plugin = {"pretty"} //, "html:target/login_report.html",}
)

public class newrunner {

}
