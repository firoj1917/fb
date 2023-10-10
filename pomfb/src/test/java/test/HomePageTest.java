package test;

import org.testng.annotations.Test;

import page.HomePage;

public class HomePageTest extends BaseTest {
	
  @Test
  public void hometest () {
	  HomePage h = new HomePage (driver);
	  h.clickonaccountbuton();
	  
  }
  
	

}
