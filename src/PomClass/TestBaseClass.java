package PomClass;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class TestBaseClass 
{
     WebDriver driver; 
	@Parameters("browsername")
	@BeforeMethod
      public void setup(String browsername) throws IOException
      {
		if(browsername.equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver","F:\\seleniumdrivers\\chromedriver.exe");
		
	  	   driver = new ChromeDriver();
		}
		else
		{
			 System.setProperty("webdriver.gecko.driver", "C:\\Users\\Prasad\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe" );
				
			    driver = new FirefoxDriver();
		}
	  	   
	  	    System.out.println("Browseris opend");
	         driver.manage().window().maximize();
	         System.out.println("Browser is maximize");
	         driver.get("https://www.saucedemo.com/");
		System.out.println("url is opened");
		System.out.println("Went on login page");
		 UtilityClass.screenshot(driver, "prasad-30oct");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		LoginPomClass lp= new LoginPomClass(driver);
lp.sendusername();
System.out.println("username is entered");
lp.sendpasaword();
System.out.println("password is entered");
lp.clickonloginbutton();
System.out.println("clicked on login button");

System.out.println("went on home page");
       }

@AfterMethod
public void TearDown()
{
	 driver.quit();
	    System.out.println("browser is closed");

}

}
