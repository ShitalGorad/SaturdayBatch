package com.Logger;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceDemo {

	public static void main(String[] args) {
		Logger log =LogManager.getLogger();
		WebDriver w = new ChromeDriver();
		w.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		log.info("Chrome browser has been launched");
		w.get("https://www.saucedemo.com/");
		log.info("User has been open Sauce demo site");
		w.findElement(By.id("user-name")).sendKeys("standard_user");
		log.info("In user filed'standard_user' has been entered");
		w.findElement(By.id("password")).sendKeys("secret_sauce");
		log.info("In password filed 'secret_sauce' has been entered");
		w.findElement(By.name("login-button")).click();
		log.info("user clicked on login button");
		
		try {
			w.findElement(By.id("react-burger-menu-btn")).click();
			log.info("clicked on menu button");
			w.findElement(By.linkText("Logout")).click();
			log.info("clicked on logout button");
		
		} catch (Exception e) {
			log.error("user unable to login");
		}
		

	}

}
