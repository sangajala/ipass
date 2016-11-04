package ipass;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by sriramangajala on 01/05/15.
 */

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:target/eurostar-html-report", "json:target/eurostar_report.json"},

        tags = "@etap_regression"

)
public class RunTest
{

}
