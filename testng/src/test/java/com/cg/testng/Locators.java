package com.cg.testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Locators {

	public static void main(String[] args) throws InterruptedException  {
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		//wait.until(ExpectedConditions.visibilityOf(null))
		driver.findElement(By.id("inputUsername")).sendKeys("Nithya");
		driver.findElement(By.name("inputPassword")).sendKeys("Rose");
		driver.findElement(By.className("signInBtn")).click();
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		WebElement var=driver.findElement(By.cssSelector("p.error"));
		//wait.until(ExpectedConditions.visibilityOf(var));
		//wait.until(ExpectedConditions.)
		//System.out.println(var.getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);//move one page to another
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Rose");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("Nit@gmail.com");
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("Nithya@gmail.com");
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("7766559900");
		driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("Nithi");
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		
	}

}
