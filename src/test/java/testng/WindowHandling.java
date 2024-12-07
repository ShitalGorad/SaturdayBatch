package testng;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WindowHandling {
    String parent;
	WebDriver w;
	@BeforeClass   //pre condition ------>search  ------>shoes and mobile
	public void OpenBrowse () {
	 w = new ChromeDriver();
	}

	@BeforeMethod // pre-condition   --> shoes and mobile
	 public void openBrowser () {
		  w.get("https://www.flipkart.com/");
		  w.manage().window().maximize();
		 
		 
	 }
	    @Test  (priority = 2)// test condition for shoes
	    public void shoes () throws Exception {
	   	 w.findElement(By.name("q")).sendKeys("shoes",Keys.ENTER);
	   	 w.findElement(By.partialLinkText("MIKE (N) Running Shoes For Men")).click();  	 
	   	 String parentW = w.getWindowHandle();
	   	 Set<String> Child1W = w.getWindowHandles();
	   	 for (String c1 : Child1W) {
			if (!c1.equals(parentW)) {
				w.switchTo().window(c1);
				Thread.sleep(2000);
				Actions act = new Actions(w);
				WebElement add  = w.findElement(By.cssSelector("button[class=\"QqFHMw vslbG+ In9uk2\"]"));
				act.moveToElement(add).click().perform();
			}
		}
	    }
	    
	    @Test (priority = 1) //test condition for mobile
	    public void mobile() throws Exception {
	      	 w.findElement(By.name("q")).sendKeys("mobile",Keys.ENTER);
	      	 w.findElement(By.partialLinkText("Apple iPhone 15 (Black, 128 GB)")).click();
	      	 String parentW = w.getWindowHandle();
		   	 Set<String> Child1W = w.getWindowHandles();
		   	 for (String c1 : Child1W) {
				if (!c1.equals(parentW)) {
					w.switchTo().window(c1);
					Thread.sleep(2000);
					Actions act = new Actions(w);
					try {
						WebElement add  = w.findElement(By.cssSelector("button[class=\"QqFHMw vslbG+ In9uk2\"]"));
						act.moveToElement(add).click().perform();
					} catch (Exception e) {
						WebElement emi  = w.findElement(By.cssSelector("button[class=\"QqFHMw vslbG+ _3Yl67G FMWyoY\"]"));
						act.moveToElement(emi).click().perform();
					}
					w.close();
					w.switchTo().window(parentW);
				}
		   	 }
	      	 
	       }
	   @AfterClass
	   public void quit () throws Exception {
		   Thread.sleep(2000);
		  // w.quit();
	   }
	
}
