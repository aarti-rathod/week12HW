package automation.slider.testbase;

import automation.slider.basepage.BasePage;
import automation.slider.browserselector.BrowserSelector;
import automation.slider.loadproperties.LoadProperty;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

/*
Base Class includes SetUp And TearDown
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
        //driver.quit();
    }
}
