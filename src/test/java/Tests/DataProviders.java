package Tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import POJO.Browser;
import POM.LoginPage;
import POM.RegistrationPage;
import Utilities.GetDateAndTime;

public class DataProviders extends Browser {
	
	
	@DataProvider
	public Object[][] getData()
	{
		return new Object[][] {
			
			new Object[] {"abahurupi003@yopmail.com","Ashish@12345"},
			new Object[] {"abahurupi002@yopmail.com","Ashish@123"},
			new Object[] {"abahurupi001@yopmail.com","Ashish@12"}
		};	
	}
	
	
	
	@Test(dataProvider="getData")
	public void LoginTest(String userName, String password) throws InterruptedException
	{
		System.out.println("Launch browser successfully ");
		RegistrationPage registrationPage=new RegistrationPage(driver);
		registrationPage.ClickOnMyAccountOption();
		LoginPage LoginPage=new LoginPage(driver);
		LoginPage.ClikOnloginOption();
		Thread.sleep(2000);
		LoginPage.EnterEmailId(userName);
		Thread.sleep(2000);
		LoginPage.EnterPassWord(password);
		Thread.sleep(2000);
		LoginPage.ClickOnLoginbutton();
		String text=driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']")).getText();
		System.out.println(text);
		Assert.assertEquals(text,"Warning: No match for E-Mail Address and/or Password.");
		
		
		
	}

}
