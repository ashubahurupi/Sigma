package Tests;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import POJO.Browser;
import POM.LoginPage;
import POM.RegistrationPage;
import Utilities.GetDateAndTime;
import Utilities.getExcelData;

public class LoginTest extends Browser {
	
	@Test
	public void loginwithValidCredentials() throws InterruptedException, EncryptedDocumentException, IOException
	{
		
		System.out.println("Launch browser successfully ");
		RegistrationPage registrationPage=new RegistrationPage(driver);
		registrationPage.ClickOnMyAccountOption();
		LoginPage LoginPage=new LoginPage(driver);
		Thread.sleep(2000);
		LoginPage.ClikOnloginOption();
		Thread.sleep(2000);
		String userName=getExcelData.excelData(1, 0, "Credentials");
		System.out.println(userName);
		LoginPage.EnterEmailId(userName);
		//LoginPage.EnterEmailId("abahurupi001@yopmail.com");
		Thread.sleep(2000);
		String password=getExcelData.excelData(1, 1, "Credentials");
		System.out.println(password);
		LoginPage.EnterPassWord(password);
		//LoginPage.EnterPassWord("Ashish@1234");
		Thread.sleep(2000);
		LoginPage.ClickOnLoginbutton();
		
		String text=driver.findElement(By.linkText("Edit your account information")).getText();
		System.out.println(text);
		Assert.assertEquals(text,"Edit your account information");

	}
	
	@Test(priority=1)
	public void loginWithInvalidEmailAndPassWord() throws InterruptedException
	{
		System.out.println("Launch browser successfully ");
		RegistrationPage registrationPage=new RegistrationPage(driver);
		registrationPage.ClickOnMyAccountOption();
		LoginPage LoginPage=new LoginPage(driver);
		LoginPage.ClikOnloginOption();
		Thread.sleep(2000);
		String dateAndTime=GetDateAndTime.DateAndTime();
		LoginPage.EnterEmailId("abahurupi"+dateAndTime+"@yopmail.com");
		Thread.sleep(2000);
		LoginPage.EnterPassWord("Ashish@1234");
		Thread.sleep(2000);
		LoginPage.ClickOnLoginbutton();
		
		String text=driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']")).getText();
		System.out.println(text);
		Assert.assertEquals(text,"Warning: No match for E-Mail Address and/or Password.");
	}
	
	
	@Test(priority=2)
	public void loginWithInvalidPassword() throws InterruptedException
	{
		System.out.println("Launch browser successfully ");
		RegistrationPage registrationPage=new RegistrationPage(driver);
		registrationPage.ClickOnMyAccountOption();
		LoginPage LoginPage=new LoginPage(driver);
		LoginPage.ClikOnloginOption();
		Thread.sleep(2000);
		String dateAndTime=GetDateAndTime.DateAndTime();
		LoginPage.EnterEmailId("abahurupi"+dateAndTime+"@yopmail.com");
		Thread.sleep(2000);
		LoginPage.EnterPassWord("Ashish@123455");
		Thread.sleep(2000);
		LoginPage.ClickOnLoginbutton();
		
		String text=driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']")).getText();
		System.out.println(text);
		Assert.assertEquals(text,"Warning: No match for E-Mail Address and/or Password.");
	}

}
