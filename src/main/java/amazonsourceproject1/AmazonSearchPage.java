package amazonsourceproject1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonSearchPage 
{

	WebDriver driver;
	@FindBy(xpath="(//a[@class=\"a-link-normal s-line-clamp-4 s-link-style a-text-normal\"])[1]")
	WebElement firsttoy;
	
	
	
	//step2
	public void firsttoy_click(WebDriver driver)
	{
	
		firsttoy.click();
		Set<String> pcid=driver.getWindowHandles();
		System.out.println(pcid);
		Iterator<String> it1=pcid.iterator();
	     String parentid=it1.next();
	     String childid=it1.next();
	      System.out.println(parentid);
	      System.out.println(childid);
	      driver.switchTo().window(childid);//control move to the child

	}
	
	//step3
		public AmazonSearchPage(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}

}

	

