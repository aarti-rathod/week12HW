package uk.co.cineworld.pages;


import org.openqa.selenium.By;
import uk.co.cineworld.utility.Util;

/*
Cine World LoginPage
 */
public class LoginPage extends Util {

    public void clickOnLogin() {
        clickOnElement(By.xpath("//a[contains(text(),'Log in')]"));
    }

    public void enterEmail() {
        sendTextToElement(By.xpath("//input[@id='loginem']"), "nandinitimla@gmail.com");
    }

    public void enterPassword() {
        sendTextToElement(By.xpath("//input[@id='loginpwd']"), "nandini8890");
    }

    public void clickOnContinue() {
        clickOnElement(By.xpath("//button[@class='btn-arrow-primary text-center pull-right']"));
    }

}
