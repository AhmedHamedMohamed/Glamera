package pages.glameraPage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.asserts.SoftAssert;
import pages.basePage.BasePage;

public class LoginPage extends BasePage {


    public LoginPage(WebDriver driver) {
        super(driver);
        js = (JavascriptExecutor) driver;
    }

    @FindBy(id = "mat-input-0")
    public WebElement username;

    @FindBy(id = "mat-input-1")
    public WebElement password;

    @FindBy(css = "button.mat-focus-indicator.submit-btn.mat-raised-button.mat-button-base.mat-primary")
    public WebElement loginButton;

    @FindBy(css = "div.ng-tns-c2-2.toast-message.ng-star-inserted")
    public WebElement validationMessage;

    @FindBy(css = "span.ng-star-inserted")
    public WebElement emptyUsernameValidationMessage;

    public void username(String Username){
        setText(username , Username);
    }

    public void password(String Password){
        setText(password , Password);
    }

    public void loginButton(){
        clickButton(loginButton);
    }

    public void clickOnFiled(){
        clickButton(username);
    }

    public void assertOnValidationMessage(){
        SoftAssert softAssert = new SoftAssert();
        String ExpectedText = "Invaild user name or password";
        String ActualText = validationMessage.getText();
        softAssert.assertEquals(ActualText,ExpectedText,"Title is not Matching");
        softAssert.assertAll();
    }

    public void assertOnEmptyUsernameValidationMessage(){
        SoftAssert softAssert = new SoftAssert();
        String ExpectedText = "رقم الهات حقل ضروري !";
        String ActualText = emptyUsernameValidationMessage.getText();
        softAssert.assertEquals(ActualText,ExpectedText,"Title is not Matching");
        softAssert.assertAll();
    }

}
