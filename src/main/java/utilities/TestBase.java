package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.util.logging.Logger;

public class TestBase {


    static Logger log = Logger.getLogger(Helper.class.getName());
    public static WebDriver driver;
    static String browserName = "edge";
    static String headless = "edge";

    public static WebDriver Browser(String browserName) {

        if (browserName.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browserName.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } else if (browserName.equalsIgnoreCase("edge")) {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();

        }
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.get("https://stage.glamera.com/");
        return driver;
    }
    public static WebDriver headlessBrowser(String headless) {

        if (headless.equalsIgnoreCase("chrome")) {
            ChromeOptions options = new ChromeOptions();
            options.setHeadless(true);
            driver = new ChromeDriver(options);
        } else if (headless.equalsIgnoreCase("firefox")) {
            FirefoxOptions options = new FirefoxOptions();
            options.setHeadless(true);
            driver = new FirefoxDriver(options);
        } else if (headless.equalsIgnoreCase("edge")) {
            EdgeOptions options = new EdgeOptions();
            options.setHeadless(true);
            driver = new EdgeDriver(options);

        }
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.get("https://stage.glamera.com/");
        return driver;
    }
}

