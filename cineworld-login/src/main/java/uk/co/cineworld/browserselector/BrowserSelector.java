package uk.co.cineworld.browserselector;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import uk.co.cineworld.basepage.BasePage;
import uk.co.cineworld.loadproperty.LoadProperty;

import java.util.concurrent.TimeUnit;
/*
Browser Selections
 */
public class BrowserSelector extends BasePage {
String path = System.getProperty("user.dir");
String baseUrl = new LoadProperty().getProperty("baseUrl");
public void selectBrowser(String browser){
    if(browser.equalsIgnoreCase("chrome")){
        driver=new ChromeDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }else if(browser.equalsIgnoreCase("firefox")){
        driver= new FirefoxDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

    }else{
        System.out.println("Browser Not Found  ..");
    }
}
}
