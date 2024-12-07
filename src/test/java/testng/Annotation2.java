package testng;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotation2 {
	WebDriver w;
	@BeforeClass   //pre condition ------>search  ------>shoes and mobile
	public void OpenBrowser () {
	 w = new ChromeDriver();
	}

	@BeforeMethod // pre-condition   --> shoes and mobile
	 public void openBrowser () {
		  w.get("https://www.flipkart.com/");
		 
		 
	 }
	    @Test  // test condition for shoes
	    public void shoes () {
	   	 w.findElement(By.name("q")).sendKeys("shoes",Keys.ENTER);
	   	 w.findElement(By.partialLinkText("MIKE (N) Running Shoes For Men")).click();  	 
	   	 
	    }
	    
	    @Test //test condition for mobile
	    public void mobile() {
	      	 w.findElement(By.name("q")).sendKeys("mobile",Keys.ENTER);
	      	 w.findElement(By.partialLinkText("Apple iPhone 15 (Black, 128 GB)")).click();  	 
	      	 
	       }
	   @AfterClass
	   public void quit () throws Exception {
		   Thread.sleep(2000
				   );
		   w.quit();
	   }
	

}
