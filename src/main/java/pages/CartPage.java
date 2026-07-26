package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class CartPage extends BasePage {

	public CartPage(WebDriver driver) {
		super(driver);
	}

	private final By shoppingCartHeading = By.xpath("//li[@class='active' and text()='Shopping Cart']");
	private final By cartRows = By.xpath("//tr[contains(@id,'product')]");

	private final By productPrices = By.cssSelector(".cart_price p");

	private final By productQuantities = By.cssSelector(".cart_quantity button");

	private final By productTotals = By.cssSelector(".cart_total_price");

	public boolean isCartPageDisplayed() {
		return isDisplayed(shoppingCartHeading);
	}

	public boolean areTwoProductsDisplayed() {

		List<WebElement> products = driver.findElements(cartRows);

		return products.size() == 2;
	}

	public boolean verifyPrice() {

		List<WebElement> prices = driver.findElements(productPrices);

		for (WebElement price : prices) {

			if (price.getText().isEmpty()) {
				return false;
			}
		}

		return true;
	}

	public boolean verifyQuantity() {

		List<WebElement> quantities = driver.findElements(productQuantities);

		for (WebElement quantity : quantities) {

			if (quantity.getText().isEmpty()) {
				return false;
			}
		}

		return true;
	}

	public boolean verifyTotalPrice() {

		List<WebElement> totals = driver.findElements(productTotals);

		for (WebElement total : totals) {

			if (total.getText().isEmpty()) {
				return false;
			}
		}

		return true;
	}
}