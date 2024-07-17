package page_object.pages.saucedemo;

import org.openqa.selenium.WebDriver;
import page_object.locators.saucedemo.LoginPageLocatorsSaucedemo;
import page_object.pages.BasePage;

import static org.testng.Assert.assertTrue;

public class LoginPageSaucedemo extends BasePage {
    public LoginPageSaucedemo(WebDriver webDriver) {
        super(webDriver);
    }

    public LoginPageSaucedemo enterLogin(String userName) {
        assertTrue(webDriver.findElement(LoginPageLocatorsSaucedemo.LOGIN_NAME_FIELD).isDisplayed());
        webDriver.findElement(LoginPageLocatorsSaucedemo.LOGIN_NAME_FIELD).click();
        webDriver.findElement(LoginPageLocatorsSaucedemo.LOGIN_NAME_FIELD).clear();
        webDriver.findElement(LoginPageLocatorsSaucedemo.LOGIN_NAME_FIELD).sendKeys(userName);
        return this;
    }
    public LoginPageSaucedemo enterPassword(String password) {
        assertTrue(webDriver.findElement(LoginPageLocatorsSaucedemo.PASSWORD_FIELD).isDisplayed());
        webDriver.findElement(LoginPageLocatorsSaucedemo.PASSWORD_FIELD).click();
        webDriver.findElement(LoginPageLocatorsSaucedemo.PASSWORD_FIELD).clear();
        webDriver.findElement(LoginPageLocatorsSaucedemo.PASSWORD_FIELD).sendKeys(password);
        return this;
    }

    public InventoryPageSaucedemo clickToLoginButton() {
        assertTrue(webDriver.findElement(LoginPageLocatorsSaucedemo.LOGIN_BUTTON).isDisplayed());
        webDriver.findElement(LoginPageLocatorsSaucedemo.LOGIN_BUTTON).click();
        return new InventoryPageSaucedemo(webDriver);
    }
}