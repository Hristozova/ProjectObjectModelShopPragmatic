package admin_area.positive;

import core.BaseTest;
import org.testng.annotations.Test;
import pages.admin_area.DashBoardPage;
import pages.admin_area.LoginPage;

public class LoginTests extends BaseTest {

    @Test
    public void loginSuccessfully() {
        LoginPage.goTo();
        LoginPage.login("admin", "parola123!");
        DashBoardPage.verifyUserInfoText("Milen Strahinski");
    }

}
