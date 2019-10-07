package uk.co.vwfsinsuranceportal.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.LoadableComponent;
import uk.co.vwfsinsurance.webdriver.Driver;

public abstract class BasePage extends LoadableComponent {

    WebDriver driver = Driver.getDriver();
    public abstract String getExpectedUrl();

    protected void load() {
        loadPage();
    }

    protected void isLoaded() throws Error {
        loadPage();
    }

    public void loadPage()
    {
        driver.get(getExpectedUrl());
        driver.manage().window().maximize();
    }
}
