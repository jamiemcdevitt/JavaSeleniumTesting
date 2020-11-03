package Tests;

import org.junit.Test;

public class BvtTest {
	@Test
	public void Test_ValidateMyAccountPage2() 
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
	public void Test_CheckAccountButtonUserDetails2() 
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
	public void Test_ValidateWomenTshirt2() 
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
