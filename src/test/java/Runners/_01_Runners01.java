package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags="@SmokeTest",
        features = {"src/test/java/FeatureFiles/_01_Login.feature",
                    "src/test/java/FeatureFiles/_02_Country.feature"
                   },
        glue={"StepDefinitions"},
        plugin= {"pretty","html:target/site/cucumber-pretty",
                "json:target/cucumber/cucumber.json"}
)

public class _01_Runners01 extends AbstractTestNGCucumberTests {

}
