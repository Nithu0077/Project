package com.cg.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowActivities {
	public static void main(String[]args) {
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
	driver.navigate().back();
	driver.navigate().forward();

}
}
