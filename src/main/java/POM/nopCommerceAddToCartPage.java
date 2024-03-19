package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


public class nopCommerceAddToCartPage {
	public WebDriver driver;
	public WebDriverWait wait;
	
	@FindBy(xpath="//input[@id='product_enteredQuantity_4']") public WebElement quantity;
	
	@FindBy(xpath="//button[text()='Add to cart']") public WebElement addToCartButton;
	
	@FindBy(xpath="//p[@class='content']") public WebElement addToCartSuccessMessage;
	
	@FindBy(xpath="//li[@id='topcartlink']") public WebElement shoppingCartOption;
	
	@FindBy(xpath="//button[@class='button-2 product-box-add-to-cart-button']") public WebElement AddToCartButton1;
 
	public nopCommerceAddToCartPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver ,this);
		
	}
	
	public void EnterQuantityOfTheProduct(String Quantity)
	{
		quantity.clear();
		quantity.sendKeys(Quantity);
	}
	
	public void ClickOnAddToCartButton1()
	{
		AddToCartButton1.click();
		wait=new WebDriverWait(driver,Duration.ofSeconds(2000));
		wait.until(ExpectedConditions.visibilityOf(AddToCartButton1));
	} 
	
	public void ClickOnAddToCartButton()
	{
		addToCartButton.click();
		wait=new WebDriverWait(driver,Duration.ofSeconds(2000));
		wait.until(ExpectedConditions.visibilityOf(addToCartButton));
	}
	
	
	public void VerifySuccessMessage()
	{
		String successmsg=addToCartSuccessMessage.getText();
		System.out.println(successmsg);
		Assert.assertTrue(addToCartSuccessMessage.isDisplayed());
		wait=new WebDriverWait(driver,Duration.ofSeconds(2000));
		wait.until(ExpectedConditions.visibilityOf(addToCartSuccessMessage));
	}
}
