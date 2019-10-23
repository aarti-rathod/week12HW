package com.orange.demo.testbase;

import com.orange.demo.basepage.BasePage;
import com.orange.demo.browserselector.BrowserSelector;
import com.orange.demo.loadproperty.LoadProperty;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

/**
 * Actions Before Test
 */
public class TestBase extends BasePage {
    String browser = new LoadProperty().getProperty("browser");
    BrowserSelector browserSelector = new BrowserSelector();

    @BeforeMethod
    public void setUp() {
        browserSelector.selectBrowser(browser);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
