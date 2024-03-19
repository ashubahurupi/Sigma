package Tests;

import org.testng.annotations.Test;

import POJO.Browser;
import POM.nopCommerceSearchPage;
import Utilities.ScrollingView;

public class nopCommerceSearchProductPage extends Browser {
	
	@Test(priority=1)
	public void SearchProductWithValidName() throws InterruptedException
	{
		
//		nopCommerce_LoginTest LoginTest=new nopCommerce_LoginTest();
//		LoginTest.LoginWithValidCredentintial();
		nopCommerceSearchPage SearchPage=new nopCommerceSearchPage(driver);
		SearchPage.EnterProductName("Apple MacBook Pro 13-inch");
		SearchPage.ClickOnSearchIconButton();
		//ScrollingView scrollingPage=new ScrollingView();
		ScrollingView.scrollingView(driver,SearchPage.productName);
		SearchPage.VerifyProductName();

     }
	@Test(priority=2)
	public void SearchProductWithInValidName() throws InterruptedException
	{
		nopCommerceSearchPage SearchPage=new nopCommerceSearchPage(driver);
		ScrollingView.scrollingView(driver,SearchPage.searchBar);
		SearchPage.EnterProductName("Honda");
		SearchPage.ClickOnSearchIconButton();
		SearchPage.VerifyProductNoResults();
    }
}