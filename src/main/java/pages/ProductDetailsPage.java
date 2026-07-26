package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.BasePage;

public class ProductDetailsPage extends BasePage {

    public ProductDetailsPage(WebDriver driver) {
        super(driver);
    }

    // Main container
    private final By productInformation =
            By.cssSelector(".product-information");

    // Product details
    private final By productName =
            By.cssSelector(".product-information h2");

    private final By category =
            By.xpath("//div[@class='product-information']/p[contains(text(),'Category')]");

    private final By price =
            By.cssSelector(".product-information span span");

    private final By availability =
            By.xpath("//p[b[text()='Availability:']]");

    private final By condition =
            By.xpath("//p[b[text()='Condition:']]");

    private final By brand =
            By.xpath("//p[b[text()='Brand:']]");

    // Validation

    public boolean isProductDetailsPageDisplayed() {
        return isDisplayed(productInformation);
    }

    public boolean isProductNameDisplayed() {
        return isDisplayed(productName);
    }

    public boolean isCategoryDisplayed() {
        return isDisplayed(category);
    }

    public boolean isPriceDisplayed() {
        return isDisplayed(price);
    }

    public boolean isAvailabilityDisplayed() {
        return isDisplayed(availability);
    }

    public boolean isConditionDisplayed() {
        return isDisplayed(condition);
    }

    public boolean isBrandDisplayed() {
        return isDisplayed(brand);
    }
}