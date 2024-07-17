package page_object.pages.the_internet;

import org.openqa.selenium.WebDriver;
import page_object.locators.the_intennet.LoginPageLocatorsTheInternet;
import page_object.pages.BasePage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import static page_object.Constants.*;

public class LoginPageTheInternet extends BasePage {
    public LoginPageTheInternet(WebDriver webDriver) {
        super(webDriver);
    }

    public LoginPageTheInternet enterLogin(String userName) {
        assertTrue(webDriver.findElement(LoginPageLocatorsTheInternet.LOGIN_NAME_FIELD).isDisplayed());
        webDriver.findElement(LoginPageLocatorsTheInternet.LOGIN_NAME_FIELD).click();
        webDriver.findElement(LoginPageLocatorsTheInternet.LOGIN_NAME_FIELD).clear();
        webDriver.findElement(LoginPageLocatorsTheInternet.LOGIN_NAME_FIELD).sendKeys(userName);
        return this;
    }

    public LoginPageTheInternet enterPassword(String password) {
        assertTrue(webDriver.findElement(LoginPageLocatorsTheInternet.PASSWORD_FIELD).isDisplayed());
        webDriver.findElement(LoginPageLocatorsTheInternet.PASSWORD_FIELD).click();
        webDriver.findElement(LoginPageLocatorsTheInternet.PASSWORD_FIELD).clear();
        webDriver.findElement(LoginPageLocatorsTheInternet.PASSWORD_FIELD).sendKeys(password);
        return this;
    }

    public HomePageTheInternet clickToLoginButton() {
        assertTrue(webDriver.findElement(LoginPageLocatorsTheInternet.LOGIN_BUTTON).isDisplayed());
        webDriver.findElement(LoginPageLocatorsTheInternet.LOGIN_BUTTON).click();
        return new HomePageTheInternet(webDriver);
    }

    public LoginPageTheInternet clickToLoginButtonWithError() {
        assertTrue(webDriver.findElement(LoginPageLocatorsTheInternet.LOGIN_BUTTON).isDisplayed());
        webDriver.findElement(LoginPageLocatorsTheInternet.LOGIN_BUTTON).click();
        return this;
    }

    public LoginPageTheInternet checkLogoutMessage(){
        assertTrue(webDriver.findElement(LoginPageLocatorsTheInternet.LOGOUT_ALERT_TITLE).isDisplayed());
        assertTrue(webDriver.findElement(LoginPageLocatorsTheInternet.LOGOUT_ALERT_TITLE).getText().contains(THE_INTERNET_SUCCESSFUL_LOGOUT_ALERT_TEXT));
        return this;
    }

    public LoginPageTheInternet checkLogoutUrl(){
        assertEquals(webDriver.getCurrentUrl(), URL_THE_INTERNET);
        return this;
    }

    public LoginPageTheInternet checkUnsuccessfulSignInAlertTitleForLoginName(){
        assertTrue(webDriver.findElement(LoginPageLocatorsTheInternet.UNSUCCESSFUL_ALERT_TEXT).isDisplayed());
        assertTrue(webDriver.findElement(LoginPageLocatorsTheInternet.UNSUCCESSFUL_ALERT_TEXT).getText().contains(THE_INTERNET_UNSUCCESSFUL_LOGIN_NAME_ALERT_TEXT));
        return this;
    }

    public LoginPageTheInternet checkUnsuccessfulSignInAlertTitleForPassword(){
        assertTrue(webDriver.findElement(LoginPageLocatorsTheInternet.UNSUCCESSFUL_ALERT_TEXT).isDisplayed());
        assertTrue(webDriver.findElement(LoginPageLocatorsTheInternet.UNSUCCESSFUL_ALERT_TEXT).getText().contains(THE_INTERNET_UNSUCCESSFUL_PASSWORD_ALERT_TEXT));
        return this;
    }
}