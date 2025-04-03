package amazonsourceproject1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonProductPage1 
{

	WebDriver driver;
	//step1
	@FindBy(xpath="//input[@id=\"add-to-wishlist-button-submit\"]")
	WebElement wishlist;
	@FindBy(linkText="View Your List")
	WebElement viewyourlist;
	@FindBy(xpath="//a[@class=\"a-button-text a-text-center\"]")
	WebElement addtocart;
	@FindBy(linkText="View Cart")
	WebElement viewcart;
	
	@FindBy(xpath="(//input[@class='a-color-link'])[1]")
	WebElement removeproduct;
			
	//step2
	public void addtowishlist_click()
	{
		wishlist.click();
	}
	
	
	public void viewyourlist_click()
	{
		viewyourlist.click();
	}
	
	public void addtocart()
	{
		addtocart.click();
	}
	
	public void viewcart()
	
	{
		viewcart.click();
	}
	
	public void remove()
	{
		removeproduct.click();
		
	}
	//step3
			public AmazonProductPage1(WebDriver driver)
			{
				PageFactory.initElements(driver,this);
			}
}
