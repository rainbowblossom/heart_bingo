package uk.co.heartbingo.cucumber.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import uk.co.heartbingo.pages.FramePage;
import uk.co.heartbingo.pages.LoginPage;

public class LoginStepdefs {
    @Given("^I am on homepage$")
    public void i_am_on_homepage() {

    }

    @When("^I click on \"([^\"]*)\" login link$")
    public void iClickOnLoginLink(String login) {
        new LoginPage().clickOnLoginButton(login);

    }

    @And("^I enter username \"([^\"]*)\" at username field$")
    public void iEnterUsernameAtUsernameField(String username) {
        new FramePage().enterUsername(username);
    }

    @And("^I enter password \"([^\"]*)\" at password field$")
    public void iEnterPasswordAtPasswordField(String password) throws InterruptedException {
        new FramePage().enterPassword(password);
    }

    @And("^I click on  login button$")
    public void iClickOnLoginButton() throws InterruptedException {
        new FramePage().clickOnLoginBttn();

    }
    @And("^I should see the errormessage$")
    public void iShouldSeeTheErrormessage()
    {
        String expectedMsg="The username or password you entered is incorrect. Please try again.";
        String ActualMsg= new FramePage().verifyTheErrorMessage();
        Assert.assertEquals("Error Message not displayed ",expectedMsg,ActualMsg);

    }
    @Then("^I close login frame$")
    public void iCloseLoginFrame() {
        new FramePage().closeWindow();
    }

}
