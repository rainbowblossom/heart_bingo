package uk.co.heartbingo.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.co.heartbingo.utility.Utility;

public class FramePage extends Utility {
    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    public FramePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//iframe[@class='oneauth-iframe']")
    WebElement iFrame;

    @CacheLookup
    @FindBy(id = "username")
    WebElement userName;

    @CacheLookup
    @FindBy(id = "password")
    WebElement PassWord;

    @CacheLookup
    @FindBy(name = "login_submit")
    WebElement loginButton;

    @CacheLookup
    @FindBy(className = "login_errorMessageWrapper__2ZcGx")
    WebElement errormsg;

    @CacheLookup
    @FindBy(xpath = "//span[contains(@class,'bvs-icon is-big')]")
    WebElement closeWindow;

    public void enterUsername(String email) {
        switchToIframe(iFrame);
        sendTextToElement(userName, email);
    }

    public void enterPassword(String password) throws InterruptedException {
        Thread.sleep(3000);
        sendTextToElement(PassWord, password);
    }
    public void clickOnLoginBttn() throws InterruptedException {
        Thread.sleep(3000);
        javaExecutorScriptExecuteScriptToClick(loginButton);
    }
    public String verifyTheErrorMessage(){

            return errormsg.getText();
    }
    public void closeWindow() {
        driver.switchTo().defaultContent(); // switch back to default content from iframe
        javaExecutorScriptExecuteScriptToClick(closeWindow);
        // clickOnElement(closeWindow);
    }

}
