package hybridDrivenFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FrontAccountingRepo {

	 public FrontAccountingRepo (WebDriver w){
			
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



public void EnterLoginData(String user, String pass) {
	username.clear();
	username.sendKeys(user);
	password.clear();
	password.sendKeys(pass);
	login.click();

}
public void logout() {
	logout.click();
	loginAgain.click();
}


}
