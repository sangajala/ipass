package ipass;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.AutomationConstants;
import utils.BrowserFactory;
import java.util.concurrent.TimeUnit;

/**
 * Created by sriramangajala on 01/05/15.
 */

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:target/whisper-html-report", "json:target/whisper_report.json"},
//        tags = {"@"},
        features= "src/test/resources/features"
//        glue=""
)
public class RunTest {
    static WebDriver driver;
    public static boolean initialiseOnce = false;

    protected static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(RunTest.class);

    @BeforeClass
    public static void start() {
        try {
            BrowserFactory.StartBrowser(AutomationConstants.BROWSER_TYPE, AutomationConstants.URL);
            driver = BrowserFactory.driver;
            driver.manage().timeouts().implicitlyWait(AutomationConstants.MAX_TIMEOUTS, TimeUnit.SECONDS);
            Assert.assertTrue(driver.findElement(By.tagName("body")).getText().contains("Welcome to IPass"));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @AfterClass
    public static void stop() {
        BrowserFactory.QuitBrowser();
    }

}
