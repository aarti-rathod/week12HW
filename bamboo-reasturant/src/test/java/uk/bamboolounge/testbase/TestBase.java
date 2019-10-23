package uk.bamboolounge.testbase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import uk.bamboolounge.basepage.BasePage;
import uk.bamboolounge.browserselector.BrowserSelector;
import uk.bamboolounge.loadproperty.LoadProperty;
/*
Test NG Before After Methods Before (n num of Tests)
 */
public class TestBase extends BasePage {
    BrowserSelector browserSelector = new BrowserSelector();
    String browser  = new LoadProperty().getProperty("browser");

    @BeforeMethod
    public void setUp(){
    browserSelector.selectBrowser(browser);
    }

    @AfterMethod
    public void tearDown(){
        //driver.quit();
    }
}
