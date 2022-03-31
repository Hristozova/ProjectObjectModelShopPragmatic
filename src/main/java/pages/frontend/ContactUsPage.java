package pages.frontend;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static utils.Browser.driver;

public class ContactUsPage {

    @FindBy(id = "input-name")
    private static WebElement yourName;

    @FindBy(id = "input-email")
    private static WebElement yourEmail;

    @FindBy(id = "input-enquiry")
    private static WebElement yourenquiry;

    @FindBy(css = ".btn-primary")
    private static WebElement submitButton;

    static {
        PageFactory.initElements(driver, ContactUsPage.class);
    }

    /**
     * Writes text in the Name input field.
     * @param name your name
     */
    public static void writeYourName(String name){
        yourName.sendKeys(name);
    }

    /**
     * Writes text in the Email input field.
     * @param email your email
     */
    public static void writeYourEmail(String email){
        yourEmail.sendKeys(email);
    }

    /**
     * Writes text in the Enquiry input field.
     * @param enquiry your enquiry
     */
    public static void writeEnquiry(String enquiry){
        yourenquiry.sendKeys(enquiry);
    }

    /**
     * clicks on submit button
     */
    public static void clickSubmitButton(){
        submitButton.click();
    }

    /**
     * sends enquiry from you to the admin
     * @param name your name
     * @param email your email
     * @param enquiry your enquiry
     */
    public static void sendEnquiry(String name, String email, String enquiry){
        writeYourName(name);
        writeYourEmail(email);
        writeEnquiry(enquiry);
        clickSubmitButton();
    }
}
