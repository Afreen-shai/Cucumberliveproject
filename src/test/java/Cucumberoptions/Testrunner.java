package Cucumberoptions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/Features",
        glue = "Stepfile",monochrome = true,
        plugin = {"pretty",
                   "html:target/cucumber-htmlReport",
                    "json:target/cucumber-report1.json"}
                 )
public class Testrunner {
}
