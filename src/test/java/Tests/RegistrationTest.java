package Tests;
import java.io.FileNotFoundException;

import org.testng.annotations.Test;

import POJO.Browser;
import POM.RegistrationPage;
import Utilities.GetDateAndTime;

public class RegistrationTest extends Browser {
	
	@Test
	public void RegistrationForm() throws FileNotFoundException
	{
		RegistrationPage registrationPage=new RegistrationPage(driver);
		registrationPage.ClickOnMyAccountOption();
		registrationPage.ClickOnRegisterOption();
		registrationPage.EnterFirstName();
		registrationPage.EnterLastName();
		GetDateAndTime GetDateAndTime=new GetDateAndTime();
		String userName=Utilities.GetDateAndTime.DateAndTime();
		registrationPage.EnterEmailId(userName);
		registrationPage.EntertelephoneNumber();
		registrationPage.EnterPassword();
		registrationPage.EnterConfirmPassword();
		registrationPage.ClickOnCheckBox();
		registrationPage.ClickOnContinueButton();

	}


}
