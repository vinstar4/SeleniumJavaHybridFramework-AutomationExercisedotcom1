package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.BasePage;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
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
    // Login Form
    // ==========================

    private final By loginHeading = By.xpath("//div[@class='login-form']/h2");

    private final By loginEmail = By.cssSelector("input[data-qa='login-email']");

    private final By loginPassword = By.cssSelector("input[data-qa='login-password']");

    private final By loginButton = By.cssSelector("button[data-qa='login-button']");

    private final By loginError = By.cssSelector("form[action='/login'] p");
    // ==========================
    // Signup Form
    // ==========================

    private final By signupHeading = By.xpath("//div[@class='signup-form']/h2");

    private final By signupName = By.cssSelector("input[data-qa='signup-name']");

    private final By signupEmail = By.cssSelector("input[data-qa='signup-email']");

    private final By signupButton = By.cssSelector("button[data-qa='signup-button']");

    private final By signupError =
            By.xpath("//div[@class='signup-form']//p");
    // ==========================
    // Footer
    // ==========================

    private final By subscribeEmail = By.id("susbscribe_email");

    private final By subscribeButton = By.id("subscribe");

    // ==========================
    // Validation Methods
    // ==========================

    public boolean isLoginPageDisplayed() {
        return waitForVisible(loginHeading).isDisplayed();
    }

    public String getLoginHeading() {
        return getText(loginHeading);
    }

    public String getSignupHeading() {
        return getText(signupHeading);
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
    // Login Methods
    // ==========================

    public void enterLoginEmail(String email) {
        type(loginEmail, email);
    }

    public void enterLoginPassword(String password) {
        type(loginPassword, password);
    }

    public void clickLoginButton() {
        click(loginButton);
    }

    public void login(String email, String password) {
        enterLoginEmail(email);
        enterLoginPassword(password);
        clickLoginButton();
    }

    // ==========================
    // Signup Methods
    // ==========================

    public void enterSignupName(String name) {
        type(signupName, name);
    }

    public void enterSignupEmail(String email) {
        type(signupEmail, email);
    }

    public void clickSignupButton() {
        click(signupButton);
    }

    public void signup(String name, String email) {
        enterSignupName(name);
        enterSignupEmail(email);
        clickSignupButton();
    }

    // ==========================
    // Footer Methods
    // ==========================

    public void enterSubscriptionEmail(String email) {
        type(subscribeEmail, email);
    }

    public void clickSubscribe() {
        click(subscribeButton);
    }
    
    //login error methods
    public boolean isLoginErrorDisplayed() {
        return isDisplayed(loginError);
    }

    public String getLoginErrorMessage() {
        return getText(loginError);
    }
    
    //signup errors
    public boolean isSignupErrorDisplayed() {
        return isDisplayed(signupError);
    }

    public String getSignupErrorMessage() {
        return getText(signupError);
    }
    
    

}