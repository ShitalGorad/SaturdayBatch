package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion {

	WebDriver w;
	
	@Test
	public void LunchBrowser () {
		 w = new ChromeDriver();
		 w.get("https://www.google.com/");
		 w.findElement(By.id("APjFqb")).sendKeys("mobile",Keys.ENTER);
		 
		 String exp = "mobile -Google Search";
		 String act =  w.getTitle();
		 
		 //Hard Assertion
		 //Assertion.assertEquals(act, exp);
		 
		 
		//Soft Assertion
		 SoftAssert soft = new SoftAssert();
		 soft.assertEquals(act,exp);
		 
		 w.quit();
		 soft.assertAll();    // This statement is important to call because of it's gives you value after clicking same as SYSO
		}
}
