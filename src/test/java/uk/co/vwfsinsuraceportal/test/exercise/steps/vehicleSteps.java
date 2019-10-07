package uk.co.vwfsinsuraceportal.test.exercise.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uk.co.vwfsinsuranceportal.pages.VolkswagenLandingPage;

public class vehicleSteps {

    VolkswagenLandingPage volkswagenLandingPage = new VolkswagenLandingPage();

    @Given("^the user open the Dealer Portal URL$")
    public void openTheURL()
    {
        volkswagenLandingPage.loadPage();
        volkswagenLandingPage.getExpectedUrl();

    }

    @When(("^the VOLKSWAGEN FINANCIAL SERVICES page displays$"))
    public void verifyTheLandingPage()
    {
        volkswagenLandingPage.verifyTextOnLandingPage();
    }

    @Then("^I enter the Vehicle Registration number in Vehicle registration text box$")
    public void enterVehicleRegistrationNumber()
    {
        volkswagenLandingPage.enterRegistrationInTextBox();
    }

    @And("^I click on the Find vehicle button$")
    public void clickOnFindVehicleButton()
    {
        volkswagenLandingPage.clickOnFindVehicle();
    }

    @Then("^I verify the result for the Registered vehicle$")
    public void verifyRegisteredVehicle()
    {
       volkswagenLandingPage.verifyResultsForVehicle();
    }

}
