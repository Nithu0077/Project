package com.cg.testng;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Handlingloginpopup {

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.navigate().to(" https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();	
		driver.findElement(By.xpath("//a[@href='/basic_auth']")).click();
		Robot robot = new Robot();
		//			StringSelection username = new StringSelection("admin");
		String username = "admin";
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(username, null);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.delay(2000);
		robot.keyPress(KeyEvent.VK_V);
		robot.delay(2000);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		robot.delay(2000);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.delay(2000);
		robot.keyRelease(KeyEvent.VK_TAB);
		//			StringSelection password = new StringSelection("admin");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(username, null);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.delay(2000);
		robot.keyPress(KeyEvent.VK_V);
		robot.delay(2000);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		robot.delay(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.delay(2000);
		robot.keyRelease(KeyEvent.VK_ENTER);

	}

}


