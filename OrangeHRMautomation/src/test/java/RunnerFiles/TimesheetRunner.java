package RunnerFiles;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features={"C:\\Users\\NARMAE\\eclipse-workspace\\OrangeHRMautomation\\src\\test\\java\\featureFiles\\Timesheet.feature"},
glue={"stepDefinitionFiles"},
plugin = {"pretty" , "html:target/time_report.html","io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"})

public class TimesheetRunner {

}
