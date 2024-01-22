package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



    @CucumberOptions(
            features = "src/main/resources/Features"
            ,glue={"steps"}
            ,plugin = {"pretty" , "html:target/cucumber-Report.html" , "json:target/report.json"}
            ,tags="@Smoke"

    )

    public class TestRunner extends AbstractTestNGCucumberTests {



    }


