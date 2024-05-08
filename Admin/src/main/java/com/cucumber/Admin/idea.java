package com.cucumber.Admin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class idea {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\New drivers\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://apacworld.in.capgemini.com:9090/APACWorld/#/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@aria-describedby='useridHelp']")).sendKeys("kdevika");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Welcome@22");
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/app-root/app-home/div[1]/mat-card/div/div[2]/ng-scrollbar/div/div/div/div/div/div[3]/div/mat-card-title")).click();
		//driver.findElement(By.xpath("/html/body/app-root/p/app-landing-page/app-nav-landing/nav[2]/div/button[1]/span[1]/span")).click();
		driver.findElement(By.xpath("//*[text()='View Dashboard']")).click();
		
	
	}
}
