package PomClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC02_VerifyLogoutFunctionality extends TestBaseClass


{
//   public static void main(String[] args) 
   @Test
	public void VerifyLogout()
	
	{
	
  
   
  HomePagePomClass hp = new HomePagePomClass(driver);
    hp.clickOnMenuButton();
   System.out.println("clicked on menu button");
   hp.clickOnLogOutButton();
   System.out.println("clicked on logout button");
   
   System.out.println("went on login page");
   
   System.out.println("apply validation");
    String expectedtitle="Swag Labs";
   String actualtitle= driver.getTitle();
   Assert.assertEquals(actualtitle, expectedtitle);      
   }
}
