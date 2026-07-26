package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.HomePage;
import pages.LoginPage;

public class TC4LogoutUserTest  extends BaseClass {

    @Test
    public void verifyLogoutUser() {

        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);

        // Step 3: Verify that home page is visible successfully
        Assert.assertTrue(
                homePage.isHomePageDisplayed(),
                "Home page is not displayed."
        );

        // Step 4: Click on 'Signup / Login' button
        homePage.clickSignupLogin();

        // Step 5: Verify 'Login to your account' is visible
        Assert.assertTrue(
                loginPage.isLoginPageDisplayed(),
                "'Login to your account' heading is not displayed."
        );

        // Step 6 & 7: Login with valid credentials
        loginPage.login("johndoe1@mail.com", "johndoe1");

        // Step 8: Verify user is logged in
        Assert.assertTrue(
                homePage.isLoggedInAsDisplayed(),
                "User is not logged in."
        );

        // Step 9: Click Logout
        homePage.clickLogout();

        // Step 10: Verify user is navigated to Login page
        Assert.assertTrue(
                loginPage.isLoginPageDisplayed(),
                "User is not navigated to Login page after logout."
        );
    }
}