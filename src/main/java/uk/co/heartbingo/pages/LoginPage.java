package uk.co.heartbingo.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.co.heartbingo.utility.Utility;

import java.util.List;

public class LoginPage extends Utility {
    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//div[@class='site-header__user-details']//a")
    List<WebElement>loginLink ;

  public void clickOnLoginButton(String logIn)
  {
      for (WebElement login : loginLink)
      {
          if (login.getText().equalsIgnoreCase(logIn))
          {
              System.out.println(login);
              javaExecutorScriptExecuteScriptToClick(login);
              break;
          }
      }
      log.info("Clicking on login link : " + loginLink.toString());

  }
}






