package POJO;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class Browser {

public static WebDriver driver;
	
    @BeforeClass
	public void launchbrowser()
	{
		driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
	}
	
	
//	@AfterClass
//	public void QuitBrower()
//	{
//		driver.quit();
//	}

}
