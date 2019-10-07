package uk.co.vwfsinsurance.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
    protected static WebDriver driver = null;

    public static WebDriver getDriver() {

        System.setProperty("webdriver.chrome.driver", "C:/webdrivers/chromedriver/chromedriver.exe");
        if( driver == null ) {
            driver = new ChromeDriver();
        }
        return driver;
    }

    public static void quit()
    {
        if(driver !=null)
        {
            try
            {
                driver.quit();
                driver =null;
            }
            catch(Exception e)
            {
                // I don't care about errors at this point
            }
        }
    }

}
