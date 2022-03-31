package frontend;

import core.BaseTest;
import org.testng.annotations.Test;
import pages.frontend.SearchHTCPage;
import pages.frontend.ShopPragmaticHomePage;

public class HTCSearchTest extends BaseTest {

    @Test
    public void htcProduct() {
        ShopPragmaticHomePage.goTo();
        ShopPragmaticHomePage.makeSomeSearch("HTC");
        SearchHTCPage.verifyYourSearch("HTC");
    }
}
