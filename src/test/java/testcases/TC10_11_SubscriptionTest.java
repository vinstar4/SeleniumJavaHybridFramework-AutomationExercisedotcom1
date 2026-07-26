package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.CartPage;
import pages.HomePage;
import pages.SubscriptionPage;

public class TC10_11_SubscriptionTest extends BaseClass {

    @Test
    public void verifySubscriptionInHomePage() {

        HomePage homePage = new HomePage(driver);
        SubscriptionPage subscriptionPage = new SubscriptionPage(driver);

        // Step 3: Verify that home page is visible successfully
        Assert.assertTrue(homePage.isHomePageDisplayed());

        // Step 4: Scroll down to footer
        subscriptionPage.scrollToFooter();

        // Step 5: Verify text 'SUBSCRIPTION'
        Assert.assertTrue(subscriptionPage.isSubscriptionHeadingDisplayed());

        // Step 6: Enter email address and click arrow button
        subscriptionPage.subscribe("test123@gmail.com");

        // Step 7: Verify success message
        Assert.assertTrue(subscriptionPage.isSubscriptionSuccessful());
    }
        

    
    
}