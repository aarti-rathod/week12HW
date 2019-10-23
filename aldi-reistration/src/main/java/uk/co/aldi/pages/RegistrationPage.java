package uk.co.aldi.pages;

import org.openqa.selenium.By;
import uk.co.aldi.util.Util;

/*
The Methods For The Page Under Test
 */
public class RegistrationPage extends Util {
    String randomMail;

    public void clickOnLogin() {
        clickOnElement(By.xpath("//a[@class='header__link header__link--utility'][@href='/login']"));
    }

    public void clickOnTgt() {
        clickOnElement(By.xpath("//a[@href='#register-tab']"));
    }

    public void selectFrom() {
        selectByValueFromDropDown(By.xpath(".//*[@id='register.title']"), "mr");
    }

    public void firstName() {
        sendTextToElement(By.xpath(".//*[@id='register.firstName']"), "John");
    }

    public void lastName() {
        sendTextToElement(By.xpath(".//*[@id='register.lastName']"), "Smith");
    }

    public void email() {
        randomMail = randomStringGenerator() + "@gmail.com";
        sendTextToElement(By.xpath(".//*[@id='email']"), randomMail);
    }

    public void confirmEmail() {
        sendTextToElement(By.xpath(".//*[@id='checkEmail']"), randomMail);
    }

    public void passWord() {
        String passWord = randomStringGenerator() + "0988";
        sendTextToElement(By.xpath(".//*[@id='password']"), passWord);
    }

    public void confirmPassword() {
        String confirmPassword = randomStringGenerator() + "0988";
        sendTextToElement(By.xpath(".//*[@id='register.checkPwd']"), confirmPassword);
    }

    public void clickOnSubmitBtn() {
        clickOnElement(By.xpath("//button[contains(text(),'Create account')]"));
    }

}
