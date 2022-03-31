package pages.frontend;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import static utils.Browser.driver;

public class SearchHTCPage {

    @FindBy(id = "input-search")
    private static WebElement inputSearchCriteria;

    static{
        PageFactory.initElements(driver, SearchHTCPage.class);
    }

    /**
     * verifies that your search has been made
     * @param expectedCriteriaText product you search
     */
    public static void verifyYourSearch(String expectedCriteriaText){
        Assert.assertEquals(inputSearchCriteria.getAttribute("value"), expectedCriteriaText);
    }


}


