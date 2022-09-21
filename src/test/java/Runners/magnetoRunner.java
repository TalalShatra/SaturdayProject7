package Runners;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/main/resources/FeatureFile"},
        glue = {"StepDefinition"}

)
public class magnetoRunner {
}

