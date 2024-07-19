package page_object.locators.the_intennet;

import org.openqa.selenium.By;

public class AddRemovePageLocatorsTheInternet {
    public static final By ADD_REMOVE_PAGE_TITLE_TEXT = By.xpath("//h3[text()='Add/Remove Elements']");
    public static final By ADD_ELEMENT_BUTTON = By.xpath("//button[@onclick='addElement()' and text()='Add Element']");
    public static final By REMOVE_ELEMENT_BUTTON = By.xpath("//button[@onclick='deleteElement()' and text()='Delete']");
    public static final String REMOVE_BUTTON_FOR_MASS_ACTION = "(//button[@onclick='deleteElement()' and text()='Delete'])";
}