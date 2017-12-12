package github.pageObject;

import github.webDriverSetup.DriverCreator;
import github.webElementCreation.CreateWebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SignInPage extends AbstractPage {
    private static final By EMAIL_FIELD = new By.ById("login_field");
    private static final By PASSWORD_FIELD = new By.ById("password");
    private static final By SIGN_IN_BUTTON = new By.ByCssSelector(".btn.btn-primary.btn-block");


    public void sendValueToEmailField(String email) {
        WebElement element = new CreateWebElement(EMAIL_FIELD, DriverCreator.getWebDriver(), 5).getWebElement();
        element.clear();
        element.sendKeys(email);
    }

    public void sendValueToPasswordField(String password) {
        WebElement element = new CreateWebElement(PASSWORD_FIELD, DriverCreator.getWebDriver(), 5).getWebElement();
        element.clear();
        element.sendKeys(password);
    }

    public void clickSignInButton() {
        WebElement element = new CreateWebElement(SIGN_IN_BUTTON, DriverCreator.getWebDriver(), 5).getWebElement();
        element.click();
    }
}
