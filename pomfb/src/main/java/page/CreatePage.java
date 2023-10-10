package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import model.CreatModel;

public class CreatePage extends CreatModel {

	public CreatePage(WebDriver d) {
		super(d);

	}
		public void typefirstname(String f) throws InterruptedException {
			WebElement e = getFirstName();
			e.sendKeys(f);
	}
		public void typelastname(String l) {
			WebElement h = getLastName();
			h.sendKeys(l);
	}
		public void typeemail(String k) {
			WebElement f = getEmail();
			f.sendKeys(k);
	}
		public void typeemailconfirm(String u) {
			WebElement d = getEmailConfirm();
			d.sendKeys(u);
	}
		public void typepass(String p) {
			WebElement o = getPass();
			o.sendKeys(p);
	}
		public void selectmonth(String r) {
			Select sel = new Select(getMonth());
			sel.selectByVisibleText(r);
	}
		public void selectday(String e) {
			Select select = new Select(getDay());
			select.selectByVisibleText(e);
	}
		public void selectyear(String q) {
			Select sel1 = new Select(getYear());
			sel1.selectByVisibleText(q);
	}
		public void clickOnGender(String y) {
			WebElement e = getGender(y);
			e.click();
	
	}
		public void clicksubmitbutton() {
			WebElement s = grab();
			s.click();
	}
	}