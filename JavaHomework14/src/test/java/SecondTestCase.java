import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SecondTestCase {
    public static final String URL = "https://the-internet.herokuapp.com/login";
    public static  final  String URL_AFTER_SUCCESS_LOGIN = "https://the-internet.herokuapp.com/secure";
    public static final String PASSWORD = "SuperSecretPassword!";
    public static final String UNSUCCESSFUL_LOGIN_NAME_ALERT_TEXT = "Your username is invalid!";
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

    @Test(groups = "SecondTestCase", description = "Check unsuccessful login with empty username field")
    public void  secondTestcase(){
        webDriver.get(URL);

        loginNameField = webDriver.findElement(By.id("username"));
        loginNameField.click();
        loginNameField.clear();

        passwordField = webDriver.findElement(By.id("password"));
        passwordField.click();
        passwordField.clear();
        passwordField.sendKeys(PASSWORD);

        loginButton = webDriver.findElement(By.className("radius"));
        loginButton.click();

        unsuccessfulSignInAlertTitle = webDriver.findElement(By.id("flash"));

        assertNotEquals(webDriver.getCurrentUrl(), URL_AFTER_SUCCESS_LOGIN);
        assertTrue(unsuccessfulSignInAlertTitle.isDisplayed());
        assertTrue(unsuccessfulSignInAlertTitle.getText().contains(UNSUCCESSFUL_LOGIN_NAME_ALERT_TEXT));
    }

    @AfterClass
    public void tearDown(){
        webDriver.quit();
    }
}