package tagsSD;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/tagsFF/",
        glue = "tagsSD",monochrome = true,
        plugin= {"pretty",
                  "html:target/cucumber-htmlReport",
                   "json:target/cucumber-report7.json"
                  }
        //tags = "@smoke" {only one is executed}
        //tags ="@important"{all will be execute}
        //tags = "@smoke","@Regression" {combination of both will be executed}
        //tags ="@smoke,@Regression" {single and combination of both will be run}

)
public class TestRunnertags {
}
