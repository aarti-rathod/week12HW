package com.nopcommerce.demo.testsuit;

import com.nopcommerce.demo.testbase.TestBase;
import com.nopcommrece.demo.page.TaskBarPage;
import org.testng.annotations.Test;
/*
TaskBar TestCase
 */
public class TaskBarSelection extends TestBase {
    TaskBarPage taskBarPage = new TaskBarPage();

    @Test
    public void userShouldAbleToClickComputerOptionSuccessfully() {
        taskBarPage.selectComputerFromTaskBar();
        taskBarPage.verifyComputerOptionSelected();
        taskBarPage.selectElectronicsFromTaskBar();
        taskBarPage.verifyElectronicsOptionSelected();
        taskBarPage.selectApparelFromTaskBar();
        taskBarPage.verifyApparelOptionSelected();
        taskBarPage.selectDigitalDownLoadsFromTaskBar();
        taskBarPage.verifyDigitalDownLoadOptionSelected();
        taskBarPage.selectBooksFromTaskBar();
        taskBarPage.verifyBooksOptionSelected();
        taskBarPage.selectJewelryFromTaskbar();
        taskBarPage.verifyJewelryOptionSelected();
        taskBarPage.selectGiftCardsFromTaskBar();
        taskBarPage.verifyGiftCardsOptionSelected();
    }
}
