package com.PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrontAccounting {

	public static void main(String[] args) throws Exception {
		WebDriver cd = new ChromeDriver();
		FrontAccountingPerform f = new FrontAccountingPerform(cd);
		cd.get("https://demo.frontaccounting.eu/index.php");
		f.login();
		Thread.sleep(2000);
		f.sales();
		Thread.sleep(2000);
		f.cancel();
		Thread.sleep(2000);
		f.alerthandling();
		Thread.sleep(2000);
		f.back();
		Thread.sleep(2000);
		f.order();
		Thread.sleep(2000);
		f.cancel1();
		Thread.sleep(2000);
		f.alerthandling1();
		Thread.sleep(2000);
		f.logout();
		Thread.sleep(2000);
	}

}
