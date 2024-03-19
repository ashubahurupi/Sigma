package Tests;

import java.io.FileNotFoundException;

import org.testng.annotations.Test;

import POJO.Browser;
import POM.nopCommerce_RegistrationPage;
import Utilities.DateAndTime;



public class nopCommerce_RegistrationTest extends Browser{
	
	
	@Test(priority=0)
	public void RegistrationWithValidDetailsTest()
	{
		nopCommerce_RegistrationPage registrationPage=new nopCommerce_RegistrationPage(driver);
		registrationPage.ClickOnRegisterOption();
		registrationPage.ClickOnGenderMaleOption();
		registrationPage.EnterFirstName();
		registrationPage.EnterLastName();
		registrationPage.EnterDateOFBirth();
		String dateAndTime=DateAndTime.Time();
		registrationPage.EnterEmailId("Ashish"+dateAndTime+"@yopmail.com");
		registrationPage.EnterCompanyName();
		registrationPage.EnterPassword();
		registrationPage.EnterConfirmPassword();
		registrationPage.ClickOnregisterButtonSubmit();

	}
	
	//div[@class='message-error validation-summary-errors']
	
	@Test(priority=1)
	public void RegistrationWithAlreadyExitsEmailTest()
	{
		nopCommerce_RegistrationPage registrationPage=new nopCommerce_RegistrationPage(driver);
		registrationPage.ClickOnRegisterOption();
		
		registrationPage.ClickOnGenderMaleOption();
		registrationPage.EnterFirstName();
		registrationPage.EnterLastName();
		registrationPage.EnterDateOFBirth();
		registrationPage.EnterEmailId("Ashish@yopmail.com");
		registrationPage.EnterCompanyName();
		registrationPage.EnterPassword();
		registrationPage.EnterConfirmPassword();
		registrationPage.ClickOnregisterButtonSubmit();
		registrationPage.CaptureTextmessageResultText();
		

	}
	

}
