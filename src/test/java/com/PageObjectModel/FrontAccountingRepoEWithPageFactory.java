package com.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FrontAccountingRepoEWithPageFactory {

	
	 public FrontAccountingRepoEWithPageFactory (WebDriver w){
	
	PageFactory.initElements(w, this);
	}
	
	@FindBy(xpath = "//*[@id=\"_page_body\"]/form/center[1]/table/tbody/tr[3]/td[2]/input")
	private WebElement username;
	@FindBy(name ="password")
	WebElement password;
	@FindBy(name = "SubmitUser")
	WebElement login;
	@FindBy(partialLinkText = "Logout")
	WebElement logout;
	@FindBy(linkText = "Click here to Login Again.")
	WebElement loginAgain;


public void loginclear() {
	username.clear();
	password.clear();
}

public void EnterLoginData() {
	username.sendKeys("demouser");
	password.sendKeys("password");
}
public void login() {
	login.click();
}
public void logout() {
	logout.click();
	loginAgain.click();
}

			
}


