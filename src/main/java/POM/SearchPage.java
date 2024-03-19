package POM;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
	
	
	public  WebDriver driver;
	@FindBy(xpath="//input[@name='search']") public WebElement searchBar;
	
	@FindBy(xpath="//button[@class='btn btn-default btn-lg']") public WebElement searchIcon;
	
	public SearchPage(WebDriver driver)
	{
		this.driver=driver;
		
		PageFactory.initElements(driver,this);
	}

	
	public void EnterProductName(String productName)
	{
		searchBar.sendKeys(productName);
	}
	
	public void ClickOnsearchIcon()
	{
		searchIcon.click();
	}
}
