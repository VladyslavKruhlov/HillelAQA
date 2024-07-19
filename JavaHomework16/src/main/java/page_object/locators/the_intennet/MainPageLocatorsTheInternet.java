package page_object.locators.the_intennet;

import org.openqa.selenium.By;

public class MainPageLocatorsTheInternet {
    public static final By MAIN_TITLE_TEXT = By.xpath("//*[@class='heading' and text()='Welcome to the-internet']");
    public static final By LIST_OF_FUNCTIONS = By.xpath("//h2[text()='Available Examples']");
    public static final By ADD_REMOVE_ELEMENTS_REDIRECT = By.xpath("//*[text()='Add/Remove Elements' and @href='/add_remove_elements/']");
}