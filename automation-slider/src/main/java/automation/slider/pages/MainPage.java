package automation.slider.pages;

import automation.slider.utility.Util;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/*
Class Initialize The Page Under Test
 */
public class MainPage extends Util {
    public void clickToSkipSignIn() {
        clickOnElement(By.xpath("//button[text()='Skip Sign In']"));
    }

    public void mouseHoverOnWidgets() {
        mouseHoverToElement(By.xpath("//a[contains(text(),'Widgets')]"));
    }

    public void selectSliderFromList() {
        clickOnElement(By.xpath("//a[text()=' Slider ']"));
    }

    public void moveSliderToTheTgt() {
        slider(driver.findElement(By.xpath("//div[@id='slider']")));
    }

}
