package uk.co.cineworld.testbase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import uk.co.cineworld.basepage.BasePage;
import uk.co.cineworld.browserselector.BrowserSelector;
import uk.co.cineworld.loadproperty.LoadProperty;

/*
Initial operations
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
        driver.quit();
    }
}
