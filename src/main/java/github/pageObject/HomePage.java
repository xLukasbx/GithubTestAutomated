package github.pageObject;

import github.webDriverSetup.DriverCreator;
import github.webElementCreation.CreateWebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage extends AbstractPage {
    private static final By SIGN_IN = new By.ByCssSelector(".text-bold.text-white.no-underline");
    private static final By TITLE_PAGE = new By.ByCssSelector(".alt-h0.text-white.lh-condensed-ultra.mb-3");


    public void clickOnSignIn() {
        WebElement element = new CreateWebElement(SIGN_IN, DriverCreator.getWebDriver(), 5).getWebElement();
        element.click();
    }

    public String getTitle() {
        WebElement element = new CreateWebElement(TITLE_PAGE, DriverCreator.getWebDriver(), 5).getWebElement();
        return element.getText();
    }
}
