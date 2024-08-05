package page_object.pages.hillel;

import com.codeborne.selenide.WebDriverRunner;
import page_object.locators.HillelMainPageLocators;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static org.testng.Assert.assertEquals;
import static page_object.Constants.URL_HILLEL;

public class HillelMainPage{

    public HillelMainPage checkMainPageUrl() {
        assertEquals(WebDriverRunner.url(), URL_HILLEL);
        return this;
    }

    public HillelLoginPage clickToLoginButton() {
        $(HillelMainPageLocators.LOGIN_BTN)
                .shouldBe(visible)
                .should(clickable)
                .click();
        return new HillelLoginPage();
    }
}