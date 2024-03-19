package Tests;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import POJO.Browser;
import POM.SearchPage;

public class SearchProductsTests extends Browser{
	
	
	
	@Test
	public void searchValidProduct() throws InterruptedException, EncryptedDocumentException, IOException
	{
		LoginTest loginTest=new LoginTest();
		loginTest.loginwithValidCredentials();
		SearchPage searchPage=new SearchPage(driver);
		searchPage.EnterProductName("HP");
		searchPage.ClickOnsearchIcon();
		String productCriterial=driver.findElement(By.xpath("//div[@id='content']/h2")).getText();
		Assert.assertEquals("Products meeting the search criteria",productCriterial);
	}
	
	@Test
	public void searchInValidProduct() throws InterruptedException, EncryptedDocumentException, IOException
	{
		LoginTest loginTest=new LoginTest();
		loginTest.loginwithValidCredentials();
		SearchPage searchPage=new SearchPage(driver);
		searchPage.EnterProductName("Honda");
		searchPage.ClickOnsearchIcon();
		String productCriterial=driver.findElement(By.xpath("//div[@id='content']/h2")).getText();
		Assert.assertEquals("Products meeting the search criteria",productCriterial);
	}

}
