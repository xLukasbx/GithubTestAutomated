package github.pageObject;

import github.webDriverSetup.DriverCreator;
import github.webElementCreation.CreateWebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class UserPage extends AbstractPage {
    private static final By TITTLE_ACCOUNT_PATE = new By.ByCssSelector(".shelf-title");
    private static final By START_PROJECT_BUTTON = new By.ByCssSelector(".btn.shelf-cta.ml-3");
    private static final By LIST_OF_REPOSITORY = new By.ByCssSelector(".repo-and-owner.css-truncate-target");
    private static final By SUCCESSFUL_STATUS_DELETE_REPOSITORY = new By.ByCssSelector(".flash.flash-full.flash-notice");


    public String getAccountTitle() {
        WebElement element = new CreateWebElement(TITTLE_ACCOUNT_PATE, DriverCreator.getWebDriver(), 5).getWebElement();
        return element.getText();
    }

    public void clickStartProjectButton() {
        WebElement element = new CreateWebElement(START_PROJECT_BUTTON, DriverCreator.getWebDriver(), 5).getWebElement();
        element.click();
    }

    public List<WebElement> getListOfRepository() {
        List<WebElement> elements = new CreateWebElement(LIST_OF_REPOSITORY, DriverCreator.getWebDriver(), 5).getWebElements();
        return elements;
    }

    public String getSuccessfulStatusDeleteRepository() {
        WebElement element = new CreateWebElement(SUCCESSFUL_STATUS_DELETE_REPOSITORY,
                                                    DriverCreator.getWebDriver(), 20).getWebElement();
        return element.getText();
    }
}
