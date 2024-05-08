package com.cg.testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Empty {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
	//	driver.get("https://www.saucedemo.com/");
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.cssSelector("#user-name"));
		driver.findElement(By.xpath("//input[@placeholder='Password']"));
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		String actual=driver.findElement(By.xpath("//div[starts-with(@class,'error')]")).getText();
		System.out.println(actual);
		String Expected="Epic sadface: Username is required";
		System.out.println(Expected);
		Assert.assertEquals(actual, Expected);
		System.out.println("*******");

	}

}
