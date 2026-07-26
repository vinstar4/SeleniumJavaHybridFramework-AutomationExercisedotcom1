package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.HomePage;
import pages.ProductDetailsPage;
import pages.ProductsPage;

public class TC8VerifyAllProductsAndProductDetailPageTest extends BaseClass {

    @Test
    public void verifyAllProductsAndProductDetailPage() {

        HomePage homePage = new HomePage(driver);
        ProductsPage productsPage = new ProductsPage(driver);
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(driver);

        // Step 3
        Assert.assertTrue(
                homePage.isHomePageDisplayed(),
                "Home page is not displayed."
        );

        // Step 4
        homePage.clickProducts();

        // Step 5
        Assert.assertTrue(
                productsPage.isProductsPageDisplayed(),
                "Products page is not displayed."
        );

        // Step 6
        Assert.assertTrue(
                productsPage.isProductsListDisplayed(),
                "Products list is not displayed."
        );

        // Step 7
        productsPage.clickFirstViewProduct();

        // Step 8
        Assert.assertTrue(
                productDetailsPage.isProductDetailsPageDisplayed(),
                "Product details page is not displayed."
        );

        // Step 9
        Assert.assertTrue(productDetailsPage.isProductNameDisplayed());
        Assert.assertTrue(productDetailsPage.isCategoryDisplayed());
        Assert.assertTrue(productDetailsPage.isPriceDisplayed());
        Assert.assertTrue(productDetailsPage.isAvailabilityDisplayed());
        Assert.assertTrue(productDetailsPage.isConditionDisplayed());
        Assert.assertTrue(productDetailsPage.isBrandDisplayed());
    }
}