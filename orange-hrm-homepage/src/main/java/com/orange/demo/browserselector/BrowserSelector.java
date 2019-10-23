package com.orange.demo.browserselector;

import com.orange.demo.basepage.BasePage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;

/**
 * Browser Selection
 */
public class BrowserSelector extends BasePage {
    public void selectBrowser(String browser) {

        String baseUrl = "https://opensource-demo.orangehrmlive.com/";
        String projectPath = System.getProperty("user.dir");

        if (browser.equalsIgnoreCase("chrome")) {

            System.setProperty("webdriver.chrome.driver", projectPath + "/driver/chromedriver.exe");
            driver = new ChromeDriver();
            driver.get(baseUrl);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        } else if (browser.equalsIgnoreCase("firefox")) {

            System.setProperty("webdriver.gecko.driver", projectPath + "/drivers/geckodriver.exe");
            driver = new FirefoxDriver();
            driver.get(baseUrl);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        } else {
            System.out.println("Browser Not Found");
        }
    }
}
