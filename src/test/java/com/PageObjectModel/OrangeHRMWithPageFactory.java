package com.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRMWithPageFactory {

	public OrangeHRMWithPageFactory (WebDriver w){
			
	PageFactory.initElements(w, this);
	}
			
      @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")
	private WebElement username;
			@FindBy(name ="password")
			WebElement password;
			@FindBy(css = "button[type=\"submit\"]")
			WebElement login;
			@FindBy(className =  "oxd-userdropdown-name")
			WebElement manda;
			@FindBy(partialLinkText = "Logout")
			WebElement Logout;
			
		
		public void loginclear() {
			username.clear();
			password.clear();
		}

		public void EnterLoginData() {
			username.sendKeys("Admin");
			password.sendKeys("admin123");
		}
		public void login() {
			login.click();
		}
		public void manda() {
			manda.click();
		}
			
		public void Logout() {
			Logout.click();
		}
				
		}


