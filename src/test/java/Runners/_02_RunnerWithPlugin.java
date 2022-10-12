package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags="@SmokeTest or @Test1",
        features = {"src/test/java/FeatureFiles/_01_Login.feature",
                    "src/test/java/FeatureFiles/_02_Country.feature"
                   },
        glue={"StepDefinitions"},
        //plugin = {"html:target//cucumber-reports.html"}
        plugin= {"pretty","html:target/site/cucumber-pretty","json:target/cucumber/cucumber.json"}
)

public class _02_RunnerWithPlugin extends AbstractTestNGCucumberTests {

}
