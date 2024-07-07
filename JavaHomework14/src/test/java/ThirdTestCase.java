import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertTrue;

public class ThirdTestCase {
    public static final String URL = "https://the-internet.herokuapp.com/login";
    public static  final  String URL_AFTER_SUCCESS_LOGIN = "https://the-internet.herokuapp.com/secure";
    public static final String LOGIN_NAME = "tomsmith";
    public static final String UNSUCCESSFUL_PASSWORD_ALERT_TEXT = "Your password is invalid!";
    public static WebElement loginNameField;
    public static WebElement passwordField;
    public static WebElement loginButton;
    public static WebElement unsuccessfulSignInAlertTitle;

    WebDriver webDriver;

    @BeforeClass
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
    }

    @Test(groups = "ThirdTestCase", description = "Check unsuccessful login with empty password field")
    public void  secondTestcase(){
        webDriver.get(URL);

        loginNameField = webDriver.findElement(By.id("username"));
        loginNameField.click();
        loginNameField.clear();
        loginNameField.sendKeys(LOGIN_NAME);

        passwordField = webDriver.findElement(By.id("password"));
        passwordField.click();
        passwordField.clear();

        loginButton = webDriver.findElement(By.className("radius"));
        loginButton.click();

        unsuccessfulSignInAlertTitle = webDriver.findElement(By.id("flash"));

        assertNotEquals(webDriver.getCurrentUrl(), URL_AFTER_SUCCESS_LOGIN);
        assertTrue(unsuccessfulSignInAlertTitle.isDisplayed());
        assertTrue(unsuccessfulSignInAlertTitle.getText().contains(UNSUCCESSFUL_PASSWORD_ALERT_TEXT));
    }

    @AfterClass
    public void tearDown(){
        webDriver.quit();
    }
}