package uk.co.vwfsinsuraceportal.test.exercise.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(format = {"pretty", "json:target/cucumber.json" },
        features = {"classpath:features"},
        glue={"uk.co.vwfsinsuraceportal.test.exercise"},
        tags={"@VerifyVehicle"}
)

public class CucumberTestRunner {
}
