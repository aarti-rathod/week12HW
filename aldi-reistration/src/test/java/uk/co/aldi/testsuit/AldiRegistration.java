package uk.co.aldi.testsuit;

import org.testng.annotations.Test;
import uk.co.aldi.pages.RegistrationPage;
import uk.co.aldi.testbase.TestBase;

/*
Test Case To Be Execute
 */
public class AldiRegistration extends TestBase {
    RegistrationPage registrationPage = new RegistrationPage();

    @Test
    public void userShouldAbleToRegisterSuccessfullyWithValidCredentials() {

        registrationPage.clickOnLogin();
        registrationPage.clickOnTgt();
        registrationPage.selectFrom();
        registrationPage.firstName();
        registrationPage.lastName();
        registrationPage.email();
        registrationPage.confirmEmail();
        registrationPage.passWord();
        registrationPage.confirmPassword();
        registrationPage.clickOnSubmitBtn();
    }
}
