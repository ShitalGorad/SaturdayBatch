package com.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrontAccountingPageFactory {

	public static void main(String[] args) throws InterruptedException {
		WebDriver w = new ChromeDriver();
		w.get("https://demo.frontaccounting.eu/index.php");
		FrontAccountingRepoEWithPageFactory r = new FrontAccountingRepoEWithPageFactory(w);
	
		r.loginclear();
		Thread.sleep(2000);
		r.EnterLoginData();
		Thread.sleep(2000);
		r.login();
		Thread.sleep(2000);
		r.logout();
		
		

	}

}
