package Tests;

import org.testng.annotations.Test;

import POJO.Browser;
import POM.nopCommerceAddToCartPage;
import POM.nopCommerce_LoginPage;
import Utilities.ScrollingView;

public class copCommerceAddToCartTest extends Browser {
	
	@Test
	public void addToCartProduct() throws InterruptedException
	{
		nopCommerce_LoginTest loginTest= new nopCommerce_LoginTest();
		loginTest.LoginWithValidCredentintial();
		nopCommerceSearchProductPage searchProductPage= new nopCommerceSearchProductPage();
		searchProductPage.SearchProductWithValidName();
		nopCommerceAddToCartPage addToCartPage=new nopCommerceAddToCartPage(driver);
		addToCartPage.ClickOnAddToCartButton1();
		addToCartPage.EnterQuantityOfTheProduct("10");
		addToCartPage.ClickOnAddToCartButton();
		addToCartPage.VerifySuccessMessage();
		ScrollingView scrollingView=new ScrollingView();
		scrollingView.scrollingAtTop();
		POM.nopCommerce_LoginPage nopCommerce_LoginPage=new nopCommerce_LoginPage(driver);
		Thread.sleep(2000);
		
	}

}
