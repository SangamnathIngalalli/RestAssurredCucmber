package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features/userApi.feature",
    glue = "steps",
    plugin = {
        "pretty",
        "json:build/reports/cucumber/cucumber.json"
    },
    monochrome = true,
    publish = true
)
public class TestRunner {
} 