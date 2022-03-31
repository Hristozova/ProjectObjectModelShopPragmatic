package BDD.BDDhtcProducts;

import cucumber.api.CucumberOptions;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

@CucumberOptions(
        plugin = {"progress", "html:target/cucumber-html-report"},
        features = {"src/test/resources/htcproducts.feature"},
        tags = {"@vladimira"}
)        
public class HTCProductsStepDef  extends AbstractTestNGCucumberTests {

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

    @When("the user writes {string} in Search field")
    public void theUserWritesInSearchField(String yourSearch) {
        WebElement searchField = driver.findElement(By.xpath("//div/input[@name='search']"));
        searchField.sendKeys(yourSearch);
    }

    @And("the user clicks search button")
    public void theUserClicksSearchButton() {
        WebElement searchButton = driver.findElement(By.xpath("//span[@class='input-group-btn']"));
        searchButton.click();
    }

    @Then("ensure negative message appears {string}")
    public void ensureNegativeMessageAppears(String expectedTextMessage) {
        WebElement afterSearchMessage = driver.findElement(By.xpath("//div//p[text()='There is no product that matches the search criteria.']"));
        Assert.assertEquals(afterSearchMessage.getText(), expectedTextMessage);
    }

    @Then("ensure positive message appears {string}")
    public void ensurePositiveMessageAppears(String expectedMessage) {
        WebElement afterSearchMessage = driver.findElement(By.xpath("//div[@class='col-sm-6 text-right']"));
        Assert.assertEquals(afterSearchMessage.getText(), expectedMessage);
    }
}