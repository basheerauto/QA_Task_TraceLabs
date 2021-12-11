/**
 * In this class contains Cucumber TestRunner options
 * Author:Basheer Ahamed
 *  Date:12/08/2021
 */

package cucumberOptions;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src\\test\\java\\features",
        glue = {"stepDefinations"},
        plugin = {"pretty","html:target/Cucumber-html-report","json:target/Cucumber.json"},
        tags = {"@Smoketest"}

)
class TestRunner {
}

