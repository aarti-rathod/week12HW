package com.nopcommrece.demo.page;

import com.nopcommrece.demo.utility.Util;
import org.openqa.selenium.By;
/*
Registration Page Under Test
 */
public class RegisterPage extends Util {

    public void navigateToRegisterPage() {
        clickOnElement(By.xpath("//a[@class='ico-register']"));
    }

    public void enterFirstName() {
        sendTextToElement(By.xpath("//input[@id='FirstName']"), "Akshay");
    }

    public void enterLastName() {
        sendTextToElement(By.xpath("//input[@id='LastName']"), "Kumar");
    }

    public void enterEmail() {
        String ranEmail = randomStringGenerator() + "@gmail.com";
        sendTextToElement(By.xpath("//input[@id='Email']"), ranEmail);
    }

    public void enterPassword() {
        sendTextToElement(By.xpath("//input[@id='Password']"), "jkl123mail");
    }

    public void enterConfirmPassword() {
        sendTextToElement(By.xpath("//input[@id='ConfirmPassword']"), "jkl123mail");
    }

    public void enterRegisterBtn() {
        clickOnElement(By.xpath("//input[@id='register-button']"));
    }

    public void veryfyUserRegisteredSuccessfully() {
        String actual = driver.findElement(By.xpath("//div[@class='result']")).getText();
        String expected = "Your registration completed";
        verifyActualAndExpected(expected, actual);
    }

}
