package navigation;

import base.BaseTests;
import org.testng.annotations.Test;

public class NavigationTests extends BaseTests {

    @Test
    public void testNavigation() throws InterruptedException {
        homepage.clickDymanicLoading().clickLinkExample1();
        getWindowManager().goBack();
        getWindowManager().refreshPage();
        getWindowManager().goForward();
        getWindowManager().goTo("https://google.com");
    }
}
