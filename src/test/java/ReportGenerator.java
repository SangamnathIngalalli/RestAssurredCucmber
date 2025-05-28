import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

import java.io.File;
import java.util.Collections;

public class ReportGenerator {
    public static void main(String[] args) {
        File reportOutputDirectory = new File("build/reports/cucumber-advanced");
        String jsonFile = "build/reports/cucumber/cucumber.json";
        Configuration configuration = new Configuration(reportOutputDirectory, "API Test Report");
        ReportBuilder reportBuilder = new ReportBuilder(Collections.singletonList(jsonFile), configuration);
        reportBuilder.generateReports();
    }
} 