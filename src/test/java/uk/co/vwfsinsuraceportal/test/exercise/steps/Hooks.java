package uk.co.vwfsinsuraceportal.test.exercise.steps;

import cucumber.api.java.After;
import uk.co.vwfsinsurance.webdriver.Driver;

public class Hooks {
    @After
    public void logEndOfScenario() throws Exception
    {
        Driver.quit();
    }
}
