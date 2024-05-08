package com.cg.testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class Invalid {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.cssSelector("#user-name")).sendKeys("Nithi");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Rose");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		String actual=driver.findElement(By.xpath("//h3[@data-test='error']")).getText();
		System.out.println(actual);
		String Expected="Epic sadface: Username and password do not match any user in this service";
		Assert.assertEquals(Expected, actual);
		System.out.println("%%%%%%%%%%%");

	}
}
