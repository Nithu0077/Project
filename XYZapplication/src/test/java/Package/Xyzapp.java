package Package;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class Xyzapp {
	public static void main (String[] args) throws IOException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
	driver.manage().window().maximize();
    Excel exe=new Excel();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.xpath("//button[text()='Bank Manager Login']")).click();
	driver.findElement(By.xpath("//button[@ng-class='btnClass1']")).click();
	driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys(exe.Firstname());
	driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(exe.Lastname());
	driver.findElement(By.xpath("//input[@placeholder='Post Code']")).sendKeys(exe.Pincode());
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	String value =driver.switchTo().alert().getText();
	System.out.println(value);
	driver.switchTo().alert().accept();
	driver.findElement(By.xpath("//button[@ng-class='btnClass2']")).click();
	driver.findElement(By.xpath("//select[@name='userSelect']")).sendKeys("Nithya P");
	driver.findElement(By.xpath("//select[@name='currency']")).sendKeys("Doller");
	driver.findElement(By.xpath("//button[text()='Process']")).click();
	String value1=driver.switchTo().alert().getText();
	System.out.println(value1);
	driver.switchTo().alert().accept();
	driver.findElement(By.xpath("//button[@ng-class='btnClass3']")).click();
	driver.findElement(By.xpath("//input[@placeholder='Search Customer']")).click();
	
	
	

}
}
