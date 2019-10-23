package com.nopcommrece.demo.page;

import com.nopcommrece.demo.utility.Util;
import org.openqa.selenium.By;
/*
HomePage Page Under Test
 */
public class HomePage extends Util {

    public void selectEuroFromCurrencyWindow() {
        selectByVisibleTextFromDropDown(By.xpath("//select[@id='customerCurrency']"), "US Dollar");
    }

    public void verifyEuroCurrencySelectedSuccessfully() {
        String expectedValue = "$1,200.00";
        String actualValue = getTextFromElement(By.xpath("//span[contains(text(),'$1,200.00')]"));
        /*
        To verify The Values Match The Expected
         */
        verifyActualAndExpected(expectedValue, actualValue);
    }

    public void selectDollorFromCurrencyWindow() {
        selectByVisibleTextFromDropDown(By.xpath("//select[@id='customerCurrency']"), "Euro");
    }

    public void verifyDollorCurrencySelectedSuccessfully() {

        String expectedValue = "Ђ1548.00";
        String actualValue = getTextFromElement(By.xpath("//span[contains(text(),'1548.00')]"));
        /*
        To verify The Values Match The Expected
         */
        verifyActualAndExpected(expectedValue, actualValue);
    }

}
