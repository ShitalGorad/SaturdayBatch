package testng;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Demo {


	@Test(priority = 1 /*, invocationCount =  2, enabled = false*/)
	public void GooglrSearch () throws Exception {
		WebDriver w = new EdgeDriver();
		w.get("https://www.google.com/");
		Thread.sleep(5000);
		w.quit();
		
	}
		@Test(priority = 2)
		public void Facebook () throws InterruptedException {
			WebDriver w = new FirefoxDriver();
			w.get("https://www.facebook.com/");
			Thread.sleep(5000);
			w.quit();
	}

}
