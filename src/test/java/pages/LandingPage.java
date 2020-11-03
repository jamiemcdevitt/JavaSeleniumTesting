package pages;

import org.openqa.selenium.By;

public class LandingPage extends BasePageNavigator 
{
    //Buttons
    private By LoginButton = By.className("login");
    private By AccountButton = By.className("account");
    //Tabs
    private By WomenTab = By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/a");
    //Links
    private By TshitHyperlink = By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/ul/li[1]/ul/li[1]/a");

    private By PageHeader = By.className("cat-name");
    
	public LandingPage(IWebTest webTest) { super(webTest);}
    {

    }
    public LoginPage ClickLoginButton()
    {
    	_extension.ClickPageButton(LoginButton, WebDriver);
        return new LoginPage(Test);
    }
    
    public void doSomething(boolean... optionalFlag) {
        //default to "false"
        //boolean flag = (optionalFlag.length >= 1) ? optionalFlag[0] : false;
    }
    
    public MyAccount LoginToApplication()
    {
    	return LoginToApplication("TestUser@TestUser.ie", "3YkBPukfdKwnMg");
    }
    public MyAccount LoginToApplication(String _email, String _password)
    {
        ClickLoginButton()
            .EnterEmail(_email)
            .EnterPassword(_password)
            .ClickSubmit();
        return new MyAccount(Test);
    }
    public LandingPage CheckAccountUser(String user)
    {
        CheckElementText(AccountButton, user);
        return this;
    }
    public LandingPage NavigateToWomenTshirt()
    {
    	_extension.HoverOverPageElement(WomenTab, WebDriver);
    	_extension.ClickPageButton(TshitHyperlink, WebDriver);
        return this;
    }
    public LandingPage CheckHeader(String header)
    {
        CheckElementText(PageHeader, header);
        return this;
    }
}