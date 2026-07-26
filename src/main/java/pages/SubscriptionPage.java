package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import base.BasePage;

public class SubscriptionPage extends BasePage {

    private final By subscriptionHeading =
            By.xpath("//h2[text()='Subscription']");

    private final By emailTextBox =
            By.id("susbscribe_email");

    private final By subscribeButton =
            By.id("subscribe");

    private final By successMessage =
            By.xpath("//div[@class='alert-success alert']");

    public SubscriptionPage(WebDriver driver) {
        super(driver);
    }

    public void scrollToFooter() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
    }

    public boolean isSubscriptionHeadingDisplayed() {
        return isDisplayed(subscriptionHeading);
    }

    public void subscribe(String email) {
        type(emailTextBox, email);
        click(subscribeButton);
    }

    public boolean isSubscriptionSuccessful() {
        return isDisplayed(successMessage);
    }
}