package pages;

import org.openqa.selenium.WebDriver;

import base.BasePage;

public class TestCasesPage extends BasePage {

    public TestCasesPage(WebDriver driver) {
        super(driver);
    }

    public boolean isTestCasesPageDisplayed() {
        return driver.getCurrentUrl()
                .equals("https://automationexercise.com/test_cases");
    }

}