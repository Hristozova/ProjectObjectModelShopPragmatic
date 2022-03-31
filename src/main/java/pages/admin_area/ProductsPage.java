package pages.admin_area;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import static utils.Browser.driver;

public class ProductsPage {

    @FindBy(id = "input-price")
    private static WebElement priceInput;

    @FindBy(id = "button-filter")
    private static WebElement filterButton;

    @FindBy(xpath = "//div[@class='col-sm-6 text-right']")
    private static WebElement showingResults;

    static{
        PageFactory.initElements(driver, ProductsPage.class);
    }

    /**
     * writes the price you want to pay for products
     * @param price your price that you are willing to pay for a product
     */
    public static void writePriceToBeFiltered(String price){
        priceInput.sendKeys(price);
    }

    /**
     * searches only for products that costs your price
     */
    public static void filterProductsForThatPrice(){
        filterButton.click();
    }

    /**
     * verifies the number of products that costs your price
     * @param expectedText expected text that inform you about the numbers of products that costs your price
     */
    public static void verifyResultsOfTheSearch(String expectedText){
        Assert.assertEquals(showingResults.getText(),expectedText);
    }


}
