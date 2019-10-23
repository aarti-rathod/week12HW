package com.orange.demo.pages;

import com.orange.demo.utility.Util;
import org.openqa.selenium.By;

/**
 * Page Under Test
 */
public class HomePage extends Util {

    public void enterUserName() {
        sendTextToElement(By.xpath("//input[@id='txtUsername']"), "Admin");
    }

    public void enterPassWord() {
        sendTextToElement(By.xpath("//input[@id='txtPassword']"), "admin123");
    }

    public void clickOnLogin() {
        clickOnElement(By.xpath("//input[@id='btnLogin']"));
    }

    public void verifyUserLoggedInSuccessfully() {
        String expectedValue = "OrangeHRM";
        assertEqual(expectedValue);
    }

}
