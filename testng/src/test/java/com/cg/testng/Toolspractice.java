package com.cg.testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Toolspractice {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		JavascriptExecutor je=(JavascriptExecutor)driver;
		WebElement web=driver.findElement(By.xpath("//div[@class='col-md-4 col-sm-12'][1]"));
		je.executeScript("arguments[0].scrollIntoView(true);",web);
		web.click();
		
	
		
		

	}

}
