package the_internet_tests;

import base_test.BaseTest;
import org.testng.annotations.Test;
import page_object.pages.BasePage;
import page_object.pages.the_internet.LoginPageTheInternet;
import static page_object.Constants.*;

public class FirstTestCase extends BaseTest {

    @Test(groups = "TheInternet", description = "Check successful logout")
    public void  firstTestcase(){
        new BasePage(webDriver).openUrl(URL_THE_INTERNET);
        new LoginPageTheInternet(webDriver)
                .enterLogin(LOGIN_NAME_THE_INTERNET)
                .enterPassword(PASSWORD_THE_INTERNET)
                .clickToLoginButton()
                .checkSuccessSignInUrl()
                .checkSignInMessage()
                .clickToLogoutButton()
                .checkLogoutUrl()
                .checkLogoutMessage();
    }
}