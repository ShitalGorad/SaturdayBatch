package com.PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class FrontAccountingPerform {
	WebDriver w;
    public FrontAccountingPerform(WebDriver wd) {
   	 w = wd;
   }
   
    By Login = By.cssSelector("input[type=\"submit\"]");
    By sales = By.partialLinkText("Sales Quotation Entry");
    By cancel = By.xpath("//*[@id=\"CancelOrder\"]");
    By back = By.linkText("Back");
    By order = By.partialLinkText("Sales Order Entry");
    By cancel1 = By.cssSelector("button[title=\"Cancels document entry or removes sales order when editing an old document\"]");
    By logout = By.linkText("Logout");
    public void login() {
  	  w.findElement(Login).click();
		
	}
    public void sales() {
    	  w.findElement(sales).click();
    }
    	  
    public void cancel() {
       w.findElement(cancel).click();
    	  }
    	  
    public void alerthandling() {
        w.switchTo().alert().accept();
    }
    
    public void back() {
     w.findElement(back).click();
    }
   
    public void order() {
        w.findElement(order).click();
       }
    public void cancel1 () {
        w.findElement(cancel1).click();
       }
    
    public void alerthandling1() {
        w.switchTo().alert().accept();
        
  
    }
    public void logout () {
        w.findElement(logout).click();
       }
    
}
