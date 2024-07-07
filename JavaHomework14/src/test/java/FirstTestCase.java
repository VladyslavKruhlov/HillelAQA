import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.testng.Assert.*;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FirstTestCase {
    public static final String URL = "https://the-internet.herokuapp.com/login";
    public static  final  String URL_AFTER_SUCCESS_LOGIN = "https://the-internet.herokuapp.com/secure";
    public static final String LOGIN_NAME = "tomsmith";
    public static final String PASSWORD = "SuperSecretPassword!";
    public static final String SUCCESSFUL_LOGIN_NAME_ALERT_TEXT = "You logged into a secure area!";
    public static final String SUCCESSFUL_LOGOUT_ALERT_TEXT = "You logged out of the secure area!";
    public static WebElement loginNameField;
    public static WebElement passwordField;
    public static WebElement loginButton;
    public static WebElement signInAlertTitle;
    public static WebElement logoutButton;
    public static WebElement logoutMessage;

    WebDriver webDriver;

    @BeforeClass
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
    }

    @Test(groups = "FirstTestCase", description = "Check successful logout")
    public void  firstTestcase(){
        webDriver.get(URL);

        loginNameField = webDriver.findElement(By.id("username"));
        loginNameField.click();
        loginNameField.clear();
        loginNameField.sendKeys(LOGIN_NAME);

        passwordField = webDriver.findElement(By.id("password"));
        passwordField.click();
        passwordField.clear();
        passwordField.sendKeys(PASSWORD);

        loginButton = webDriver.findElement(By.className("radius"));
        loginButton.click();

        signInAlertTitle = webDriver.findElement(By.id("flash"));

        assertEquals(webDriver.getCurrentUrl(), URL_AFTER_SUCCESS_LOGIN);
        assertTrue(signInAlertTitle.isDisplayed());
        assertTrue(signInAlertTitle.getText().contains(SUCCESSFUL_LOGIN_NAME_ALERT_TEXT));

        logoutButton = webDriver.findElement(By.cssSelector("a.button.secondary.radius[href*='/logout']"));
        logoutButton.click();

        assertEquals(webDriver.getCurrentUrl(), URL);

        logoutMessage = webDriver.findElement(By.id("flash-messages"));

        assertTrue(logoutMessage.isDisplayed());
        assertTrue(logoutMessage.getText().contains(SUCCESSFUL_LOGOUT_ALERT_TEXT));
    }

    @AfterClass
    public void tearDown(){
        webDriver.quit();
    }
}