package driver_manager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class DriverManager {
    private static WebDriver webDriver;
    public DriverManager(){};
    public static WebDriver getDriver(){
        if (webDriver==null){
            WebDriverManager.chromedriver().setup();
            webDriver = new ChromeDriver();
            webDriver.manage().window().maximize();
            webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            webDriver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        }
        return webDriver;
    }
    public static void quitDriver(){
        if (webDriver!=null){
            webDriver.quit();
            webDriver = null;
        }
    }
}