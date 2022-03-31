package pages.frontend;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import static utils.Browser.driver;

public class ShopPragmaticHomePage {

    WebDriverWait wait;

    @FindBy(xpath = "//div/input[@name='search']")
    private static WebElement searchField;

    @FindBy(xpath = "//span[@class='input-group-btn']")
    private static WebElement searchButton;

    @FindBy(css = "[href='http://shop.pragmatic.bg/index.php?route=information/contact']")
    private static WebElement contactUsField;



    static {
        PageFactory.initElements(driver, ShopPragmaticHomePage.class);
    }

    /**
     * This method redirects you to the shop.pragmatic main page.
     */
    public static void goTo(){
        driver.get("http://shop.pragmatic.bg/index.php?route=common/home");
    }

    /**
     * Writes text in the search input field
     * @param yourSearch Your searched product
     */
    public static void writeYourSearch(String yourSearch){
        searchField.sendKeys(yourSearch);
    }

    /**
     * Clicks on the Search Button
     */
    public static void clickSearchButton(){
        searchButton.click();
    }

    /**
     * searches for product that you input
     * @param yourSearch product you want to search
     */
    public static void makeSomeSearch(String yourSearch) {
        writeYourSearch(yourSearch);
        clickSearchButton();
    }

    /**
     * finds and clicks on Contact us button
     */
    public static void contactUsButton(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", contactUsField);
        contactUsField.click();
    }
}


