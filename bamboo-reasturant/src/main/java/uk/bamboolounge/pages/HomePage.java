package uk.bamboolounge.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import uk.bamboolounge.utility.Util;

/*
All Actions Method Of The Page Under Test
 */
public class HomePage extends Util {
    public void enterName() {
        sendTextToElement(By.xpath("//input[@placeholder='Full Name']"), "Jigna");
    }

    public void enterEmail() {
        String randomEmail = randomStringGenerator() + "@gmail.com";
        WebElement emailBox  = driver.findElement(By.xpath("//input[@placeholder='Email']"));
        emailBox.sendKeys("jigna@gmail.com");
        //sendTextToElement(By.xpath("//input[@class='sml_emailinput']"), randomEmail);
    }

    public void clickOnSubscribeNow() {
        clickOnElement(By.xpath("//input[@value='SUBSCRIBE NOW']"));
    }

    public void verifyAlertTextMessage() {
        String actualAlertMsg = getAlertText();
        String expectedAlertMsg = "Thank you for subscribing to Bamboo Lounge mailing list";
        verifyActualAndExpected(expectedAlertMsg,actualAlertMsg);
        System.out.println("Alert Window Message ="+actualAlertMsg);
    }
}
