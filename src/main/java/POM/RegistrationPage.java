package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {
	
public WebDriver driver;
	
	@FindBy(xpath="//a[@title='My Account']") public WebElement myAccountOption;
	
	@FindBy(xpath="//a[@href='https://tutorialsninja.com/demo/index.php?route=account/register']") public WebElement RegisterOption;
	
	@FindBy(xpath="//input[@id='input-firstname']") public WebElement firstName;
	
	@FindBy(xpath="//input[@id='input-lastname']") public WebElement lastName; 
	
	@FindBy(xpath="//input[@id='input-email']") public WebElement emailId;
	
	@FindBy(xpath="//input[@id='input-telephone']") public WebElement telephoneNumber;
	
	//id="input-password"
	
	@FindBy(xpath="//input[@id='input-password']") public WebElement passWord;
	
	@FindBy(xpath="//input[@id='input-confirm']") public WebElement ConfiremassWord;
	
	// PrivacyPolicy= //input[@type='checkbox']
	
	@FindBy(xpath="//input[@type='checkbox']") public WebElement checkBox;
	
	@FindBy(xpath="//input[@type='submit']") public WebElement continueButton;
	
	
	public RegistrationPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver ,this);
		
	}
	
	public void ClickOnMyAccountOption()
	{
		myAccountOption.click();
	}
 
	public void ClickOnRegisterOption()
	{
		RegisterOption.click();
	}
	
	public void EnterFirstName()
	{
		firstName.sendKeys("Ashish");
	}
	
	public void EnterLastName()
	{
		lastName.sendKeys("Ashish");
	}
	
	public void EnterEmailId(String uName)
	{
		emailId.sendKeys(uName);
	}
	
	public void EntertelephoneNumber()
	{
		telephoneNumber.sendKeys("9568545522");
	}
	
	public void EnterPassword()
	{
		passWord.sendKeys("Ashish@1234");
		
	}
	
	public void EnterConfirmPassword()
	{
		ConfiremassWord.sendKeys("Ashish@1234");
	}
	
	public void ClickOnCheckBox()
	{
		checkBox.click();
	}
	
	// continueButton
	public void ClickOnContinueButton()
	{
		continueButton.click();
	}

}
