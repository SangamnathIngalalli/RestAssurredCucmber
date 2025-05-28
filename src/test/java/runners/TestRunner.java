package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features",
    glue = "steps",
    plugin = {
        "pretty",
        "html:build/reports/cucumber/cucumber.html",
        "json:build/reports/cucumber/cucumber.json",
        "junit:build/reports/cucumber/cucumber.xml",
        "summary"
    },
    monochrome = true,
    publish = true
)
public class TestRunner {
} 