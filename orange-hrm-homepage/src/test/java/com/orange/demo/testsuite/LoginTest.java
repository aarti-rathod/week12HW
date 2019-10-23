package com.orange.demo.testsuite;

import com.orange.demo.pages.HomePage;
import com.orange.demo.testbase.TestBase;
import org.testng.annotations.Test;

/**
 * Login Test
 */
public class LoginTest extends TestBase {
    HomePage homePage = new HomePage();

    @Test
    public void userShouldAbleToLoginSuccessfully() {

        homePage.enterUserName();
        homePage.enterPassWord();
        homePage.clickOnLogin();
        homePage.verifyUserLoggedInSuccessfully();
    }
}
