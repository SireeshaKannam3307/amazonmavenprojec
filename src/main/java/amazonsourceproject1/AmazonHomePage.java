
package amazonsourceproject1;



import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


public class AmazonHomePage 
{
    WebDriver driver;
	//Step1 Accounts and Lists
    @FindBy(xpath="//span[@class='nav-line-2 ']")
	WebElement accountsandlists;
    @FindBy(xpath="(//span[.='Sign in'])[1]")
	WebElement signin;
   
    //Search textbox
    @FindBy(id="twotabsearchtextbox")
    WebElement searchproduct;
    @FindBy(xpath="//span[.='Sign Out']")
    WebElement signout;
    //youraccount
    @FindBy(xpath="//span[.='Your Account']")
      WebElement youraccount;
    //manageprofile
    @FindBy(xpath="//button[.='Manage Profiles']")
	WebElement manageprofile;
	//view
    @FindBy(linkText="View")
    WebElement view;
    
	//step2
	public void hoveroverAccountsandlist(WebDriver driver)//if we don't write parameter as WebDriver driver we will get nullpointer Exception.
	{
		Actions a1=new Actions(driver);
		a1.moveToElement(accountsandlists).perform();
		
		
	}
	
	public void signin_click()
	{
		signin.click();
	}
	
	
	public void searchproduct()
	{
		searchproduct.sendKeys("Toys"+Keys.ENTER);
	}
	
	public void youraccount_click()
	
	{
		youraccount.click();
	}
	
	public void signout()
	{
		
		
		signout.click();
	}
	
	
	public void manageprofile_clcik()
	{
		manageprofile.click();
	}
	
	public void view_click()
	{
		view.click();
	}
	//step3
	public AmazonHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);////this----->local value to the global value
		String homepagetitle=driver.getTitle();
		System.out.println(homepagetitle);
		Assert.assertEquals(homepagetitle,"Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in",
	 "Sorry the Title is wrong");
		
	}
	

	
	
	
	
	
}

