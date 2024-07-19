package page_object.pages.the_internet;

import org.openqa.selenium.WebDriver;
import page_object.locators.the_intennet.MainPageLocatorsTheInternet;
import page_object.pages.BasePage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import static page_object.Constants.*;

public class MainPageTheInternet extends BasePage {

    public MainPageTheInternet(WebDriver webDriver) {
        super(webDriver);
    }

    public MainPageTheInternet checkHomePage(){
        assertEquals(webDriver.getCurrentUrl(), URL_THE_INTERNET);
        assertTrue(webDriver.findElement(MainPageLocatorsTheInternet.MAIN_TITLE_TEXT).isDisplayed());
        assertEquals(webDriver.findElement(MainPageLocatorsTheInternet.MAIN_TITLE_TEXT).getText(), THE_INTERNET_MAIN_PAGE);
        assertTrue(webDriver.findElement(MainPageLocatorsTheInternet.LIST_OF_FUNCTIONS).isDisplayed());
        assertEquals(webDriver.findElement(MainPageLocatorsTheInternet.LIST_OF_FUNCTIONS).getText(), THE_INTERNET_LIST_OF_FUNCTIONS);
        return this;
    }

    public AddRemoveElementsPage checkRedirectToAddRemovePage() {
        assertTrue(webDriver.findElement(MainPageLocatorsTheInternet.ADD_REMOVE_ELEMENTS_REDIRECT).isDisplayed());
        webDriver.findElement(MainPageLocatorsTheInternet.ADD_REMOVE_ELEMENTS_REDIRECT).click();
        return new AddRemoveElementsPage(webDriver);
    }
}