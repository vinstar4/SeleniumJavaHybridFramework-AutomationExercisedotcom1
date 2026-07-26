package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.BasePage;

public class AccountDeletedPage extends BasePage {

    public AccountDeletedPage(WebDriver driver) {
        super(driver);
    }

    // ==========================
    // Locators
    // ==========================

    private final By accountDeletedHeading =
            By.cssSelector("[data-qa='account-deleted']");

    private final By continueButton =
            By.cssSelector("[data-qa='continue-button']");

    // ==========================
    // Validation Methods
    // ==========================

    public boolean isAccountDeletedDisplayed() {
        return isDisplayed(accountDeletedHeading);
    }

    public String getAccountDeletedHeading() {
        return getText(accountDeletedHeading);
    }

    // ==========================
    // Action Methods
    // ==========================

    public void clickContinue() {
        click(continueButton);
    }

}