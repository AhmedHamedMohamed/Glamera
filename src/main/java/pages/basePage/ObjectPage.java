package pages.basePage;

import org.openqa.selenium.WebDriver;
import pages.glameraPage.LoginPage;

public class ObjectPage {



    private WebDriver driver;
    private LoginPage loginPage;

    public LoginPage getLoginPage() {
        if (loginPage == null) {
            loginPage = new LoginPage(driver);
        }
        return loginPage;
    }
}
