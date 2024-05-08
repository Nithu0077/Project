package com.cg.testng;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Authenticationpopup {

	public static void main(String[] args) throws AWTException {
		WebDriver driver=new EdgeDriver();
		driver.get("https://admin:admin@the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[text()='Basic Auth']")).click();
		Robot robot=new Robot();
		StringSelection username = new StringSelection("admin");
		
		
		
		
		
		
	}

}