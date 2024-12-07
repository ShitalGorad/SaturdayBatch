package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GoogleSearch {

	WebDriver w;
	
	@BeforeClass
	public void LunchBrowser () {
	 w = new ChromeDriver();
	 w.get("https://www.google.com/");
	}
	 
	@Test (dataProviderClass = GoogleData.class, dataProvider = "GetData")
	
	public void Search (String s) {
		w.findElement(By.id("APjFqb")).clear();
		w.findElement(By.id("APjFqb")).sendKeys(s,Keys.ENTER);
	}
  
	@AfterClass
	public void Quit () {
		w.quit();
	}
	  
}
