package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreatModel extends BaseModel{

	public CreatModel(WebDriver d) {
		super(d);
		// TODO Auto-generated constructor stub
	}
	public WebElement getFirstName() throws InterruptedException {
		Thread.sleep(3000);
		WebElement e = driver.findElement(By.xpath("//input[@name='firstname']"));
		return e;
	}
	
	public WebElement getLastName() {
		WebElement h = driver.findElement(By.xpath("//input[@name='lastname']"));		
		return h;

	}
	
	public WebElement getEmail() {
		WebElement f = driver.findElement(By.xpath("//input[@name='reg_email__']"));		
		return f;
	}
	
	public WebElement getEmailConfirm() { 
		WebElement d = driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));		
		return d;
	}
	
	public WebElement getPass() {
		WebElement o = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));		
		return o;
	}
	
	public WebElement getMonth() {
		WebElement month = driver.findElement(By.xpath("//*[@id=\"month\"]"));		
		return month;
	}
	
	public WebElement getDay() {
		WebElement day = driver.findElement(By.xpath("//*[@id=\"day\"]"));		
		return day;
	}
	
	public WebElement getYear() {
		WebElement year = driver.findElement(By.xpath("//*[@id=\"year\"]"));		
		return year; 
	}
	
	public WebElement getGender( String gen) {
		WebElement gender = driver.findElement(By.xpath("//label[text()='" +gen+"']/following-sibling::input"));		
		return gender;
		
	}
	public WebElement grab() {
		WebElement button = driver.findElement(By.xpath("//button[@name='websubmit']"));			
		return button;

	}
}


		


