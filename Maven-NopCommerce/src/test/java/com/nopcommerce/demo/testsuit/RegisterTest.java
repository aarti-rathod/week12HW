package com.nopcommerce.demo.testsuit;

import com.nopcommerce.demo.testbase.TestBase;
import com.nopcommrece.demo.page.HomePage;
import com.nopcommrece.demo.page.RegisterPage;
import org.testng.annotations.Test;
/*
Registration Testcase
 */
public class RegisterTest extends TestBase {

    RegisterPage registerPage = new RegisterPage();

    @Test
    public void userShouldAbleToRegisterSuccessfully() {

        registerPage.navigateToRegisterPage();
        registerPage.enterFirstName();
        registerPage.enterLastName();
        registerPage.enterEmail();
        registerPage.enterPassword();
        registerPage.enterConfirmPassword();
        registerPage.enterRegisterBtn();
        registerPage.veryfyUserRegisteredSuccessfully();

    }
}
