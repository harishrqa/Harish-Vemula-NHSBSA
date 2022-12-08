package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.*;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = ".//Feature",
        glue = "stepDefinations",

        plugin = {"pretty","html:test-output.html"},
        tags = "@SmokeTest"
)
public class TestRunner {
}
