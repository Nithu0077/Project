package Util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class GenericXYZ {
	
	WebDriver driver;
	public GenericXYZ(WebDriver driver) {
		 this.driver=driver;
	}
		  
	
	public void sendKeys(WebElement elements,String text) {
		elements.sendKeys(text);
	}
	public void Click(WebElement element) {
		element.click();
	}
	public void dropdown(WebElement Element ){
		Select sel=new Select(Element);
		
	}
	

}
