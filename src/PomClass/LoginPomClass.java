package PomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPomClass 
{
  WebDriver driver;
  @FindBy(xpath ="//input[@id='user-name']")
  WebElement username;
  public void sendusername()
  {
	  username.sendKeys("standard_user");
  }
  @FindBy(xpath ="//input[@id='password']")
	 WebElement password;
 public void sendpasaword()
{
	password.sendKeys("secret_sauce");
}
     @FindBy(xpath ="//input[@id='login-button']")
   WebElement loginButton;
 public void clickonloginbutton()
 {
	 loginButton.click();
 }
  public LoginPomClass(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver,this);
}

}
