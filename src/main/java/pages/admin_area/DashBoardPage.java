package pages.admin_area;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utils.Browser;

public class DashBoardPage {
    @FindBy(xpath = "//*[@id='user-profile']/..")
    private static WebElement userInfo;


    @FindBy(id = "menu-catalog")
    private static WebElement catalog;

    @FindBy(xpath = "//li//ul//a[text()='Products']")
    private static WebElement products;

    static {
        PageFactory.initElements(Browser.driver, DashBoardPage.class);
    }

    /**
     * Verifies that the firstname and the lastname of the user are as expected.
     *
     * @param expectedFirstNameAndLastNameOfTheUser The expected firstname and the lastname of the user.
     */
    public static void verifyUserInfoText(String expectedFirstNameAndLastNameOfTheUser) {
        Assert.assertEquals(userInfo.getText(), expectedFirstNameAndLastNameOfTheUser);
    }

    /**
     * Clicks on the Catalog menu
     */
    public static void clickCatalogButton(){
        catalog.click();
    }

    /**
     * Clicks on the Products button
     */
    public static void clickProductsButton(){
        products.click();
    }

    /**
     * find all products on the site
     */
    public static void findAllProducts(){
        catalog.click();
        products.click();
    }


}
