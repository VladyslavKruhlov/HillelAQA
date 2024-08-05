package hillel_test;

import org.testng.annotations.Test;
import page_object.pages.hillel.HillelMainPage;

import static com.codeborne.selenide.Selenide.open;
import static page_object.Constants.*;

public class RegistrationTest {
    @Test(groups = "Hillel", description = "Registration")
    public void  registration() throws InterruptedException {
        open(URL_HILLEL);
        new HillelMainPage()
                .checkMainPageUrl()
                .clickToLoginButton()
                .checkLoginPage()
                .clickRegistrationButton()
                .enterName()
                .enterSurname()
                .clickToDataCheckbox()
                .clickToAgreementCheckbox()
                .clickToNextButton()
                .enterPhone()
                .enterMail()
                .enterPassword()
                .enterConfirmPassword()
                .clickToNextButton()
                .openEmail()
                .getCodeFromMailinator()
                .enterVerificationCode()
                .clickToSignUpButton()
                .checkSuccessfulRegistrationUrl();
    }
}