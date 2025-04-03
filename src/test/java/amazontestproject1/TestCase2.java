package amazontestproject1;

import org.testng.annotations.Test;

import amazonsourceproject1.AmazonCartPage;
import amazonsourceproject1.AmazonHomePage;
import amazonsourceproject1.AmazonLoginPage;
import amazonsourceproject1.AmazonProductPage1;
import amazonsourceproject1.AmazonSearchPage;



public class TestCase2 extends LaunchQuit

{
	

	@Test
	public void login_search_wishlist_removefromcart_logout()
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
		
		
		
		AmazonProductPage1 productpage=new AmazonProductPage1(driver);
		productpage.addtowishlist_click();
		productpage.viewyourlist_click();
		productpage.addtocart();
		productpage.viewcart();
		//productpage.remove();
		
		AmazonCartPage cart=new AmazonCartPage(driver);
		cart.remove();
		
		homepage.hoveroverAccountsandlist(driver);
		homepage.signout();
		

		
		
	}
}
