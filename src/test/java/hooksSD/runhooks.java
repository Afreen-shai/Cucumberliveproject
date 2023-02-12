package hooksSD;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/hooksFF/",
        glue = "hooksSD", monochrome = true,
        plugin = {"pretty",
                "html:target/cucumber-htmlReport",
                "json:target/cucumber-report4.json"}
)
public class runhooks {
}
