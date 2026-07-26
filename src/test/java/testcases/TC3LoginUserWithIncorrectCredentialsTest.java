package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.HomePage;
import pages.LoginPage;

public class TC3LoginUserWithIncorrectCredentialsTest extends BaseClass {

    @Test
    public void verifyLoginUserWithIncorrectEmailAndPassword() {

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

        // Step 6 & 7: Enter incorrect email address and password
        loginPage.login("invalid@test.com", "wrongpassword");

        // Step 8: Verify error message
        Assert.assertTrue(
                loginPage.isLoginErrorDisplayed(),
                "Login error message is not displayed."
        );

        Assert.assertEquals(
                loginPage.getLoginErrorMessage(),
                "Your email or password is incorrect!",
                "Incorrect login error message."
        );
    }
}