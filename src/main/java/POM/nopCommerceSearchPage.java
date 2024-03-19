package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Utilities.ExplicitWaits;

public class nopCommerceSearchPage {
	
	public WebDriver driver;
	
	@FindBy(xpath="//input[@id='small-searchterms']") public WebElement searchBar;
	
	@FindBy(xpath="//button[text()='Search']") public WebElement searchIconButton;
 
	@FindBy(xpath="//a[text()='Apple MacBook Pro 13-inch']") public WebElement productName;
	
	@FindBy(xpath="//div[@class='no-result']") public WebElement noResult;
	
	public nopCommerceSearchPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver ,this);
	}
	
	public void EnterProductName(String product)
	{
		searchBar.sendKeys(product);
	}
	
	public void ClickOnSearchIconButton()
	{
		searchIconButton.click();
		
	}
	
	public void VerifyProductName()
	{
		String prodName=productName.getText();
		System.out.println(prodName);
	}
	
	public void VerifyProductNoResults()
	{
		String no_ResultText=noResult.getText();
		System.out.println(no_ResultText);
		String expectedResult="No products were found that matched your criteria.";
		Assert.assertEquals(no_ResultText,expectedResult);
	}
	
}
