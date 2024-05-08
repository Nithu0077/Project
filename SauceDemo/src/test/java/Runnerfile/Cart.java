package Runnerfile;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features={"src\\test\\java\\Featurefile\\cart.feature"}
		,glue= {"stepdefinition"}//,plugin = {"pretty" , "html:target/Cart_report.html","io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"}
		)

public class Cart {

	

	}



