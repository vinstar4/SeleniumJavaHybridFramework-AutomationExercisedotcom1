package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.CartPage;
import pages.HomePage;
import pages.ProductsPage;

public class TC12_AddProductsInCartTest extends BaseClass {

    @Test
    public void verifyAddProductsInCart() {

        HomePage homePage = new HomePage(driver);
        ProductsPage productsPage = new ProductsPage(driver);
        CartPage cartPage = new CartPage(driver);

        // Step 3
        Assert.assertTrue(homePage.isHomePageDisplayed());

        // Step 4
        homePage.clickProducts();
        productsPage.removeAds();

        // Step 5
      productsPage.hoverOverFirstProduct();
        productsPage.clickFirstAddToCart();

        // Step 6
        productsPage.clickContinueShopping();

        // Step 7
       productsPage.hoverOverSecondProduct();
        productsPage.clickSecondAddToCart();

        // Step 8
        productsPage.clickViewCart();

        // Step 9
        Assert.assertTrue(cartPage.areTwoProductsDisplayed());

        // Step 10
        Assert.assertTrue(cartPage.verifyPrice());
        Assert.assertTrue(cartPage.verifyQuantity());
        Assert.assertTrue(cartPage.verifyTotalPrice());
    }
}