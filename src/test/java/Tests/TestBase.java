package Tests;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.IWebTest;
import pages.LandingPage;

public class TestBase implements AutoCloseable
{
	private IWebTest _IWebTest;
	public TestBase()
	{
		_IWebTest = new IWebTest();
	}
	
	public LandingPage GetDriver()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        //CREATE NEW IWebTest
        _IWebTest.BaseWebDriver = driver;
        
        //SEND IWebTest to LandingPage
        return new LandingPage(_IWebTest);
	}

	@Override
	public void close() 
	{
		_IWebTest.BaseWebDriver.close();		
	}
	
	@Before
	public void setupTest() {
		
	}
	@After
	public void teardown() {
		
	}

}
