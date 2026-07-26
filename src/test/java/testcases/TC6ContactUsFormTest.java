package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.ContactUsPage;
import pages.HomePage;

public class TC6ContactUsFormTest extends BaseClass {

    @Test
    public void verifyContactUsForm() {

        HomePage homePage = new HomePage(driver);
        ContactUsPage contactPage = new ContactUsPage(driver);

        // Step 3
        Assert.assertTrue(
                homePage.isHomePageDisplayed(),
                "Home page is not displayed."
        );

        // Step 4
        homePage.clickContactUs();

        // Step 5
        Assert.assertTrue(
                contactPage.isContactUsPageDisplayed(),
                "Contact Us page is not displayed."
        );

        // Step 6
        contactPage.fillContactForm(
                "John Doe",
                "john@test.com",
                "Automation Test",
                "This is a Selenium automation test."
        );

        // Step 7
        contactPage.uploadFile("C:\\Users\\vinay\\Desktop\\sample.txt");

     // Step 8
        contactPage.clickSubmit();

        // Step 9
        contactPage.acceptAlert();

        // Step 10
        Assert.assertEquals(
                contactPage.getSuccessMessage(),
                "Success! Your details have been submitted successfully.",
                "Success message is incorrect."
        );

        // Step 11
        contactPage.clickHome();

        Assert.assertTrue(
                homePage.isHomePageDisplayed(),
                "Home page is not displayed after clicking Home."
        );
    }
}