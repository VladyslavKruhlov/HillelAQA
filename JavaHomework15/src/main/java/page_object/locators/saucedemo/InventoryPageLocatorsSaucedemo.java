package page_object.locators.saucedemo;

import org.openqa.selenium.By;

public class InventoryPageLocatorsSaucedemo {
    public static final By ADD_TO_CARD_BUTTON_FIRST = By.xpath("(//*[text()='Add to cart'])[1]");
    public static final By REMOVE_FROM_CARD_BUTTON_FIRST = By.xpath("(//*[text()='Remove'])[1]");
    public static final By CARD_ICON = By.xpath("//*[@data-test='shopping-cart-link']");
    public static final By CARD_ITEM_COUNTER = By.xpath("//*[@data-test='shopping-cart-badge']");
    public static final By INVENTORY_PAGE_LOGO = By.xpath("//*[@class='app_logo' and text()='Swag Labs']");
    public static final By INVENTORY_PAGE_PRODUCTS_SECTION = By.xpath("//*[@data-test ='title' and text()='Products']");
}