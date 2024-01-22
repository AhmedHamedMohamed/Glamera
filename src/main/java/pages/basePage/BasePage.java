package pages.basePage;

import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;


public class BasePage {


        public WebDriver driver;
        public static JavascriptExecutor js;

        public BasePage(WebDriver driver) {

            PageFactory.initElements(driver, this);
            this.driver = driver;
        }
        public static void clickButton(WebElement Button){
            Button.click();
        }

        public static void setText(WebElement ElementTxt , String Value){
            ElementTxt.sendKeys(Value);
        }




}
