package BDD.BDDContactUs;

import cucumber.api.CucumberOptions;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

import static utils.Browser.driver;

@CucumberOptions(
        plugin = {"progress", "html:target/cucumber-html-report"},
        features = {"src/test/resources/contactus.feature"},
        tags = {"@vladimira"}
)
public class ContactUsStepDef extends AbstractTestNGCucumberTests {

    private WebDriver driver;

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "D:\\Browser's Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Given("the user is on the shoppragmatic home page")
    public void theUserIsOnTheShoppragmaticHomePage() {
        driver.get("http://shop.pragmatic.bg/index.php?route=common/home");
    }

    @When("the user searches and clicks on Contact us field")
    public void theUserSearchesAndClicksOnContactUsField() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement contactUsField = driver.findElement(By.cssSelector("[href='http://shop.pragmatic.bg/index.php?route=information/contact']"));
        js.executeScript("arguments[0].scrollIntoView();", contactUsField);
        contactUsField.click();
    }


    @And("the user writes his name {string}")
    public void theUserWritesHisName(String yourname) {
        WebElement yourName = driver.findElement(By.id("input-name"));
        yourName.sendKeys(yourname);
    }


    @And("the user writes his email {string}")
    public void theUserWritesHisEmail(String yourEmail) {
        WebElement youremail = driver.findElement(By.id("input-email"));
        youremail.sendKeys(yourEmail);
    }


    @And("the user writes his enquiry {string}")
    public void theUserWritesHisEnquiry(String enquiry) {
        WebElement yourenquiry = driver.findElement(By.id("input-enquiry"));
        yourenquiry.sendKeys(enquiry);
    }


    @And("the user clicks Submit button")
    public void theUserClicksSubmitButton() {
        WebElement submitButton = driver.findElement(By.cssSelector(".btn-primary"));
        submitButton.click();
    }

    @Then("ensure that the user sees the message {string}")
    public void ensureThatTheUserSeesTheMessage(String expectedMessage) {
        WebElement message = driver.findElement(By.xpath("//div//p[contains(text(),'Your enquiry has been successfully sent to the store owner!')]"));
        Assert.assertEquals(message.getText(), expectedMessage);
    }

    @And("the user does not write his name")
    public void theUserDoesNotWriteHisName() {
        WebElement yourName = driver.findElement(By.id("input-name"));
        yourName.sendKeys("");
    }

    @Then("ensure that message {string} is displayed")
    public void ensureThatMessageIsDisplayed(String expectedMessageDisplayed) {
        WebElement textDanger = driver.findElement(By.cssSelector(".text-danger"));
        Assert.assertEquals(textDanger.getText(), expectedMessageDisplayed);
    }

    @And("the user does not write his email")
    public void theUserDoesNotWriteHisEmail() {
        WebElement youremail = driver.findElement(By.id("input-email"));
        youremail.sendKeys("");
    }

    @And("the user does not write his enquiry")
    public void theUserDoesNotWriteHisEnquiry() {
        WebElement yourenquiry = driver.findElement(By.id("input-enquiry"));
        yourenquiry.sendKeys("");
    }


    @Then("ensure that email message {string} is displayed")
    public void ensureThatEmailMessageIsDisplayed(String expectedEmailMessage) {
        WebElement textDanger = driver.findElement(By.cssSelector(".text-danger"));
        Assert.assertEquals(textDanger.getText(), expectedEmailMessage);
    }

    @Then("ensure that enquiry message {string} is displayed")
    public void ensureThatEnquiryMessageIsDisplayed(String expectedEnquiryMessage) {
        WebElement textDanger = driver.findElement(By.cssSelector(".text-danger"));
        Assert.assertEquals(textDanger.getText(), expectedEnquiryMessage);
    }
}
