package PomClass;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC01_VerifyLoginFunctionality extends TestBaseClass
{
 @Test
	public void verifylogin() throws IOException
	//       public static void main(String[] args) throws IOException 
       {
    	          UtilityClass.screenshot(driver, "prasadhomepage-30oct");
       System.out.println("apply validation");
       
       String expectedtitle= "Swag Labs";
       String actualtitle= driver.getTitle();
         Assert.assertEquals(actualtitle, expectedtitle);       
       }
}
