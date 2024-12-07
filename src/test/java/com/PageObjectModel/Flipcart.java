package com.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipcart {

	public static void main(String[]args) throws Exception {
		WebDriver cd = new ChromeDriver();
		RepoOfFlipcart f = new RepoOfFlipcart(cd);
		cd.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		f.search("Iphone 15");
		Thread.sleep(2000);
		f.product();
		Thread.sleep(2000);
		f.windowHandle(cd.getWindowHandle(),cd.getWindowHandles());
		Thread.sleep(2000);
		f.Addtocart();
		
		
	
		
	}
	
}
