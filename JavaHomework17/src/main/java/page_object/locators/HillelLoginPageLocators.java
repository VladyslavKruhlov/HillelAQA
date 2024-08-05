package page_object.locators;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class HillelLoginPageLocators {
    // FIRST STEP REGISTRATION
    public static final SelenideElement LOGIN_TITLE = $x("//*[@class='page-login__title page-access-title']");
    public static final SelenideElement REGISTRATION_BTN = $x("//*[@class='hi-button hi-button--secondary ng-star-inserted']");
    public static final SelenideElement NAME_FIELD = $x("//*[@id='contacts_first_name']");
    public static final SelenideElement SURNAME_FIELD = $x("//*[@id='contacts_last_name']");
    public static final SelenideElement MY_DATA_CHECKBOX = $x("//*[@class='registration-details-form__field ng-tns-c74-2 ng-star-inserted']");
    public static final SelenideElement PUBLIC_OFFER_CHECKBOX = $x("//*[@class='registration-details-form__field ng-tns-c74-3 ng-star-inserted']");
    public static final SelenideElement NEXT_BTN = $x("//*[@class='hi-button ng-star-inserted']");

    // SECOND STEP REGISTRATION
    public static final SelenideElement PHONE_FIELD = $x("//*[@id='contacts_phone']");
    public static final SelenideElement MAIL_FIELD = $x("//*[@id='contacts_email']");
    public static final SelenideElement PASS_FIELD = $x("//*[@id='password-confirm-new']");
    public static final SelenideElement CONFIRM_PASS_FIELD = $x("//*[@id='password-confirm-confirm']");

    // THIRD STEP REGISTRATION
    public static final SelenideElement VERIFY_CODE_FIELD = $x("//*[@id='confirm-email-code']");
    public static final SelenideElement SIGN_UP_BTN = $x("//*[@class='hi-button hi-button--accent ng-star-inserted']");

    // MAILINATOR
    public static final SelenideElement INPUT_FIELD = $x("//*[@id='search' and @placeholder ='Enter Public Mailinator Inbox']");
    public static final SelenideElement MAILINATOR_MAIL = $x("//*[@class='ng-binding' and normalize-space(text())='Hillel IT School']");
    public static final SelenideElement MAILINATOR_CODE =$x("(//h1)[2]");
    public static final SelenideElement CONFIRM_CODE_TITLE = $x("//p[contains(text(), 'Confirmation code')]");
}