package com.cg.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownforAdditems {
	public static void main (String[]args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	//driver.get("https://www.spicejet.com/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//div[text()='1 Adult']")).click();
	Thread.sleep(2000);
	//driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();
	//driver.findElement(By.xpath("//input[@value='Done']")).click();
	int i=1;
	/*while(i<5)
	{
		driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();
		i++;
	}*/
	//System.out.println(driver.findElement(By.xpath("//div[text()='1 Adult']")).getText());
	for(i=0;i<7;i++)
	{
		driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();
	}	
	
		driver.findElement(By.xpath("//input[@value='Done']")).click();
		
		//System.out.println(driver.findElement(By.xpath("//div[text()='1 Adult']")).getText());
	
	
}
}
