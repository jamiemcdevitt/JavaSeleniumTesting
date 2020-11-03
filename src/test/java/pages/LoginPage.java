package pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePageNavigator  
{
    private By EmailAddressTextBox = By.id("email");
    private By PasswordTextBox = By.id("passwd");
    private By LoginButton = By.id("SubmitLogin");
    
    public LoginPage(IWebTest webTest) { super(webTest);}
    {

    }
    public LoginPage EnterEmail(String emailText)
    {
    	_extension.EnterText(EmailAddressTextBox, WebDriver, emailText);
        return this;
    }
    public LoginPage EnterPassword(String passwordText)
    {
    	_extension.EnterText(PasswordTextBox, WebDriver, passwordText);
        return this;
    }
    public LoginPage ClickSubmit()
    {
    	_extension.ClickPageButton(LoginButton, WebDriver);
        return this;
    }

}
