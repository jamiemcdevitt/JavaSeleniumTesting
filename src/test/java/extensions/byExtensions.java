package extensions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class byExtensions {
	
	public void ClickPageButton(By pageElement, WebDriver driver)
    {
    	driver.findElement(pageElement).click();
    }
	public String GetText(By pageElement, WebDriver driver)
    {
    	return driver.findElement(pageElement).getText();
    }
	public void EnterText(By pageElement, WebDriver driver, String text)
    {
    	driver.findElement(pageElement).sendKeys(text);;
    }
    public void HoverOverPageElement(By pageElement, WebDriver driver)
    {
        WebElement element = driver.findElement(pageElement);
        Actions action = new Actions(driver);
        
        action.moveToElement(element).perform();
    }
}
