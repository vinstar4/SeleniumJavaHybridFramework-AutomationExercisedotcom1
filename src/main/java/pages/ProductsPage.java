package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import base.BasePage;

public class ProductsPage extends BasePage {

    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    // ==========================
    // Locators
    // ==========================

    private final By productsGrid =
            By.cssSelector(".features_items");

    private final By firstViewProduct =
            By.cssSelector("a[href='/product_details/1']");
    
    private final By searchBox = By.id("search_product");

    private final By searchButton = By.id("submit_search");

    private final By searchedProductsTitle =
            By.xpath("//h2[text()='Searched Products']");

    private final By productNames =
            By.cssSelector(".productinfo p");
   
    private final By firstProduct =
            By.xpath("(//div[@class='single-products'])[1]");

    private final By secondProduct =
            By.xpath("(//div[@class='single-products'])[2]");

    private final By firstAddToCartButton =
            By.xpath("(//div[@class='product-overlay']//a[@class='btn btn-default add-to-cart'])[1]");

    private final By secondAddToCartButton =
            By.xpath("(//div[@class='product-overlay']//a[@class='btn btn-default add-to-cart'])[2]");

    private final By continueShoppingButton =
            By.xpath("//button[text()='Continue Shopping']");

    private final By viewCartLink =
            By.xpath("//u[text()='View Cart']");

    // ==========================
    // Validation Methods
    // ==========================

    public boolean isProductsPageDisplayed() {
        return driver.getCurrentUrl()
                .equals("https://automationexercise.com/products");
    }

    public boolean isProductsListDisplayed() {
        return isDisplayed(productsGrid);
    }

    // ==========================
    // Action Methods
    // ==========================

    public void clickFirstViewProduct() {
        click(firstViewProduct);
    }
    
    public void searchProduct(String productName)
    {
        type(searchBox, productName);
        click(searchButton);
    }
    
    public boolean isSearchedProductsDisplayed()
    {
        return isDisplayed(searchedProductsTitle);
    }
    
    public boolean areSearchResultsRelevant(String searchText)
    {
        searchText = searchText.toLowerCase();

        List<WebElement> products = driver.findElements(productNames);

        for(WebElement product : products)
        {
            String productName = product.getText().toLowerCase();

            if(!productName.contains(searchText))
            {
                return false;
            }
        }

        return true;
    }
    
    public void hoverOverFirstProduct() {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(firstProduct)).perform();
    }

    public void clickFirstAddToCart() {
        click(firstAddToCartButton);
    }

    public void clickContinueShopping() {
        click(continueShoppingButton);
    }

    public void hoverOverSecondProduct() {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(secondProduct)).perform();
    }

    public void clickSecondAddToCart() {
        click(secondAddToCartButton);
    }

    public void clickViewCart() {
        click(viewCartLink);
    }

}