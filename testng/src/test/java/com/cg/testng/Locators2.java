package com.cg.testng;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class Locators2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String password=getpassword(driver);
		System.out.println(password);
		
		String name="Nithya";//declaring string
		driver.findElement(By.xpath("//button[@class='go-to-login-btn']")).click();
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys(name);//call that string
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys(password);//
		//driver.findElement(By.id("chkboxOne")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		Thread.sleep(1000);
		//String actual=driver.findElement(By.cssSelector("p[style*='color']")).getText();
		//System.out.println(actual);
		//String Expected ="You are successfully logged in.";
        String actual= driver.findElement(By.xpath("//div[@class='login-container']/child::h2")).getText();
		String expected="Hello "+name+",";
		System.out.println(expected);
		System.out.println(actual);
		Assert.assertEquals(actual, expected);
		driver.findElement(By.xpath("//*[text()='Log Out']")).click();//tagname is button instead of using *
		driver.quit();
	
		

	}
	public static String getpassword(WebDriver driver) throws InterruptedException
	{
	
	driver.findElement(By.linkText("Forgot your password?")).click();
	Thread.sleep(1000);
	driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
	String str=driver.findElement(By.cssSelector("form p")).getText();//store it in the String
	String[] vol=str.split("'");//split the text 
	System.out.println(vol[1]);
	String pass=vol[1];
	return pass;
	
	

}
}
