package multiSD;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/multipleFF/",
        glue = "multiSD", monochrome = true,//dryRun = true
        plugin = {"pretty",
                "html:target/cucumber-htmlReport",
                "json:target/cucumber-report5.json"}
)
public class RunMultiTest {
}
