package Package;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Xyzweb {

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//button[text()='Customer Login']")).click();
		//driver.findElement(By.xpath("//select[@id='userSelect']")).sendKeys("NITHYA P");
		 WebElement web=driver.findElement(By.xpath("//select[@id='userSelect']"));
		 Select sec=new Select(web);
		 sec.selectByVisibleText("Harry Potter");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		driver.findElement(By.xpath("//button[@ng-class='btnClass2']")).click();
		String previousbalance=driver.findElement(By.xpath("//strong[text()='0']")).getText();
		System.out.println(previousbalance);
		int depositeAmt = 7000;
		driver.findElement(By.xpath("//input[@placeholder='amount']")).sendKeys(String.valueOf(depositeAmt));
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		String Afterbalance=driver.findElement(By.xpath("//strong[text()='7000']")).getText();
		System.out.println(Afterbalance);
		int Expectedbalance=Integer.parseInt(previousbalance)+depositeAmt;
		Assert.assertEquals(Expectedbalance,Integer.parseInt(Afterbalance));
		String text=driver.findElement(By.xpath("//span[text()='Deposit Successful']")).getText();
		System.out.println(text);
		driver.findElement(By.xpath("//button[@ng-class='btnClass3']")).click();
		int withdrawAmt = 200;
		driver.findElement(By.xpath("//input[@type='number']")).sendKeys("1000");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		String actual = driver.findElement(By.xpath("//span[text()='Transaction successful']")).getText();
		System.out.println(actual);
		String expected = "Transaction successful";
		Assert.assertEquals(actual, expected);
		
	}

	
}
