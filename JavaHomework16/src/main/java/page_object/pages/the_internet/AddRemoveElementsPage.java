package page_object.pages.the_internet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import page_object.locators.the_intennet.AddRemovePageLocatorsTheInternet;
import page_object.pages.BasePage;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.*;
import static page_object.Constants.*;
import static page_object.locators.the_intennet.AddRemovePageLocatorsTheInternet.*;

public class AddRemoveElementsPage extends BasePage {
    public AddRemoveElementsPage(WebDriver webDriver) {
        super(webDriver);
    }
    public AddRemoveElementsPage checkAddRemoveElementsPage(){
        assertEquals(webDriver.getCurrentUrl(), URL_THE_INTERNET_AFTER_REDIRECTION);
        assertTrue(webDriver.findElement(AddRemovePageLocatorsTheInternet.ADD_REMOVE_PAGE_TITLE_TEXT).isDisplayed());
        assertEquals(webDriver.findElement(AddRemovePageLocatorsTheInternet.ADD_REMOVE_PAGE_TITLE_TEXT).getText(), THE_INTERNET_ADD_REMOVE_PAGE_TITLE);
        return this;
    }

    public AddRemoveElementsPage checkCountOfRemovedElementsAfterRemoving(){
        boolean removeElementsFound = webDriver.findElements(REMOVE_ELEMENT_BUTTON).isEmpty();
        assertTrue(removeElementsFound);
        return this;
    }

    public AddRemoveElementsPage addAndRemoveElements(int i){
        clickToAddElementsButton(i);
        checkCountOfRemovedElements(i);
        clickToRemoveElementsButton(i);
        return this;
    }

    private AddRemoveElementsPage clickToAddElementsButton(int n){
        assertTrue(webDriver.findElement(AddRemovePageLocatorsTheInternet.ADD_ELEMENT_BUTTON).isDisplayed());
        assertEquals(webDriver.findElement(AddRemovePageLocatorsTheInternet.ADD_ELEMENT_BUTTON).getText(), ADD_ELEMENT_BUTTON_TITLE);

        for (int i=1; i<=n; i++){
            webDriver.findElement(AddRemovePageLocatorsTheInternet.ADD_ELEMENT_BUTTON).click();
        }
        return this;
    }

    private AddRemoveElementsPage checkCountOfRemovedElements(int n){
        List<WebElement> removedElements = new ArrayList<>();
        for (int i=1; i<=n; i++){
            assertTrue(webDriver.findElement(gerDeleteButtonLocators("["+n+"]")).isDisplayed());
            removedElements.add(webDriver.findElement(gerDeleteButtonLocators("["+n+"]")));
        }
        assertEquals(removedElements.size(), n);
        return this;
    }

    private By gerDeleteButtonLocators(String string){
        return By.xpath(REMOVE_BUTTON_FOR_MASS_ACTION + string);
    }

    private AddRemoveElementsPage clickToRemoveElementsButton(int n){
        for (int i=n; i>=1; i--){
            assertTrue(webDriver.findElement(gerDeleteButtonLocators("["+i+"]")).isDisplayed());
            assertEquals(webDriver.findElement(gerDeleteButtonLocators("["+i+"]")).getText(), DELETE_ELEMENT_BUTTON_TITLE);
            webDriver.findElement(gerDeleteButtonLocators("["+i+"]")).click();
        }
        return this;
    }

    public AddRemoveElementsPage clickToAddElementsButton(){
        assertTrue(webDriver.findElement(AddRemovePageLocatorsTheInternet.ADD_ELEMENT_BUTTON).isDisplayed());
        assertEquals(webDriver.findElement(AddRemovePageLocatorsTheInternet.ADD_ELEMENT_BUTTON).getText(), ADD_ELEMENT_BUTTON_TITLE);
        webDriver.findElement(AddRemovePageLocatorsTheInternet.ADD_ELEMENT_BUTTON).click();
        return this;
    }

    public AddRemoveElementsPage clickToRemoveElementsButton(){
        assertTrue(webDriver.findElement(REMOVE_ELEMENT_BUTTON).isDisplayed());
        assertEquals(webDriver.findElement(REMOVE_ELEMENT_BUTTON).getText(), DELETE_ELEMENT_BUTTON_TITLE);
        webDriver.findElement(REMOVE_ELEMENT_BUTTON).click();
        return this;
    }
}