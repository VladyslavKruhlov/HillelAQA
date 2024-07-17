package saucedemo_tests;

import base_test.BaseTest;
import org.testng.annotations.Test;
import page_object.pages.BasePage;
import page_object.pages.saucedemo.InventoryPageSaucedemo;
import page_object.pages.saucedemo.LoginPageSaucedemo;

import static org.testng.Assert.assertEquals;
import static page_object.Constants.*;

public class ThirdTestCase extends BaseTest {

    @Test(groups = "Saucedemo", description = "Check remove item to card")
    public void  thirdTestcase(){
        new BasePage(webDriver).openUrl(URL_SAUCE_DEMO_SITE);
        new LoginPageSaucedemo(webDriver)
                .enterLogin(LOGIN_NAME_SAUCE_DEMO_SITE)
                .enterPassword(PASSWORD_SAUCE_DEMO_SITE)
                .clickToLoginButton()
                .checkSuccessfulLogin()
                .checkCardCounterAfterItemRemoved()
                .clickToAddToCardButton()
                .checkChangeAddToCardButtonAfterItemAddToCard()
                .checkCardCounterAfterItemAdded();

        String currentCardCounter = new InventoryPageSaucedemo(webDriver).getCounterText();

        assertEquals(currentCardCounter, "1");

        new InventoryPageSaucedemo(webDriver)
                .clickToRemoveFromCardButton()
                .checkRemoveCardButtonAfterItemRemoved()
                .checkCardCounterAfterItemRemoved();
    }
}