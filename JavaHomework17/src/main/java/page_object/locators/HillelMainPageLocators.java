package page_object.locators;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class HillelMainPageLocators {
    public static final SelenideElement LOGIN_BTN = $x("//*[@class='site-nav-btn -lms']");
}