package uk.bamboolounge.browserselector;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import uk.bamboolounge.basepage.BasePage;
import uk.bamboolounge.loadproperty.LoadProperty;

import java.util.concurrent.TimeUnit;

/*
Driver Selection
 */
public class BrowserSelector extends BasePage {
    String baseUrl = new LoadProperty().getProperty("baseUrl");
    String path = System.getProperty("user.dir");

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
            System.out.println("Browser Selection Not Found ....");
        }
    }
}
