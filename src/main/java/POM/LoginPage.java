package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import POJO.Browser;

public class LoginPage {

	public WebDriver driver;
	
	@FindBy(xpath="//a[@href='https://tutorialsninja.com/demo/index.php?route=account/login']") public WebElement loginOption;
	
	@FindBy(xpath="//input[@id='input-email']") public WebElement emailId;
	
	@FindBy(xpath="//input[@id='input-password']") public WebElement password;
	
	@FindBy(xpath="//input[@type='submit']") public WebElement Loginbutton;
	
	@FindBy(xpath="//a[@href='https://tutorialsninja.com/demo/index.php?route=account/logout']") public WebElement LogoutOption;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}

	public void ClikOnloginOption()
	{
		loginOption.click();
	}
	
	public void EnterEmailId(String uName)
	{
		emailId.sendKeys(uName);
	}
	
	public void EnterPassWord(String npassword) {
		password.sendKeys(npassword);
	}
	
	public void ClickOnLoginbutton()
	{
		Loginbutton.click();
	}

	// LogoutOption
	
	public void ClickOnLogoutOption()
	{
		LogoutOption.click();
	}

}
