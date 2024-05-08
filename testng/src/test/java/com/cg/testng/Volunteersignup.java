package com.cg.testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Volunteersignup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://fs2.formsite.com/meherpavan/form2/index.html?1537702596407");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//input[@id='RESULT_TextField-1']")).sendKeys("Nithya");
		driver.findElement(By.cssSelector("input#RESULT_TextField-2")).sendKeys("Rose");
		WebElement web=driver.findElement(By.xpath("//label[text()='Phone']"));
		//WebElement web=driver.findElement(By.xpath("//label[starts-with(@id,'q9_label')]"));
		//WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		//wait.until(ExpectedConditions.elementToBeClickable(web));
		//web.sendKeys("7488789765");
		driver.findElement(By.xpath("//input[@id='RESULT_TextField-3']")).sendKeys("9876543290");
		driver.findElement(By.xpath("//input[@name='RESULT_TextField-4']")).sendKeys("India");
		driver.findElement(By.xpath("//input[contains(@name,'5')]")).sendKeys("Chennai");
		driver.findElement(By.cssSelector("input[name='RESULT_TextField-6']")).sendKeys("ABC@gmail.com");
		Actions action=new Actions(driver);
		WebElement vol=driver.findElement(By.xpath("//input[@id='RESULT_RadioButton-7_1']"));
		action.moveToElement(vol).click().build().perform();
		//WebElement wel=driver.findElement(By.xpath("//input[@id='RESULT_CheckBox-8_1']"));
		//WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		//wait.until(ExpectedConditions.elementToBeClickable(wel));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement val=driver.findElement(By.xpath("//select[@id='RESULT_RadioButton-9']"));
		js.executeScript("arguments[0].scrollIntoView(true);",val);
		val.click();
		//driver.findElement(By.xpath("//input[@type='file']")).click();
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
	}

}
