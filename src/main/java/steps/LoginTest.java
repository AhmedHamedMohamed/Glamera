package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.glameraPage.LoginPage;
import utilities.TestBase;

import java.util.concurrent.TimeUnit;

public class LoginTest extends TestBase{

    LoginPage loginPage;

    @Given("Open Glamera Login Page")
    public void OpenGlameraLoginPage() {
        TestBase.Browser("edge");
        loginPage = new LoginPage(driver);
    }

    @When("Insert Invalid Phone Number {string}")
    public void insertInvalidPhoneNumber(String Username) {
         loginPage.username(Username);
    }

    @And("Insert Invalid Password {string}")
    public void insertInvalidPassword(String Password) {
        loginPage.password(Password);
    }

    @And("Click On Login Button")
    public void clickOnLoginButton() {
        loginPage.loginButton();
    }

    @Then("Assert On Validation Message")
    public void assertOnValidationMessage() {
        loginPage.assertOnValidationMessage();
    }

    @When("Insert Empty Phone Number {string}")
    public void insertEmptyPhoneNumber(String Username) {
        loginPage.clickOnFiled();
    }

    @Then("Assert On Empty Username Validation Message")
    public void assertOnEmptyUsernameValidationMessage() {
        loginPage.assertOnEmptyUsernameValidationMessage();

    }
}