package com.nopcommrece.demo.page;

import com.nopcommrece.demo.utility.Util;
import org.openqa.selenium.By;
/*
TaskBar Page Under Test
 */
public class TaskBarPage extends Util {
    //--------------Computer-------------//
    public void selectComputerFromTaskBar() {
        clickOnElement(By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Computers')]"));
    }

    public void verifyComputerOptionSelected() {
        String expectedText = "nopCommerce demo store. Computers";
        String actualText = driver.getTitle();
        verifyActualAndExpected(actualText, expectedText);
    }
    //---------------------------------//

    //------------Electronics--------------//
    public void selectElectronicsFromTaskBar(){
        clickOnElement(By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Electronics')]"));
    }

    public void verifyElectronicsOptionSelected() {
        String expectedText = "nopCommerce demo store. Electronics";
        String actualText = driver.getTitle();
        verifyActualAndExpected(actualText, expectedText);


    }
    //------------------------------------------//

    //-------------------Apparel----------------//

    public void selectApparelFromTaskBar(){

        clickOnElement(By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Apparel')]"));
    }
    public void verifyApparelOptionSelected(){
        String expectedText = "nopCommerce demo store. Apparel";
        String actualText = driver.getTitle();
        verifyActualAndExpected(actualText, expectedText);

    }
    //-----------------------------------------------------//

    //--------------------DigitalDownLoads------------------//

    public void selectDigitalDownLoadsFromTaskBar(){
        clickOnElement(By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Digital downloads')]"));
    }
    public void verifyDigitalDownLoadOptionSelected(){
        String expectedText = "nopCommerce demo store. Digital downloads";
        String actualText = driver.getTitle();
        verifyActualAndExpected(actualText, expectedText);


    }
    //--------------------------------------------------------//

    //------------------Books-------------------------------//

    public void selectBooksFromTaskBar(){
        clickOnElement(By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Books')]"));
    }
    public void verifyBooksOptionSelected(){
        String expectedText = "nopCommerce demo store. Books";
        String actualText = driver.getTitle();
        verifyActualAndExpected(actualText, expectedText);


    }
    //--------------------------------------------------------//

    //---------------------Jewelry-----------------------------//

    public void selectJewelryFromTaskbar(){
        clickOnElement(By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Jewelry')]"));
    }
    public void verifyJewelryOptionSelected(){
        String expectedText = "nopCommerce demo store. Jewelry";
        String actualText = driver.getTitle();
        verifyActualAndExpected(actualText, expectedText);

    }
    //--------------------------------------------------------//
    //----------------------GiftCards------------------------//


    public void selectGiftCardsFromTaskBar(){
        clickOnElement(By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Gift Cards')]"));

    }
    public void verifyGiftCardsOptionSelected(){
        String expectedText = "nopCommerce demo store. Gift Cards";
        String actualText = driver.getTitle();
        verifyActualAndExpected(actualText, expectedText);

    }

}
