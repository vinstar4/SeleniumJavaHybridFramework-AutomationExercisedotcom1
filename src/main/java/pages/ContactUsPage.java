package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.BasePage;

public class ContactUsPage extends BasePage {

    public ContactUsPage(WebDriver driver) {
        super(driver);
    }

    // ==========================
    // Locators
    // ==========================

    private final By getInTouchHeading =
            By.xpath("//h2[text()='Get In Touch']");

    private final By name =
            By.cssSelector("input[data-qa='name']");

    private final By email =
            By.cssSelector("input[data-qa='email']");

    private final By subject =
            By.cssSelector("input[data-qa='subject']");

    private final By message =
            By.cssSelector("textarea[data-qa='message']");

    private final By uploadFile =
            By.cssSelector("input[name='upload_file']");

    private final By submitButton =
            By.cssSelector("input[data-qa='submit-button']");

    private final By successMessage =
            By.cssSelector(".status.alert.alert-success");

    private final By homeButton =
            By.cssSelector("a.btn.btn-success");

    // ==========================
    // Validation Methods
    // ==========================

    public boolean isContactUsPageDisplayed() {
        return isDisplayed(getInTouchHeading);
    }

    public String getSuccessMessage() {
        return getText(successMessage);
    }

    // ==========================
    // Form Methods
    // ==========================

    public void enterName(String text) {
        type(name, text);
    }

    public void enterEmail(String text) {
        type(email, text);
    }

    public void enterSubject(String text) {
        type(subject, text);
    }

    public void enterMessage(String text) {
        type(message, text);
    }

    public void uploadFile(String filePath) {
        type(uploadFile, filePath);
    }

    public void clickSubmit() {
        click(submitButton);
    }

    public void clickHome() {
        click(homeButton);
    }

    public void fillContactForm(String name,
                                String email,
                                String subject,
                                String message) {

        enterName(name);
        enterEmail(email);
        enterSubject(subject);
        enterMessage(message);
    }
}