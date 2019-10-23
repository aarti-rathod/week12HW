package uk.co.aldi.browserselector;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import uk.co.aldi.basepage.BasePage;
import uk.co.aldi.loadproperty.LoadProperty;

import java.util.concurrent.TimeUnit;
/*
Select Browser
 */
public class BrowserSelector extends BasePage {
    String path = System.getProperty("user.dir");
    String baseUrl = new LoadProperty().getProperty("baseUrl");

    public void selectBrowser(String browser) {
        if (browser.equalsIgnoreCase("chrome")) {

            System.setProperty("webdriver.chrome.driver", path + "\\driver\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.get(baseUrl);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        } else if (browser.equalsIgnoreCase("firefox")) {

            System.setProperty("webdriver.gecko.driver", path + "\\driver\\geckodriver.exe");
            driver = new FirefoxDriver();
            driver.get(baseUrl);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        } else {
            System.out.println("Browser is not selected . .");
        }
    }
}
