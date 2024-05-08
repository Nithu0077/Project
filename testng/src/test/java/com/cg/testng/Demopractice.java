package com.cg.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Demopractice {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Nithya");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("P");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='mr-sm-2 form-control']")).sendKeys("ABC@gmail.com");
		Thread.sleep(2000);
		Actions account=new Actions(driver);
		WebElement gender=driver.findElement(By.xpath("//label[text()='Female']"));
		account.moveToElement(gender).click().build().perform();
		Thread.sleep(2000);
		WebElement Element= driver.findElement(By.xpath("//input[@placeholder='Mobile Number']"));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)",Element);
		Element.sendKeys("0123456789");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='dateOfBirthInput']")).click();
		//WebElement month=driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"));
		//Select sec=new Select(month);
		//sec.selectByValue("9");
		//JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("arguments[0].scrollIntoView(true)");
		//driver.findElement(By.xpath("//input[@id='hobbies-checkbox-1']"));
		
		
	}

}
//input[@id='hobbies-checkbox-1']---sports
//div[@id='state']----for dropdown click
//textarea[@id='currentAddress']----for current address
//button[@type='submit']---dropdown



