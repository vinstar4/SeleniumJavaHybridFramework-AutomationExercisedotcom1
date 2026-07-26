package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.BasePage;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    // ==========================
    // Header
    // ==========================

    private final By logo =
            By.cssSelector("header .logo a");

    private final By home =
            By.cssSelector("header a[href='/']");

    private final By products =
            By.cssSelector("header a[href='/products']");

    private final By cart =
            By.cssSelector("header a[href='/view_cart']");

    private final By signupLogin =
            By.cssSelector("header a[href='/login']");

    private final By testCases =
            By.cssSelector("header a[href='/test_cases']");

    private final By apiTesting =
            By.cssSelector("header a[href='/api_list']");

    private final By contactUs =
            By.cssSelector("header a[href='/contact_us']");
    
    private final By loggedInAs =
            By.xpath("//a[contains(.,'Logged in as')]");

    private final By deleteAccount =
            By.cssSelector("a[href='/delete_account']");
    
    private final By logout = By.cssSelector("a[href='/logout']");
    


    // ==========================
    // Home Page
    // ==========================

    private final By homeHeading =
            By.xpath("//h2[text()='Features Items']");
    
   // private final By contactUs = By.cssSelector("a[href='/contact_us']");


    // ==========================
    // Validation Methods
    // ==========================

    public boolean isHomePageDisplayed() {
        return waitForVisible(homeHeading).isDisplayed();
    }

    public String getHomeHeading() {
        return getText(homeHeading);
    }
    
    public boolean isLoggedInAsDisplayed() {
        return isDisplayed(loggedInAs);
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
    
    public void clickLogout() {
        click(logout);
    }
    
 // ==========================
 // Action Methods
 // ==========================

 public void clickDeleteAccount() {
     click(deleteAccount);
 }
 
 
	

}