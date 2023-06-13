package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/features", glue = "stepDefinitions", tags = "@BookFlightWithLowestPrice")
public class RegressionRunner extends AbstractTestNGCucumberTests {

}
