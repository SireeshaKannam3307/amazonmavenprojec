package amazontestproject1;

import org.testng.annotations.Test;

import amazonsourceproject1.AmazonHomePage;
import amazonsourceproject1.AmazonLoginPage;
import amazonsourceproject1.AmazonSearchPage;
import amazonsourceproject1.AmazonUpdateAddress;



public class TestCase3 extends LaunchQuit
{

	@Test
	
	public void login_search_updatenewaddress_signout()
	
	{
		AmazonHomePage homepage=new AmazonHomePage(driver);
		homepage.hoveroverAccountsandlist(driver);
		homepage.signin_click();
		AmazonLoginPage loginpage=new AmazonLoginPage(driver);
		loginpage.email();
		loginpage.continuebutton();
		loginpage.password();
		loginpage.signinbutton();
		homepage.searchproduct();
		
		AmazonSearchPage searchpage=new AmazonSearchPage(driver);
		searchpage.firsttoy_click(driver);
		homepage.hoveroverAccountsandlist(driver);
		homepage.youraccount_click();
		AmazonUpdateAddress  editaddress=new AmazonUpdateAddress(driver);
		editaddress.youraddress_click();
		editaddress.editaddress_click();
		editaddress.fullname();
		editaddress.address();
		editaddress.updateaddress_click();
		
		}
	
	
}


