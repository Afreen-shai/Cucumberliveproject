package datadrivenSD;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/datadrivenFF/",
        glue = "datadrivenSD",monochrome = true,
        plugin = {"pretty",
                "html:target/cucumber-htmlReport",
                "json:target/cucumber-report2.json"}
)
public class Testrunner {
}
