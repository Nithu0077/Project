package com.cg.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class Rahulshettyacademy {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='inputUsername']")).sendKeys("Nithya");
		driver.findElement(By.xpath("//input[@name='inputPassword']")).sendKeys("Anitha");
		driver.findElement(By.xpath("//button[@class='submit signInBtn']")).click();
		Thread.sleep(1000);
		//WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(10));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class='error']")));
		System.out.println(driver.findElement(By.xpath("//p[@class='error']")).getText());
		

	}

}
