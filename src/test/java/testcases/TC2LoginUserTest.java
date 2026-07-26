package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.AccountDeletedPage;
import pages.HomePage;
import pages.LoginPage;

public class TC2LoginUserTest extends BaseTest {

    @Test
    public void verifyLoginUserWithCorrectEmailAndPassword() {

        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        AccountDeletedPage accountDeletedPage = new AccountDeletedPage(driver);

        // Verify Home Page
        Assert.assertTrue(homePage.isHomePageDisplayed(),
                "Home page is not displayed.");

        // Click Signup/Login
        homePage.clickSignupLogin();

        // Verify Login Page
        Assert.assertTrue(loginPage.isLoginToYourAccountVisible(),
                "Login page is not displayed.");

        // Login
        loginPage.enterEmail("abc@test.com");
        loginPage.enterPassword("password123");
        loginPage.clickLogin();

        // Verify Logged in
        Assert.assertTrue(homePage.isLoggedInAsDisplayed(),
                "User is not logged in.");

        // Delete Account
        homePage.clickDeleteAccount();

        // Verify Account Deleted
        Assert.assertTrue(accountDeletedPage.isAccountDeletedVisible(),
                "Account was not deleted successfully.");
    }
}