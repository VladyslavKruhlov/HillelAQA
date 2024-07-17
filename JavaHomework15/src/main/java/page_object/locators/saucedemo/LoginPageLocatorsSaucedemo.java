package page_object.locators.saucedemo;

import org.openqa.selenium.By;

public class LoginPageLocatorsSaucedemo {
        public static final By LOGIN_NAME_FIELD = By.xpath("//input[@id='user-name']");
        public static final By PASSWORD_FIELD = By.xpath("//input[@name='password']");
        public static final By LOGIN_BUTTON = By.xpath("//input[@data-test='login-button']");
}