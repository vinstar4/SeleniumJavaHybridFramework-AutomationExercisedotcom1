package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.HomePage;
import pages.LoginPage;

public class TC5RegisterUserWithExistingEmailTest extends BaseClass {

    @Test
    public void verifyRegisterUserWithExistingEmail() {

        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);

        // Step 3: Verify home page is displayed
        Assert.assertTrue(
                homePage.isHomePageDisplayed(),
                "Home page is not displayed."
        );

        // Step 4: Click Signup / Login
        homePage.clickSignupLogin();

        // Step 5: Verify New User Signup! is visible
        Assert.assertEquals(
                loginPage.getSignupHeading(),
                "New User Signup!",
                "Signup heading is incorrect."
        );

        // Step 6 & 7: Enter existing name/email and click Signup
        loginPage.signup("John", "johndoe1@mail.com");

        // Step 8: Verify error message
        Assert.assertTrue(
                loginPage.isSignupErrorDisplayed(),
                "Signup error message is not displayed."
        );

        Assert.assertEquals(
                loginPage.getSignupErrorMessage(),
                "Email Address already exist!",
                "Incorrect signup error message."
        );
    }
}