package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.CartPage;
import pages.HomePage;
import pages.SubscriptionPage;


public class TC11Subscriptiontest extends BaseClass {

	@Test
	public void verifySubscriptionInCartPage() {

		HomePage homePage = new HomePage(driver);
		CartPage cartPage = new CartPage(driver);
		SubscriptionPage subscriptionPage = new SubscriptionPage(driver);

		// Step 3: Verify that home page is visible successfully
		Assert.assertTrue(homePage.isHomePageDisplayed());

		// Step 4: Click 'Cart' button
		homePage.clickCart();

		// Verify Cart page is displayed
		Assert.assertTrue(cartPage.isCartPageDisplayed());

		// Step 5: Scroll down to footer
		subscriptionPage.scrollToFooter();

		// Step 6: Verify text 'SUBSCRIPTION'
		Assert.assertTrue(subscriptionPage.isSubscriptionHeadingDisplayed());

		// Step 7: Enter email address and click arrow button
		subscriptionPage.subscribe("test123@gmail.com");

		// Step 8: Verify success message
		Assert.assertTrue(subscriptionPage.isSubscriptionSuccessful());
	}

}
