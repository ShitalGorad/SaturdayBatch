package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class CrossBrowsingTesting {

	WebDriver  w;
	@Test
     @Parameters("browser")  //Parameters "browser" will find value in xml and name
	// Attribute value match with "browser" as a value then it will capture value attribute value & pass to the String parameter in the method.
	public  void GoogleSearch(String browser) throws Exception {
		switch (browser) {
		case "Firefox":
			w = new FirefoxDriver();
			break;
		case "Edge":
			w = new EdgeDriver();
			break;
		default:
			break;
		}
		
		w.get("https://www.google.co.in/");
		
		w.findElement(By.id("APjFqb")).sendKeys("job" ,Keys.ENTER);
		Thread.sleep(2000);
		w.quit();
	}

}
