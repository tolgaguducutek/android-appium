package hooks;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/resources/features"},
        glue = {"/steps"},
        tags = "@BrowserStack",
        monochrome = true,
        plugin = {"pretty","html:target/cucumber"}
)

public class runner extends AbstractTestNGCucumberTests {
}
