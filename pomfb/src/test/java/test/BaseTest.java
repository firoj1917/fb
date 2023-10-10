package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class BaseTest {
	
	static WebDriver driver;
	
	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver","/Users/firoj/Downloads/chromedriver");
	    driver = new ChromeDriver();
	    driver.get("https://www.facebook.com/");
	}
	
 
}
