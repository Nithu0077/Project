package com.cg.testng;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    driver.findElement(By.xpath("//input[@class='ddInput nonSearched']")).click();
		
		List<WebElement> list=driver.findElements(By.xpath("//ul[@class='dropdown ']/li"));
		
		/*for(WebElement ele:list)
		{
		 	//System.out.println(ele.getText());
			if(ele.getText().equalsIgnoreCase("3 years"))
			{
				ele.click();
				break;
			}*/
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i).getText().equalsIgnoreCase("3 years"))
			{
				System.out.println(list.get(i).getText());
				list.get(i).click();
				break;
	
			}
		}
	}

}
