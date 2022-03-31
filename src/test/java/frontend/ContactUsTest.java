package frontend;

import core.BaseTest;
import org.testng.annotations.Test;
import pages.frontend.ContactUsPage;
import pages.frontend.ShopPragmaticHomePage;
import pages.frontend.VerifyContactUs;

public class ContactUsTest extends BaseTest {

    @Test
    public void contactUsTest(){
        ShopPragmaticHomePage.goTo();
        ShopPragmaticHomePage.contactUsButton();
        ContactUsPage.sendEnquiry("Vladi", "vladi@mail.bg", "Do you have showroom in Sofia?");
        VerifyContactUs.verifySuccessContactToTheAdmin("Your enquiry has been successfully sent to the store owner!");
    }
}
