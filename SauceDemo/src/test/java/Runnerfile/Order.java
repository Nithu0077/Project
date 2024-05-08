package Runnerfile;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features={"src\\test\\java\\Featurefile\\order.feature"}
		,glue= {"stepdefinition"},plugin = {"pretty" , "html:target/Order_report.html","io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"}
		)

public class Order {

	

}

