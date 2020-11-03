package Tests;

import org.junit.*;

public class SmokeTest extends TestBase {

	@BeforeClass
	public static void setupClass() {

	}		
	
	@Test
	public void Test_ValidateMyAccountPage() 
	{
		try(TestBase testBase = new TestBase())
		{
		testBase
			.GetDriver()
			.NavigateToLandingPage()
			.LoginToApplication()
            .CheckHeader("MY ACCOUNT");
		}		
	}
	@Test
	public void Test_CheckAccountButtonUserDetails() 
	{
		try(TestBase testBase = new TestBase())
		{
		testBase
			.GetDriver()
			.NavigateToLandingPage()
			.LoginToApplication()
            .ClickHomeButton()
            .CheckAccountUser("TestUserFirstName TestUserLastName");
		}		
	}
	@Test
	public void Test_ValidateWomenTshirt() 
	{
		try(TestBase testBase = new TestBase())
		{
		testBase
			.GetDriver()
			.NavigateToLandingPage()
            .NavigateToWomenTshirt()
            .CheckHeader("T-SHIRTS ");
		}		
	}
}
