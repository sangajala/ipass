package ipass;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import org.apache.log4j.Logger;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import utils.AutomationConstants;
import utils.BrowserFactory;

public class Hooks {
    public static WebDriver driver;
    private static final Logger LOGGER = Logger.getLogger(BrowserFactory.class);


    @After
    public void embedScreenshot(Scenario scenario) {
        driver = BrowserFactory.getDriver();

        if (scenario.isFailed()) {
            try {
                scenario.write("Current Page URL is " + driver.getCurrentUrl());
                byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
                scenario.embed(screenshot, "image/png");
            } catch (WebDriverException somePlatformsDontSupportScreenshots) {
                System.err.println(somePlatformsDontSupportScreenshots.getMessage());
            }

        }

    }

}