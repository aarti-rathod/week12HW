package uk.co.cineworld.testsuit;

import org.testng.annotations.Test;
import uk.co.cineworld.pages.LoginPage;
import uk.co.cineworld.testbase.TestBase;

public class LoginTest extends TestBase {
    LoginPage loginPage = new LoginPage();
/*
Test Case
 */
    @Test
    public void userShouldAbleToLoginSuccessfullyWithValidCredentials() {
        loginPage.clickOnLogin();
        loginPage.enterEmail();
        loginPage.enterPassword();
        loginPage.clickOnContinue();
    }
}
