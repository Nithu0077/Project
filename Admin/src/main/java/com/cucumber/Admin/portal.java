package com.cucumber.Admin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class portal {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\New drivers\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://ideaapac.in.capgemini.com:9090/ideaapac/#/app_admin_dashboard");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/app-root/p/app-admin-dashboard/div/app-admin-rights/div/div/mat-drawer-container/mat-drawer-content/div[2]/button")).click();
		Thread.sleep(3000);

	    driver.findElement(By.xpath("//input[@id='radio2']")).click();
	    
	  // Thread.sleep(1000);
	    driver.findElement(By.xpath("//input[@id='radio3']")).click();	
	
	
	}
}