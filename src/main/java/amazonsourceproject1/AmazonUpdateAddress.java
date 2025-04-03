package amazonsourceproject1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonUpdateAddress 
{

	WebDriver driver;
	@FindBy(xpath="//span[.='Edit addresses for orders and gifts']")
	WebElement youraddress;
	@FindBy(xpath="(//a[@class='a-link-normal'])[3]")
	WebElement editaddress;
	@FindBy(id="address-ui-widgets-enterAddressFullName")
	WebElement fullname;
	
	@FindBy(id="address-ui-widgets-enterAddressLine1")
	WebElement address;
	
	@FindBy(xpath="//span[.='Update address']")
	WebElement updateaddress;
	public void youraddress_click()
	{
		youraddress.click();
	}
	
	public void editaddress_click()
	{
		editaddress.click();
	}
	
	
	
	public void fullname()
	{
		
		fullname.clear();
		fullname.sendKeys("Sireesha Kannam"+Keys.ENTER);
	}
	
	public void address()
	{
		address.clear();
		address.sendKeys("4-5-143 R.k nagar,nawabpet,nellore"+Keys.ENTER);
	}
	
	public void updateaddress_click()
	{
		updateaddress.click();
	}
	
	public AmazonUpdateAddress (WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
}
