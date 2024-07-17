package page_object.locators.the_intennet;

import org.openqa.selenium.By;

public class LoginPageLocatorsTheInternet {
    public static final By LOGIN_NAME_FIELD = By.id("username");
    public static final By PASSWORD_FIELD = By.id("password");
    public static final By LOGIN_BUTTON = By.className("radius");
    public static final By LOGOUT_ALERT_TITLE = By.id("flash-messages");
    public static final By UNSUCCESSFUL_ALERT_TEXT = By.id("flash");
}