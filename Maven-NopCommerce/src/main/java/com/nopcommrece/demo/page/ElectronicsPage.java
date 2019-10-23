package com.nopcommrece.demo.page;

import com.nopcommrece.demo.utility.Util;
import org.openqa.selenium.By;
/*
Electronics Page Under Test
 */
public class ElectronicsPage extends Util {
    public void openElectronicsPage() {
        clickOnElement(By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Electronics')]"));
    }

    public void openCellphoneOption() {
        clickOnElement(By.xpath("//img[@title='Show products in category Cell phones']"));
    }

    public void clickOnHTCMobile() {
        clickOnElement(By.xpath("//img[@title='Show details for HTC One M8 Android L 5.0 Lollipop']"));
    }

    public void addToCart() {
        clickOnElement(By.xpath("//input[@id='add-to-cart-button-18']"));
    }

    public void verifyAlertText() {

        String expectedText = "The product has been added to your shopping cart";
        String actualText = driver.findElement(By.xpath("//div[@class='bar-notification success']")).getText();

        verifyActualAndExpected(expectedText,actualText);
    }
}
