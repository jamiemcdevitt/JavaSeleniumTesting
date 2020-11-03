package pages;
import extensions.byExtensions;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePageNavigator 
{
    protected IWebTest Test;
    public WebDriver WebDriver;
    public byExtensions _extension;

	public BasePageNavigator(IWebTest webTest)
    {
        Test = webTest;
        WebDriver = Test.BaseWebDriver;
        PageFactory.initElements(WebDriver, this);
        _extension = new byExtensions();
    }

    public LandingPage NavigateToLandingPage()
    {
        WebDriver.navigate().to("http://automationpractice.com/");
        return new LandingPage(Test);
    }
    public BasePageNavigator CheckElementText(By pageElement, String expectedText)
    {
        String actualText = _extension.GetText(pageElement, WebDriver);
        Assert.assertEquals(expectedText, actualText);
        return this;
    }
}
