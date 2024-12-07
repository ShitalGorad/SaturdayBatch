package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class Annotations {
WebDriver w;

@BeforeMethod // pre-condition   --> shoes and mobile
 public void openBrowser () {
	 w = new ChromeDriver();
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
   @AfterMethod
   public void quit () {
	   w.quit();
   }
}
