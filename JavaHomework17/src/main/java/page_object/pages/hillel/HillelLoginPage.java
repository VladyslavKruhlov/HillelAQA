package page_object.pages.hillel;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import org.example.DataGenerator;
import page_object.Constants;
import page_object.locators.HillelLoginPageLocators;

import java.time.Duration;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;
import static org.testng.Assert.assertEquals;
import static page_object.Constants.*;

public class HillelLoginPage {
    DataGenerator dataGenerator = new DataGenerator();

    private String myEmail;
    private String verifyCode;

    public String getMyEmail(){
        return myEmail;
    }

    public String getVerifyCode(){
        return verifyCode;
    }

    public HillelLoginPage checkLoginPage() {
        $(HillelLoginPageLocators.LOGIN_TITLE)
                .shouldBe(visible)
                .shouldHave(text(Constants.LOGIN_TITLE));
        return this;
    }

    public HillelLoginPage clickRegistrationButton() {
        $(HillelLoginPageLocators.REGISTRATION_BTN)
                .shouldBe(visible)
                .should(clickable)
                .click();
        return this;
    }

    public HillelLoginPage enterName() {
        $(HillelLoginPageLocators.NAME_FIELD)
                .shouldBe(visible)
                .should(clickable)
                .setValue(NAME);
        return this;
    }

    public HillelLoginPage enterSurname() {
        $(HillelLoginPageLocators.SURNAME_FIELD)
                .shouldBe(visible)
                .should(clickable)
                .setValue(NAME);
        return this;
    }

    public HillelLoginPage clickToDataCheckbox() {
        $(HillelLoginPageLocators.MY_DATA_CHECKBOX)
                .shouldBe(visible)
                .should(clickable)
                .click();
        return this;
    }

    public HillelLoginPage clickToAgreementCheckbox() {
        $(HillelLoginPageLocators.PUBLIC_OFFER_CHECKBOX)
                .shouldBe(visible)
                .should(clickable)
                .click();
        return this;
    }

    public HillelLoginPage clickToNextButton() {
        $(HillelLoginPageLocators.NEXT_BTN)
                .shouldBe(visible)
                .should(clickable)
                .click();
        return this;
    }

    public HillelLoginPage enterPhone() {
        $(HillelLoginPageLocators.PHONE_FIELD)
                .shouldBe(visible, Duration.ofSeconds(3))
                .should(clickable)
                .setValue(dataGenerator.phoneGenerator());
        return this;
    }

    public HillelLoginPage enterMail() {
        String generatedEmail = dataGenerator.mailGenerator();
        this.myEmail = generatedEmail;
        $(HillelLoginPageLocators.MAIL_FIELD)
                .shouldBe(visible, Duration.ofSeconds(3))
                .should(clickable)
                .setValue(generatedEmail);
        return this;
    }

    public HillelLoginPage enterPassword() {
        $(HillelLoginPageLocators.PASS_FIELD)
                .shouldBe(visible, Duration.ofSeconds(3))
                .should(clickable)
                .setValue(PASS);
        return this;
    }

    public HillelLoginPage enterConfirmPassword() {
        $(HillelLoginPageLocators.CONFIRM_PASS_FIELD)
                .shouldBe(visible, Duration.ofSeconds(3))
                .should(clickable)
                .setValue(PASS);
        return this;
    }

    public HillelLoginPage enterVerificationCode() {
        $(HillelLoginPageLocators.VERIFY_CODE_FIELD)
                .shouldBe(visible)
                .should(clickable)
                .setValue(getVerifyCode());
        return this;
    }

    public HillelLoginPage clickToSignUpButton() {
        $(HillelLoginPageLocators.SIGN_UP_BTN)
                .shouldBe(visible)
                .should(clickable)
                .click();
        return this;
    }
    public HillelLoginPage checkSuccessfulRegistrationUrl() throws InterruptedException {
        Thread.sleep(3000);
        assertEquals(WebDriverRunner.url(), URL_HILLEL_AFTER_REGISTRATION);
        return this;
    }

    public HillelLoginPage openEmail() throws InterruptedException {
        executeJavaScript("window.open('');");
        switchTo().window(1);
        open(URL_MAILINATOR);
        Thread.sleep(8000);

        $(HillelLoginPageLocators.INPUT_FIELD)
                .shouldBe(visible, Duration.ofSeconds(5))
                .setValue(getMyEmail())
                .pressEnter();

        $(HillelLoginPageLocators.MAILINATOR_MAIL)
                .shouldBe(visible, Duration.ofSeconds(5))
                .click();
        return this;
    }

    public HillelLoginPage getCodeFromMailinator() throws InterruptedException {
        switchTo().frame("html_msg_body");
        SelenideElement h1 = $(HillelLoginPageLocators.CONFIRM_CODE_TITLE);
        executeJavaScript("arguments[0].scrollIntoView(true);", h1);

        this.verifyCode = HillelLoginPageLocators.MAILINATOR_CODE.getText();

        switchTo().defaultContent();
        switchTo().window(0);
        return this;
    }
}