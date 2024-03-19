package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class nopCommerce_LoginPage {
	
	public WebDriver driver;
	
	@FindBy(xpath="//a[@class='ico-login']") public WebElement loginOption;
	
	@FindBy(xpath="//input[@id='Email']") public WebElement emailId;
	
	@FindBy(xpath="//input[@id='Password']") public WebElement password;
	
	@FindBy(xpath="//input[@id='RememberMe']") public WebElement rememberMe;
	
	@FindBy(xpath="//button[text()='Log in']") public WebElement loginButton;
	
	// //div[@class='message-error validation-summary-errors']
	
	@FindBy(xpath="//div[@class='message-error validation-summary-errors']") public WebElement errorMessage; 
	
	@FindBy(xpath="//div[@class='topic-block-title']") public WebElement successMessageText;
	
	
	public nopCommerce_LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver ,this);
		
	}
	
	public void ClickOnloginOptionOption()
	{
		loginOption.click();
	}
 
	public void EnterEmailId(String email)
	{
		emailId.sendKeys(email);
	}
	
	public void EnterPassword(String pword)
	{
		password.sendKeys(pword);
	}
	
	public void EnterRememberMe()
	{
		rememberMe.click();
	}
	
	public void EnterloginButton()
	{
		loginButton.click();
	}
	
	// errorMessage
	public void GeterrorMessage()
	{
		String error=errorMessage.getText();
		System.out.println("Result"+error);
		String expectedError="Login was unsuccessful. Please correct the errors and try again.";
		System.out.println(expectedError);
		Assert.assertEquals(error, expectedError);
	}
	
	
	// successMessageText
	
	public void GetesuccessMessageText()
	{
		String Text=successMessageText.getText();
		System.out.println("Result"+ Text);
		String expectedError="Welcome to our store";
		System.out.println(expectedError);
		Assert.assertEquals(Text, expectedError);
	}
}
