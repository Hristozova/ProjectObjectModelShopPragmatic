package BDD.BDDProductPrice;

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
        features = {"src/test/resources/productprice.feature"},
        tags = {"@vladimira"}
)
public class ProductPriceStepDef extends AbstractTestNGCucumberTests {

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

    @Given("the user is on the shoppragmatic admin home page")
    public void the_user_is_on_the_shoppragmatic_admin_home_page() {
        driver.get("https://shop.pragmatic.bg/admin/");
    }

    @When("the user enters {string} username")
    public void the_user_enters_username(String username) {
        WebElement usernameInputField = driver.findElement(By.id("input-username"));
        usernameInputField.sendKeys(username);
    }

    @And("the user enters {string} password")
    public void theUserEntersPassword(String password) {
        WebElement passwordInputField = driver.findElement(By.id("input-password"));
        passwordInputField.sendKeys(password);
    }


    @And("the user clicks on Login button")
    public void theUserClicksOnLoginButton() {
        WebElement loginButton = driver.findElement(By.className("btn-primary"));
        loginButton.click();
    }


    @And("the user clicks on Catalog")
    public void theUserClicksOnCatalog() {
        WebElement catalog = driver.findElement(By.id("menu-catalog"));
        catalog.click();
    }


    @And("the user clicks on Products")
    public void theUserClicksOnProducts() {
        WebElement products = driver.findElement(By.xpath("//li//ul//a[text()='Products']"));
        products.click();
    }

    @And("the user clicks on Filter button")
    public void theUserClicksOnFilterButton() {
        WebElement filterButton = driver.findElement(By.id("button-filter"));
        filterButton.click();
    }


    @Then("ensure that the value of priceField is {string}")
    public void ensureThatTheDisplayedProductsCostsTheSamePrice(String expectedValueOfPriceField) {
        WebElement priceInput = driver.findElement(By.id("input-price"));
        Assert.assertEquals(priceInput.getAttribute("value"), expectedValueOfPriceField);

    }

    @Then("ensure that panel title text is {string}")
    public void ensureThatPanelTitleTextIs(String expectedPanelTitle) {
        WebElement panelTitle = driver.findElement(By.xpath("//h1"));
        Assert.assertEquals(panelTitle.getText(), expectedPanelTitle);
    }

    @And("the user writes the wanted price of {string}")
    public void theUserWritesTheWantedPriceOf(String wantedPrice) {
        WebElement priceInput = driver.findElement(By.id("input-price"));
        priceInput.sendKeys(wantedPrice);
    }

}
