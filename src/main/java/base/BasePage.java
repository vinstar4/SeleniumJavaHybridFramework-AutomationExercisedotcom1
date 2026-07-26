package base;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage
{
	public WebDriver driver;
	
	public WebDriverWait wait;
	
	public BasePage(WebDriver driver)
	{
		this.driver=driver;
		wait=new WebDriverWait(driver, Duration.ofSeconds(30));
	}
	
	public void type(By locator,String text)
	{
		WebElement element=waitForClickable(locator);
		
		element.clear();
		
		element.sendKeys(text);
		
		//driver.findElement(locator).sendKeys(text);
	}
	
	public void click(By locator)
	{
		
		WebElement element=waitForClickable(locator);
		
		element.click();
		
		//driver.findElement(locator).click();
	}
	
	public String getText(By locator)
	{
		String msg=driver.findElement(locator).getText();
		
		return msg;
	}
	
	public WebElement waitForClickable(By locator)
	{
		WebElement ele=wait.until(ExpectedConditions.elementToBeClickable(locator));
		
		return ele;
	}
	
	public WebElement waitForVisible(By locator)
	{
		WebElement ele=wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		
		return ele;
	}
	
	public boolean isDisplayed(By locator) {
	    return waitForVisible(locator).isDisplayed();
	}
	
	public void removeAds() {

	    JavascriptExecutor js = (JavascriptExecutor) driver;

	    js.executeScript(
	        "document.querySelectorAll('.grippy-host, iframe, ins.adsbygoogle').forEach(e => e.remove());"
	    );
	}
	
	public void acceptAlert() {
	    wait.until(ExpectedConditions.alertIsPresent());
	    driver.switchTo().alert().accept();
	}
	

}
