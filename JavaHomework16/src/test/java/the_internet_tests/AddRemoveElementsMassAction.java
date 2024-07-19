package the_internet_tests;

import base_test.BaseTest;
import org.testng.annotations.Test;
import page_object.pages.BasePage;
import page_object.pages.the_internet.MainPageTheInternet;

import static page_object.Constants.*;

public class AddRemoveElementsMassAction extends BaseTest {

    @Test(groups = "TheInternet", description = "Add/remove elements mass action")
    public void  addRemoveElementsMassAction(){
        new BasePage(webDriver).openUrl(URL_THE_INTERNET);
        new MainPageTheInternet(webDriver)
                .checkHomePage()
                .checkRedirectToAddRemovePage()
                .checkAddRemoveElementsPage()
                .addAndRemoveElements(3)
                .checkCountOfRemovedElementsAfterRemoving();
    }
}