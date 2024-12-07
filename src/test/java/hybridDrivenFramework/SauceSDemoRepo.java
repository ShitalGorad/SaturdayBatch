package hybridDrivenFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceSDemoRepo {

	public SauceSDemoRepo (WebDriver wd) {
	PageFactory.initElements(wd, this);

	}
  @FindBy(id ="user-name")
  WebElement username;
  
  @FindBy(css ="input[type=\"password\"]")
  WebElement password;
  
  @FindBy(name ="login-button")
  WebElement loginbutton;
  
  @FindBy(xpath ="/html/body/div/div/div/div[2]/div/div/div/div[1]/div[2]/div[2]/button")
  WebElement addtocartbtn;
  
  @FindBy(css ="button[id=\"react-burger-menu-btn\"]")
  WebElement openmenu;
  
  @FindBy(linkText ="Logout")
  WebElement logoutbtn;
  
  public void login(String user,String pass) {
	  username.clear();  
	  username.sendKeys(user);
	  password.clear();
	  password.sendKeys(pass);
	  loginbutton.click();
	  
	}
  public void addtocart() {
	  addtocartbtn.click();
  }
  public void logoutbtn() {
	  openmenu.click();
	  logoutbtn.click();
	  
  }
}
