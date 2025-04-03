package amazontestproject1;


import org.testng.annotations.Test;

import amazonsourceproject1.AmazonHomePage;
import amazonsourceproject1.AmazonLoginPage;
import amazonsourceproject1.AmazonProductPage1;
import amazonsourceproject1.AmazonSearchPage;




public class TestCase1 extends LaunchQuit

{

	@Test
	public void login_search_wishlist_cart_logout()
	
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
		
		
		
		AmazonProductPage1 wishlist=new AmazonProductPage1(driver);
		wishlist.addtowishlist_click();
		wishlist.viewyourlist_click();
		wishlist.addtocart();
		wishlist.viewcart();
		homepage.hoveroverAccountsandlist(driver);
		homepage.signout();
		
		
		
	}
	
	
}
