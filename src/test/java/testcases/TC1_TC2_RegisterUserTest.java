package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.AccountCreatedPage;
import pages.AccountDeletedPage;
import pages.HomePage;
import pages.LoginPage;
import pages.SignupPage;

public class TC1_TC2_RegisterUserTest extends BaseClass {

	@Test
	public void TC1verifyRegisterUser() {
		/*
		 * Test Case 1: Register User 1. Launch browser 2. Navigate to url
		 * 'http://automationexercise.com' 3. Verify that home page is visible
		 * successfully 4. Click on 'Signup / Login' button 5. Verify 'New User Signup!'
		 * is visible 6. Enter name and email address 7. Click 'Signup' button 8. Verify
		 * that 'ENTER ACCOUNT INFORMATION' is visible 9. Fill details: Title, Name,
		 * Email, Password, Date of birth 10. Select checkbox 'Sign up for our
		 * newsletter!' 11. Select checkbox 'Receive special offers from our partners!'
		 * 12. Fill details: First name, Last name, Company, Address, Address2, Country,
		 * State, City, Zipcode, Mobile Number 13. Click 'Create Account button' 14.
		 * Verify that 'ACCOUNT CREATED!' is visible 15. Click 'Continue' button 16.
		 * Verify that 'Logged in as username' is visible 17. Click 'Delete Account'
		 * button 18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue'
		 * button
		 */

		// Step 1 & 2 are handled by BaseClass

		// Step 3: Verify home page is visible successfully
		HomePage homePage = new HomePage(driver);
		Assert.assertTrue(homePage.isHomePageDisplayed());

		// Step 4: Click on 'Signup / Login' button
		homePage.clickSignupLogin();

		// Step 5: Verify 'New User Signup!' is visible
		LoginPage loginPage = new LoginPage(driver);
		Assert.assertEquals(loginPage.getSignupHeading(), "New User Signup!");

		// Step 6: Enter name and email address
		String email = "user" + System.currentTimeMillis() + "@mail.com";

		loginPage.enterSignupName("John Doe");
		loginPage.enterSignupEmail(email);

		// Step 7: Click 'Signup' button
		loginPage.clickSignupButton();

		// Step 8: Verify 'ENTER ACCOUNT INFORMATION' is visible
		SignupPage signupPage = new SignupPage(driver);
		Assert.assertTrue(signupPage.isSignupPageDisplayed());
		signupPage.removeAds();

		// Step 9: Fill account information
		signupPage.selectTitleMr();
		signupPage.enterPassword("Password123");
		signupPage.selectDay("10");
		signupPage.selectMonth("May");
		signupPage.selectYear("1995");

		// Step 10: Select checkboxes
		signupPage.clickNewsletter();
		signupPage.clickSpecialOffers();

		// Step 11: Fill address information
		signupPage.enterFirstName("John");
		signupPage.enterLastName("Doe");
		signupPage.enterCompany("ABC Pvt Ltd");
		signupPage.enterAddress("Street 1");
		signupPage.enterAddress2("Apartment 101");
		signupPage.selectCountry("India");
		signupPage.enterState("Maharashtra");
		signupPage.enterCity("Mumbai");
		signupPage.enterZipcode("400001");
		signupPage.enterMobileNumber("9876543210");

		// Step 12: Click 'Create Account'
		signupPage.clickCreateAccount();

		// Step 13: Verify 'ACCOUNT CREATED!' is visible
		AccountCreatedPage accountCreatedPage = new AccountCreatedPage(driver);
		Assert.assertTrue(accountCreatedPage.isAccountCreatedDisplayed());

		// Step 14: Click 'Continue' button
		accountCreatedPage.clickContinue();
		// Step 15: Verify 'Logged in as username' is visible
		homePage = new HomePage(driver);
		System.out.println("a");
		Assert.assertTrue(homePage.isLoggedInAsDisplayed());
		System.out.println("ab");

		// Step 16: Click 'Delete Account'
		homePage.clickDeleteAccount();
		System.out.println("abc");

		// Step 17: Verify 'ACCOUNT DELETED!' is visible
		AccountDeletedPage accountDeletedPage = new AccountDeletedPage(driver);
		Assert.assertTrue(accountDeletedPage.isAccountDeletedDisplayed());

		// Step 18: Click 'Continue' button
		accountDeletedPage.clickContinue();
	}
}