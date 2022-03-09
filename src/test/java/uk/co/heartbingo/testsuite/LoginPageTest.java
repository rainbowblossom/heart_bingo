package uk.co.heartbingo.testsuite;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import uk.co.heartbingo.pages.LoginPage;

public class LoginPageTest {

    LoginPage loginPage;

    @BeforeMethod
    public void inIt() {
        loginPage = new LoginPage();
    }

    @Test(priority = 1, groups = {"smoke", "regression"})
    public void verifyUserShouldNotLogInWithInvalidCredentials(String login) {
        loginPage.clickOnLoginButton(login);



    }
}