package pages.frontend;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import static utils.Browser.driver;

public class VerifyContactUs {

    @FindBy(xpath = "//div//p[contains(text(),'Your enquiry has been successfully sent to the store owner!')]")
    private static WebElement message;

    static {
        PageFactory.initElements(driver, VerifyContactUs.class);
    }

    /**
     * verifies that you successfully contact to the admin
     * @param expectedMessage The expected message that appear after you successfully contact to the admin
     */
    public static void verifySuccessContactToTheAdmin(String expectedMessage){
        Assert.assertEquals(message.getText(), expectedMessage);
    }
}
