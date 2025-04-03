package amazonsourceproject1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonLoginPage 
{

	WebDriver driver;
	//step1
	@FindBy(name="email")
	WebElement username;
	@FindBy(id="continue")
	WebElement continue_button;
	@FindBy(id="ap_password")
	WebElement pwd;
	@FindBy(id="auth-signin-button")
	WebElement signinbutton;
	
	//step2
	public void email()
	{
		                                                                    username.sendKeys("anushamadamanchi10@gmail.com");
	}
	public void continuebutton()
	{
		continue_button.click();
	}
	public void password()
	{
		                                                                    pwd.sendKeys("Yashu123@");
	}
	public void incorrectpassword()
	{
		                                                                    pwd.sendKeys("abc123@");
	}
	public void signinbutton()
	{
		signinbutton.click();


	}
	
	
	
	//step3
		public AmazonLoginPage(WebDriver driver)
		{
			PageFactory.initElements(driver,this);////this----->local value to the global value
					
		}
		

}
