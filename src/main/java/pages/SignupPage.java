package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import base.BasePage;

public class SignupPage extends BasePage {

	public SignupPage(WebDriver driver) {
		super(driver);
	}

	// ==========================
	// Header
	// ==========================

	private final By logo = By.cssSelector("header .logo a");
	private final By home = By.cssSelector("header a[href='/']");
	private final By products = By.cssSelector("header a[href='/products']");
	private final By cart = By.cssSelector("header a[href='/view_cart']");
	private final By signupLogin = By.cssSelector("header a[href='/login']");
	private final By testCases = By.cssSelector("header a[href='/test_cases']");
	private final By apiTesting = By.cssSelector("header a[href='/api_list']");
	private final By contactUs = By.cssSelector("header a[href='/contact_us']");

	// ==========================
	// Account Information
	// ==========================

	private final By accountInformationHeading = By.xpath("//b[text()='Enter Account Information']");

	private final By titleMr = By.id("id_gender1");
	private final By titleMrs = By.id("id_gender2");

	private final By name = By.cssSelector("input[data-qa='name']");
	private final By email = By.cssSelector("input[data-qa='email']");
	private final By password = By.cssSelector("input[data-qa='password']");

	private final By day = By.id("days");
	private final By month = By.id("months");
	private final By year = By.id("years");

	private final By newsletter = By.id("newsletter");
	private final By specialOffers = By.id("optin");

	// ==========================
	// Address Information
	// ==========================

	private final By firstName = By.cssSelector("input[data-qa='first_name']");
	private final By lastName = By.cssSelector("input[data-qa='last_name']");
	private final By company = By.cssSelector("input[data-qa='company']");
	private final By address = By.cssSelector("input[data-qa='address']");
	private final By address2 = By.cssSelector("input[data-qa='address2']");

	private final By country = By.cssSelector("select[data-qa='country']");

	private final By state = By.cssSelector("input[data-qa='state']");
	private final By city = By.cssSelector("input[data-qa='city']");
	private final By zipcode = By.cssSelector("input[data-qa='zipcode']");
	private final By mobileNumber = By.cssSelector("input[data-qa='mobile_number']");

	private final By createAccountButton = By.cssSelector("button[data-qa='create-account']");

	// ==========================
	// Validation Methods
	// ==========================

	public boolean isSignupPageDisplayed() {
		return waitForVisible(accountInformationHeading).isDisplayed();
	}

	public String getAccountInformationHeading() {
		return getText(accountInformationHeading);
	}

	// ==========================
	// Header Methods
	// ==========================

	public void clickLogo() {
		click(logo);
	}

	public void clickHome() {
		click(home);
	}

	public void clickProducts() {
		click(products);
	}

	public void clickCart() {
		click(cart);
	}

	public void clickSignupLogin() {
		click(signupLogin);
	}

	public void clickTestCases() {
		click(testCases);
	}

	public void clickApiTesting() {
		click(apiTesting);
	}

	public void clickContactUs() {
		click(contactUs);
	}

	// ==========================
	// Account Information Methods
	// ==========================

	public void selectTitleMr() {
		click(titleMr);
	}

	public void selectTitleMrs() {
		click(titleMrs);
	}

	public void enterPassword(String value) {
		type(password, value);
	}

	public void selectDay(String value) {
		new Select(driver.findElement(day)).selectByVisibleText(value);
	}

	public void selectMonth(String value) {
		new Select(driver.findElement(month)).selectByVisibleText(value);
	}

	public void selectYear(String value) {
		new Select(driver.findElement(year)).selectByVisibleText(value);
	}

	public void clickNewsletter() {
		click(newsletter);
	}

	public void clickSpecialOffers() {
		click(specialOffers);
	}

	// ==========================
	// Address Information Methods
	// ==========================

	public void enterFirstName(String value) {
		type(firstName, value);
	}

	public void enterLastName(String value) {
		type(lastName, value);
	}

	public void enterCompany(String value) {
		type(company, value);
	}

	public void enterAddress(String value) {
		type(address, value);
	}

	public void enterAddress2(String value) {
		type(address2, value);
	}

	public void selectCountry(String value) {
		new Select(driver.findElement(country)).selectByVisibleText(value);
	}

	public void enterState(String value) {
		type(state, value);
	}

	public void enterCity(String value) {
		type(city, value);
	}

	public void enterZipcode(String value) {
		type(zipcode, value);
	}

	public void enterMobileNumber(String value) {
		type(mobileNumber, value);
	}

	public void clickCreateAccount() {
		click(createAccountButton);
	}

	// ==========================
	// Business Method
	// ==========================

	public void createAccount(String password, String day, String month, String year, String firstName, String lastName,
			String company, String address, String address2, String country, String state, String city, String zipcode,
			String mobileNumber) {

		selectTitleMr();
		enterPassword(password);

		selectDay(day);
		selectMonth(month);
		selectYear(year);

		clickNewsletter();
		clickSpecialOffers();

		enterFirstName(firstName);
		enterLastName(lastName);
		enterCompany(company);
		enterAddress(address);
		enterAddress2(address2);
		selectCountry(country);
		enterState(state);
		enterCity(city);
		enterZipcode(zipcode);
		enterMobileNumber(mobileNumber);

		clickCreateAccount();
	}
}