package Tests;

import org.testng.annotations.Test;

import POJO.Browser;
import POM.nopCommerce_LoginPage;

public class nopCommerce_LoginTest extends Browser{
	
	
	@Test(priority=2)
	public void LoginWithInValidCredentintial()
	{
		nopCommerce_LoginPage LoginPage=new nopCommerce_LoginPage(driver);
		LoginPage.ClickOnloginOptionOption();
		LoginPage.EnterEmailId("Aabahurupi@yopmail.com");
		LoginPage.EnterPassword("Ashish@234");
		LoginPage.EnterRememberMe();
		LoginPage.EnterloginButton();
		LoginPage.GeterrorMessage();
		
	}
	@Test(priority=3)
	public void LoginWithInValidEmailIdAndValidPassword()
	{
		nopCommerce_LoginPage LoginPage=new nopCommerce_LoginPage(driver);
		LoginPage.ClickOnloginOptionOption();
		LoginPage.EnterEmailId("Ashish@yomail.com");
		LoginPage.EnterPassword("Ashish@1234");
		LoginPage.EnterRememberMe();
		LoginPage.EnterloginButton();
		LoginPage.GeterrorMessage();
	}
	@Test(priority=4)
	public void LoginWithValidEmailIdAndInValidPassword()
	{
		nopCommerce_LoginPage LoginPage=new nopCommerce_LoginPage(driver);
		LoginPage.ClickOnloginOptionOption();
		LoginPage.EnterEmailId("Ashish@yopm.com");
		LoginPage.EnterPassword("Ashish@134");
		LoginPage.EnterRememberMe();
		LoginPage.EnterloginButton();
		LoginPage.GeterrorMessage();
	}
	
	@Test
	public void LoginWithValidCredentintial() throws InterruptedException
	{
		nopCommerce_LoginPage LoginPage=new nopCommerce_LoginPage(driver);
		LoginPage.ClickOnloginOptionOption();
		LoginPage.EnterEmailId("Ashish002@yopmail.com");
		Thread.sleep(2000);
		LoginPage.EnterPassword("Admin@1234");
		LoginPage.EnterRememberMe();
		LoginPage.EnterloginButton();
		LoginPage.GetesuccessMessageText();
	}

}
