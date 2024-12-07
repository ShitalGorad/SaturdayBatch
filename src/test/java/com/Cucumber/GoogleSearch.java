package com.Cucumber;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearch {

	WebDriver w;
	@Given("Launch Browser And open Google site.")
	public void launch_browser_and_open_google_site() {
		w  = new ChromeDriver(); 
		w.get("https://www.google.co.in/");
		  
	}

	@When("Enter {string} in search field & click on search button .")
	public void enter_in_search_field_click_on_search_button(String products) {
		  w.findElement(By.id("APjFqb")).sendKeys(products ,Keys.ENTER);
	}

	@Then("validate the {string}")
	public void validate_the(String titles) {
		String expurl = w.getTitle();
		
		   Assert.assertEquals(expurl, titles);
	}


}

