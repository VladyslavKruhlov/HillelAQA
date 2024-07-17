package the_internet_tests;

import base_test.BaseTest;
import org.testng.annotations.Test;
import page_object.pages.BasePage;
import page_object.pages.the_internet.LoginPageTheInternet;
import static page_object.Constants.*;

public class SecondTestCase extends BaseTest {
    @Test(groups = "TheInternet", description = "Check unsuccessful login with empty username field")
    public void  secondTestcase() {
        new BasePage(webDriver).openUrl(URL_THE_INTERNET);
        new LoginPageTheInternet(webDriver)
                .enterPassword(PASSWORD_THE_INTERNET)
                .clickToLoginButtonWithError()
                .checkUnsuccessfulSignInAlertTitleForLoginName()
                .checkLogoutUrl();
    }
}