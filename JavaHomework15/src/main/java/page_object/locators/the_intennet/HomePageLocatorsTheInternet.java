package page_object.locators.the_intennet;

import org.openqa.selenium.By;

public class HomePageLocatorsTheInternet {
    public static final By SIGN_IN_ALERT_TITLE = By.id("flash-messages");
    public static final By LOGOUT_BUTTON = By.cssSelector("a.button.secondary.radius[href*='/logout']");
}