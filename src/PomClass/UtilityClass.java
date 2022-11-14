package PomClass;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityClass 
{
  public static void screenshot(WebDriver driver,String prasad) throws IOException
  {
  
  TakesScreenshot ts=(TakesScreenshot)driver;
	 File sourcefile =ts.getScreenshotAs(OutputType.FILE);
	File destfile= new File("D:\\screenshot\\"+prasad+".jpg");
 FileHandler.copy(sourcefile, destfile);
}
}