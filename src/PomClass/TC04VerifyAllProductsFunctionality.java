package PomClass;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC04VerifyAllProductsFunctionality extends TestBaseClass
{
	 @Test
     public void Verifyallproducts() throws IOException
     {
   	  
  System.out.println("went on home page");
    HomePagePomClass hp= new HomePagePomClass(driver);
     hp.clickallproducts();
     System.out.println("select all product");
     System.out.println("apply validation");
     String expectedproductcount="6";
     String actualproductcount=hp.gettextofaddtocartbutton();
     System.out.println("total productselected are"+actualproductcount);
    Assert.assertEquals(actualproductcount, expectedproductcount);     
     }
}
