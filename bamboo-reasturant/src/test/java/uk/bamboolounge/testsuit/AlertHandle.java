package uk.bamboolounge.testsuit;

import org.testng.annotations.Test;
import uk.bamboolounge.pages.HomePage;
import uk.bamboolounge.testbase.TestBase;

/*
Test Case
 */
public class AlertHandle extends TestBase {
    HomePage homePage = new HomePage();

    @Test
    public void userShouldAbleToObserveAlertMessage() {
        homePage.enterName();
        homePage.enterEmail();
        homePage.clickOnSubscribeNow();
        homePage.verifyAlertTextMessage();
    }
}
