package admin_area.positive;

import core.BaseTest;
import org.testng.annotations.Test;
import pages.admin_area.DashBoardPage;
import pages.admin_area.LoginPage;
import pages.admin_area.ProductsPage;

public class FindProductsByPriceTest extends BaseTest {
    @Test
    public void findProductsWithDefinitePrice(){
        LoginPage.goTo();
        LoginPage.login("admin", "parola123!");
        DashBoardPage.findAllProducts();
        ProductsPage.writePriceToBeFiltered("100");
        ProductsPage.filterProductsForThatPrice();
        ProductsPage.verifyResultsOfTheSearch("Showing 1 to 12 of 12 (1 Pages)");
    }
}
