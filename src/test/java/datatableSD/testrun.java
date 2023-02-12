package datatableSD;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/datatableFF/",
        glue = "datatableSD",monochrome = true,
        plugin = {"pretty",
                "html:target/cucumber-htmlReport",
                "json:target/cucumber-report3.json"}
       )
public class testrun {
}
