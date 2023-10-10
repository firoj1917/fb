package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeModel extends BaseModel{

	public HomeModel(WebDriver d) {
		super(d);
		
	
		
		// WebElement first	= driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
	}
	public WebElement gcab () {
		 WebElement first	= driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		return first;
	}
	
   
	
	 

}
