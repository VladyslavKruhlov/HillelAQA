package saucedemo_tests;

import base_test.BaseTest;
import org.testng.annotations.Test;
import page_object.pages.BasePage;
import page_object.pages.saucedemo.LoginPageSaucedemo;
import static page_object.Constants.*;

public class FirstTestCase extends BaseTest {

    @Test(groups = "Saucedemo", description = "Check successful sign in")
    public void  firstTestcase(){
        new BasePage(webDriver).openUrl(URL_SAUCE_DEMO_SITE);
        new LoginPageSaucedemo(webDriver)
                .enterLogin(LOGIN_NAME_SAUCE_DEMO_SITE)
                .enterPassword(PASSWORD_SAUCE_DEMO_SITE)
                .clickToLoginButton()
                .checkSuccessfulLogin();
    }
}