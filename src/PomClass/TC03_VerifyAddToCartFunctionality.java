package PomClass;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC03_VerifyAddToCartFunctionality extends TestBaseClass
{
      @Test
      public void Verifyaddtocart() throws IOException
      {
    	   
   System.out.println("went on home page");
      HomePagePomClass hp= new HomePagePomClass(driver);
      hp.clickaddtocartbagbutton();
      System.out.println("clicked on add to cart");
      System.out.println("apply validation");
      String expectedproductcount="1";
      String actualproductcount=hp.gettextofaddtocartbutton();
      Assert.assertEquals(actualproductcount, expectedproductcount);          
      
      
      
      }
}
