package POM;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class nopCommerce_RegistrationPage {
	public WebDriverWait wait;
	
public WebDriver driver;
	
	@FindBy(xpath="//a[@class='ico-register']") public WebElement register;
	
	@FindBy(id="gender-male") public WebElement GenderMale;
	@FindBy(id="gender-female") public WebElement GenderFemale;
	
	@FindBy(xpath="//input[@id='FirstName']") public WebElement firstName;
	
	@FindBy(xpath="//input[@id='LastName']") public WebElement lastName; 
	
	@FindBy(xpath="//select[@name='DateOfBirthDay']") public WebElement Day;
	
	@FindBy(xpath="//select[@name='DateOfBirthMonth']") public WebElement Month;
	
	@FindBy(xpath="//select[@name='DateOfBirthYear']") public WebElement Year;
	
	@FindBy(xpath="//input[@id='input-telephone']") public WebElement telephoneNumber;
	
	@FindBy(id="Email") public WebElement emailid;
	
	@FindBy(id="Company") public WebElement companyName;
	
	@FindBy(xpath="//input[@id='Password']") public WebElement passWord;
	
	@FindBy(xpath="//input[@id='ConfirmPassword']") public WebElement ConfiremassWord;
	
	@FindBy(xpath="//button[@name='register-button']") public WebElement registerButtonSubmit;
	
	// //div[text()='Your registration completed']
	
	@FindBy(xpath="//div[text()='Your registration completed']") public WebElement result;
	
	@FindBy(xpath="//div[@class='message-error validation-summary-errors']") public WebElement Textmessage;
	
	public nopCommerce_RegistrationPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver ,this);
		
	}
	
	public void ClickOnRegisterOption()
	{
		register.click();
	}
 
	public void ClickOnGenderMaleOption()
	{
		GenderMale.click();
	}
	
	public void ClickOnGenderFemaleOption()
	{
		GenderMale.click();
	}
	
	public void EnterFirstName()
	{
		firstName.sendKeys("Ashish");
	}
	
	public void EnterLastName()
	{
		lastName.sendKeys("Bahurupi");
	}
	
	public void EnterDateOFBirth()
	{
		Select select=new Select(Day);
		select.selectByValue("21");
	
		Select select1=new Select(Month);
		select1.selectByValue("7");
		
		Select select2=new Select(Year);
		select2.selectByValue("2000");
		
		
	}
	
	public void EntertelephoneNumber()
	{
		telephoneNumber.sendKeys("9568545522");
	}
	
	
	public void EnterEmailId(String uName)
	{
		emailid.sendKeys(uName);
	}
	
	
	// companyName
	public void EnterCompanyName()
	{
		companyName.sendKeys("Sigma");
		
	}
	
	public void EnterPassword()
	{
		passWord.sendKeys("Ashish@1234");
		
	}
	
	public void EnterConfirmPassword()
	{
		ConfiremassWord.sendKeys("Ashish@1234");
	}
	// continueButton
	public void ClickOnContinueButton()
	{
		registerButtonSubmit.click();
	}

	public void ClickOnregisterButtonSubmit() {

		registerButtonSubmit.click();
	}

	public void CaptureResultText() {

		String resultText=result.getText();
		
		String Expected="Your registration completed";
		System.out.println("resultText");
		
		Assert.assertEquals(resultText,Expected);
	}

	// Textmessage
	
	public void CaptureTextmessageResultText() {

		String resultText=Textmessage.getText();
		
		String Expected="The specified email already exists";
		System.out.println("resultText");
		Assert.assertEquals(resultText,Expected);
	}

}
