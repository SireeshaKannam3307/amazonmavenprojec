package amazonsourceproject1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonCartPage 
{

	WebDriver driver;
	@FindBy(xpath="(//input[@class='a-color-link'])[1]")
	WebElement removeproduct;
	public void remove()
	
	{
		removeproduct.click();
	}
	
	public AmazonCartPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);////this----->local value to the global value
	}

	
	
}
