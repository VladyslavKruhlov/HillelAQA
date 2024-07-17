package page_object.pages.saucedemo;

import net.bytebuddy.pool.TypePool;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import page_object.locators.saucedemo.InventoryPageLocatorsSaucedemo;
import page_object.pages.BasePage;

import java.util.List;

import static org.testng.Assert.*;
import static page_object.Constants.*;

public class InventoryPageSaucedemo extends BasePage {
    public InventoryPageSaucedemo(WebDriver webDriver) {
        super(webDriver);
    }

    public InventoryPageSaucedemo checkSuccessfulLogin(){
        assertEquals(webDriver.getCurrentUrl(), URL_SAUCE_DEMO_INVENTORY);
        assertEquals(webDriver.findElement(InventoryPageLocatorsSaucedemo.INVENTORY_PAGE_LOGO).getText(), INVENTORY_PAGE_LOGO_TITLE);
        assertEquals(webDriver.findElement(InventoryPageLocatorsSaucedemo.INVENTORY_PAGE_PRODUCTS_SECTION).getText(), INVENTORY_PAGE_PRODUCTS_SECTION_TITLE);
        return this;
    }

    public InventoryPageSaucedemo clickToAddToCardButton(){
        assertTrue(webDriver.findElement(InventoryPageLocatorsSaucedemo.ADD_TO_CARD_BUTTON_FIRST).isDisplayed());
        assertEquals(webDriver.findElement(InventoryPageLocatorsSaucedemo.ADD_TO_CARD_BUTTON_FIRST).getText(), SAUCE_DEMO_ADD_TO_CARD_BUTTON);
        webDriver.findElement(InventoryPageLocatorsSaucedemo.ADD_TO_CARD_BUTTON_FIRST).click();
        return this;
    }

    public InventoryPageSaucedemo clickToRemoveFromCardButton(){
        assertTrue(webDriver.findElement(InventoryPageLocatorsSaucedemo.REMOVE_FROM_CARD_BUTTON_FIRST).isDisplayed());
        assertEquals(webDriver.findElement(InventoryPageLocatorsSaucedemo.REMOVE_FROM_CARD_BUTTON_FIRST).getText(), SAUCE_DEMO_REMOVE_BUTTON);
        webDriver.findElement(InventoryPageLocatorsSaucedemo.REMOVE_FROM_CARD_BUTTON_FIRST).click();
        return this;
    }

    public InventoryPageSaucedemo checkCardCounterAfterItemAdded(){
        assertTrue(webDriver.findElement(InventoryPageLocatorsSaucedemo.CARD_ICON).isDisplayed());
        assertTrue(webDriver.findElement(InventoryPageLocatorsSaucedemo.CARD_ITEM_COUNTER).isDisplayed());
        return this;
    }

    public InventoryPageSaucedemo checkCardCounterAfterItemRemoved(){
        assertTrue(webDriver.findElement(InventoryPageLocatorsSaucedemo.CARD_ICON).isDisplayed());
        List<WebElement> cartCounter = webDriver.findElements(InventoryPageLocatorsSaucedemo.CARD_ITEM_COUNTER);
        assertTrue(cartCounter.isEmpty());
        return this;
    }

    public InventoryPageSaucedemo checkChangeAddToCardButtonAfterItemAddToCard(){
        assertTrue(webDriver.findElement(InventoryPageLocatorsSaucedemo.REMOVE_FROM_CARD_BUTTON_FIRST).isDisplayed());
        assertEquals(webDriver.findElement(InventoryPageLocatorsSaucedemo.REMOVE_FROM_CARD_BUTTON_FIRST).getText(), SAUCE_DEMO_REMOVE_BUTTON);
        return this;
    }

    public InventoryPageSaucedemo checkRemoveCardButtonAfterItemRemoved(){
        assertTrue(webDriver.findElement(InventoryPageLocatorsSaucedemo.ADD_TO_CARD_BUTTON_FIRST).isDisplayed());
        assertEquals(webDriver.findElement(InventoryPageLocatorsSaucedemo.ADD_TO_CARD_BUTTON_FIRST).getText(), SAUCE_DEMO_ADD_TO_CARD_BUTTON);
        return this;
    }

    public String getCounterText(){
        return webDriver.findElement(InventoryPageLocatorsSaucedemo.CARD_ITEM_COUNTER).getText();
    }
}