package com.Cucumber;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SauceDemoLogin {
WebDriver w;
	@Given("Launch Browser And open saucedemo site.")
	public void launch_browser_and_open_saucedemo_site() {
           
		w  = new ChromeDriver(); 
		w.get("https://www.saucedemo.com/");
		  

	}

	@When("Enter {string} in Username field And some other action Enter {string} in password field.")
	public void enter_in_username_field_and_some_other_action_enter_in_password_field(String username, String password) {
	    w.findElement(By.id("user-name")).sendKeys(username);
	    w.findElement(By.id("password")).sendKeys(password);
	}

	@When("click on login button")
	public void click_on_login_button() {
	      w.findElement(By.cssSelector("input[data-test=\"login-button\"]")).click();
	}

	@Then("validate login is successful.")
	public void validate_login_is_successful() {
	   String expurl = "https://www.saucedemo.com/inventory.html";
	   String acturl = w.getCurrentUrl();
	   Assert.assertEquals(expurl, acturl);
	}
}
