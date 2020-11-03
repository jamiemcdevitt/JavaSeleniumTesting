package pages;

import org.openqa.selenium.By;

public class MyAccount  extends BasePageNavigator  
{
    private By HomeButton = By.id("my-account");
    private By PageHeader = By.className("page-heading");
    
	public MyAccount(IWebTest webTest) { super(webTest);}
    {

    }
    public LandingPage ClickHomeButton()
    {
    	_extension.ClickPageButton(HomeButton, WebDriver);
        return new LandingPage(Test);
    }
    public MyAccount CheckHeader(String header)
    {
        CheckElementText(PageHeader, header);
        return this;
    }
}
