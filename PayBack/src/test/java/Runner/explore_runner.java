package Runner;

import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\NP16\\eclipse-workspace\\PayBack\\src\\test\\java\\explore\\explore.feature",glue="Step_definition",plugin= {"pretty","html:target/Reports.html"},monochrome=true)
public class explore_runner {

}
