package page_object.pages.the_internet;

import org.openqa.selenium.WebDriver;
import page_object.locators.the_intennet.HomePageLocatorsTheInternet;
import page_object.pages.BasePage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import static page_object.Constants.*;

public class HomePageTheInternet extends BasePage {
    public HomePageTheInternet(WebDriver webDriver) {
        super(webDriver);
    }

    public HomePageTheInternet checkSuccessSignInUrl(){
        assertEquals(webDriver.getCurrentUrl(), URL_THE_INTERNET_AFTER_SUCCESS_LOGIN);
        return this;
    }
    public HomePageTheInternet checkSignInMessage() {
        assertTrue(webDriver.findElement(HomePageLocatorsTheInternet.SIGN_IN_ALERT_TITLE).isDisplayed());
        assertTrue(webDriver.findElement(HomePageLocatorsTheInternet.SIGN_IN_ALERT_TITLE).getText().contains(THE_INTERNET_SUCCESSFUL_LOGIN_NAME_ALERT_TEXT));
        return this;
    }

    public LoginPageTheInternet clickToLogoutButton(){
        assertTrue(webDriver.findElement(HomePageLocatorsTheInternet.LOGOUT_BUTTON).isDisplayed());
        webDriver.findElement(HomePageLocatorsTheInternet.LOGOUT_BUTTON).click();
        return new LoginPageTheInternet(webDriver);
    }
}