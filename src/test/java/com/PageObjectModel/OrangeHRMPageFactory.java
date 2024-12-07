package com.PageObjectModel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMPageFactory {

	public static void main(String[] args) throws InterruptedException {
		WebDriver w = new ChromeDriver();
		w.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		w.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		OrangeHRMWithPageFactory r = new OrangeHRMWithPageFactory(w);
	
		r.loginclear();
		Thread.sleep(2000);
		r.EnterLoginData();
		Thread.sleep(2000);
		r.login();
		Thread.sleep(2000);
		r.manda();
		Thread.sleep(2000);
		r.Logout();
	}
}
