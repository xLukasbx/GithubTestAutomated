package github.pageObject;

import github.webDriverSetup.DriverCreator;
import github.webElementCreation.CreateWebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SettingsPage extends AbstractPage {
    private static final By SETTINGS_SUB_PAGE = new By.ByCssSelector(".octicon.octicon-gear");
    private static final By DELETE_REPOSITORY_BUTTON =
            new By.ByCssSelector("#options_bucket > div.Box.Box--danger > ul > li:nth-child(4) > button");
    private static final By NAME_REPOSITORY_FIELD = new By.ByCssSelector(".form-control.input-block");
    private Actions actions;

    public SettingsPage() {
        actions = new Actions(DriverCreator.getWebDriver());
    }
    public void clickSettingsButton() {
        WebElement element = new CreateWebElement(SETTINGS_SUB_PAGE, DriverCreator.getWebDriver(), 5).getWebElement();
        element.click();
    }

    public void clickDeleteRepositoryButton() {
        WebElement element = new CreateWebElement(DELETE_REPOSITORY_BUTTON, DriverCreator.getWebDriver(), 5).getWebElement();
        element.click();
    }

    public void sendNameOfRepository(String nameOfRepository) {
        WebElement element = new CreateWebElement(NAME_REPOSITORY_FIELD, DriverCreator.getWebDriver(), 5).getDynamicWebElement();
        actions.moveToElement(element).sendKeys(nameOfRepository, Keys.ENTER).perform();
    }
}
