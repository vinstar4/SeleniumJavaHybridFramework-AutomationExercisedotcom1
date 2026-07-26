package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.BasePage;

public class AccountCreatedPage extends BasePage {

    public AccountCreatedPage(WebDriver driver) {
        super(driver);
    }

    // ==========================
    // Locators
    // ==========================

    private final By accountCreatedHeading =
            By.cssSelector("[data-qa='account-created']");

    private final By continueButton =
            By.cssSelector("[data-qa='continue-button']");

    // ==========================
    // Validation Methods
    // ==========================

    public boolean isAccountCreatedDisplayed() {
        return isDisplayed(accountCreatedHeading);
    }

    public String getAccountCreatedHeading() {
        return getText(accountCreatedHeading);
    }

    // ==========================
    // Action Methods
    // ==========================

    public void clickContinue() {
        click(continueButton);
    }

}