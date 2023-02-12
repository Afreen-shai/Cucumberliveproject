package sharedataSD;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/sharedataFF/",
        glue = "sharedataSD", monochrome = true,
        plugin = {"pretty",
                "html:target/cucumber-htmlReport",
                "json:target/cucumber-report6.json"}
)
public class runsharedataTest {
}
