package com.nopcommerce.demo.testsuit;

import com.nopcommerce.demo.testbase.TestBase;
import com.nopcommrece.demo.page.ElectronicsPage;
import org.testng.annotations.Test;
/*
Add To Cart Test Case
 */
public class AddToCart extends TestBase {

    ElectronicsPage electronics = new ElectronicsPage();
    @Test
    public void userShouldAbleToAddItemInTheCart() {

        electronics.openElectronicsPage();
        electronics.openCellphoneOption();
        electronics.clickOnHTCMobile();
        electronics.addToCart();
        electronics.verifyAlertText();

    }
}
