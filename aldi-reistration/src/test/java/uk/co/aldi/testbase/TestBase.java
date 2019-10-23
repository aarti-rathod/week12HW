package uk.co.aldi.testbase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import uk.co.aldi.basepage.BasePage;
import uk.co.aldi.browserselector.BrowserSelector;
import uk.co.aldi.loadproperty.LoadProperty;

/*
Before And After Method Of TestNG Annotations For Random Executions
 */
public class TestBase extends BasePage {

    BrowserSelector browserSelector = new BrowserSelector();
    String browser = new LoadProperty().getProperty("browser");

    @BeforeMethod
    public void setUp(){
        browserSelector.selectBrowser(browser);
    }

    @AfterMethod
    public void tearDown(){
     //   driver.quit();
    }
}
