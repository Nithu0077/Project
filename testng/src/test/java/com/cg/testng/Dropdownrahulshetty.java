package com.cg.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownrahulshetty {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		WebElement dropdown=driver.findElement(By.xpath("//select[contains(@name,'Currency')]"));
		Select dropdowntext=new Select(dropdown);
		dropdowntext.selectByIndex(1);
		System.out.println(dropdowntext.getFirstSelectedOption().getText());
		dropdowntext.selectByVisibleText("AED");
		System.out.println(dropdowntext.getFirstSelectedOption().getText());
		dropdowntext.selectByValue("USD");
		System.out.println(dropdowntext.getFirstSelectedOption().getText());
		
		
		

	}

}
