package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.HomePage;
import pages.ProductsPage;

public class TC09_SearchProductTest extends BaseClass {

    @Test
    public void verifySearchProduct() {
    	// Initialize page objects
    	  HomePage homePage = new HomePage(driver);
          ProductsPage productsPage = new ProductsPage(driver);

        // Step 3: Verify that home page is visible successfully
        Assert.assertTrue(homePage.isHomePageDisplayed());

        // Step 4: Click on 'Products' button
        homePage.clickProducts();

        // Step 5: Verify user is navigated to ALL PRODUCTS page successfully
        Assert.assertTrue(productsPage.isProductsPageDisplayed());

        // Step 6: Enter product name in search input and click search button
        String productName = "Sleeveless";
        productsPage.searchProduct(productName);

        // Step 7: Verify 'SEARCHED PRODUCTS' is visible
        Assert.assertTrue(productsPage.isSearchedProductsDisplayed());

        // Step 8: Verify all the products related to search are visible
        Assert.assertTrue(productsPage.areSearchResultsRelevant(productName));
    }
}