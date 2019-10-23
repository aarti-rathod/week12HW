package com.nopcommerce.demo.testsuit;

import com.nopcommerce.demo.testbase.TestBase;
import com.nopcommrece.demo.page.HomePage;
import org.testng.annotations.Test;
/*
Currency Selection Test Case
 */
public class CurrencySelection extends TestBase {
    HomePage homePage = new HomePage();

    @Test
    public void userShouldAbleToSelectCurrencySuccessfully() {

        homePage.selectDollorFromCurrencyWindow();
        homePage.verifyDollorCurrencySelectedSuccessfully();
        homePage.selectEuroFromCurrencyWindow();
        homePage.verifyEuroCurrencySelectedSuccessfully();
    }
}
