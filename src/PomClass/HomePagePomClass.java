package PomClass;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePagePomClass 
{
 WebDriver driver;
@FindBy(xpath="//button[@id='react-burger-menu-btn']")
   WebElement menubutton;
public void clickOnMenuButton()
{
	menubutton.click();
}
@FindBy(xpath ="//a[@id='logout_sidebar_link']")
WebElement logOutButton;
public void clickOnLogOutButton()
{
	logOutButton.click();
}
@FindBy(xpath ="//button[@id='add-to-cart-sauce-labs-backpack']")
WebElement bagproduct;
public void clickaddtocartbagbutton()
{
  bagproduct.click();
}
@FindBy(xpath ="//a[@class='shopping_cart_link']")
WebElement addtocartlink;
public String gettextofaddtocartbutton()
{
	String actualcount=addtocartlink.getText();
	return actualcount;
}




@FindBy(xpath ="//button[text()='Add to cart']")
private List<WebElement> allproducts;
public void clickallproducts()
{
//	for(int i=0;i<allproducts.size();i++)
//	{
//		allproducts.get(i).click();
//	}
        for(WebElement d: allproducts)
        {
      	  int list1=0;
      	  allproducts.get(list1).click();
        }
}




public HomePagePomClass(WebDriver driver)
 {
	this. driver=driver;
	PageFactory.initElements( driver,this);
 }

}
