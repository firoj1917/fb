package test;



import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import lib.ExcelRead;
import page.CreatePage;
import page.HomePage;

public class CreatePageTest extends BaseTest {
	@Test(dataProvider = "fb")

	public void CreateTest(String f, String l, String k, String u, String p, String r, String e, String q, String y) throws InterruptedException{
		
		HomePage g = new HomePage(driver);
		g.clickonaccountbuton();

		CreatePage fn = new CreatePage(driver);
		fn.typefirstname(f);
		fn.typelastname(l);
		fn.typeemail(k);
		fn.typeemailconfirm(u);
		fn.typepass(p);
		fn.selectmonth(r);
		fn.selectday(e);
		fn.selectyear(q);
		fn.clickOnGender(y);
		
		CreatePage m = new CreatePage(driver);
		m.clicksubmitbutton();
		
	}

	@DataProvider(name= "fb")

	public Object[][] datafeeder() throws IOException{
		Object[][]y;
		String filename = "Data/fb1.xlsx";
		String sheetname = "Sheet1";
		ExcelRead er = new ExcelRead(filename,sheetname);
		y = er.excelToArray();
			
	return y;

	}

	}