package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.HomePage;
import pages.TestCasesPage;

public class TC7TestCasesPageTest extends BaseClass {

    @Test
    public void verifyTestCasesPageNavigation() {

        HomePage homePage = new HomePage(driver);
        TestCasesPage testCasesPage = new TestCasesPage(driver);

        // Step 3
        Assert.assertTrue(
                homePage.isHomePageDisplayed(),
                "Home page is not displayed."
        );

        // Step 4
        homePage.clickTestCases();

        // Step 5
        Assert.assertTrue(
                testCasesPage.isTestCasesPageDisplayed(),
                "User is not navigated to Test Cases page."
        );
    }
}