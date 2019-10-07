package uk.co.vwfsinsuranceportal.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static junit.framework.TestCase.assertEquals;
import static uk.co.testdata.TestData.getBaseUrl;

public class VolkswagenLandingPage extends BasePage{

     @FindBy(xpath = "//*[@id='header']/a/img")
     private WebElement header;

     @FindBy(id = "vehicleReg")
     private  WebElement vehicleRegTextBox;

    @FindBy(name = "btnfind")
    private  WebElement findButton;

    @FindBy(xpath = "//*[@id='page-container']/div[4]/div[2]/span")
    private WebElement resultsStartDate;

    @FindBy(xpath = "//*[@id='page-container']/div[4]/div[3]/span")
    private WebElement resultsEndDate;

    public VolkswagenLandingPage()
    {
        PageFactory.initElements(driver,this);
    }

    public void verifyTextOnLandingPage()
    {
       assertEquals (driver.getTitle(),"Dealer Portal");
       assertEquals(header.getText(),"Volkswagen Financial Services");
    }


    public String getExpectedUrl() {
        return getBaseUrl();
    }

    public void enterRegistrationInTextBox()
    {
        vehicleRegTextBox.sendKeys("OV12UYY");
    }

    public void clickOnFindVehicle()
    {
       findButton.click();
    }

    public void verifyResultsForVehicle()
    {
        assertEquals("09 FEB 2022 : 16 : 26",resultsStartDate.getText());
        assertEquals(" 18 FEB 2022 : 23 : 59",resultsEndDate.getText());
    }
}
