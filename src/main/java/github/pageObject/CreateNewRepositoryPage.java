package github.pageObject;

import github.webDriverSetup.DriverCreator;
import github.webElementCreation.CreateWebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CreateNewRepositoryPage extends AbstractPage{
    private static final By REPOSITORY_NAME = new By.ByCssSelector(".form-control.js-repo-name.short.with-permission-fields");
    private static final By README_FILE = new By.ById("repository_auto_init");
    private static final By CREATE_REPOSITORY_BUTTON = new By.ByCssSelector(".btn.btn-primary.first-in-line");


    public void sendValueToRepositoryNameField(String repostioryName) {
        WebElement element = new CreateWebElement(REPOSITORY_NAME, DriverCreator.getWebDriver(), 5).getWebElement();
        element.clear();
        element.sendKeys(repostioryName);
    }

    public void clickMarkReadmeFile() {
        WebElement element = new CreateWebElement(README_FILE, DriverCreator.getWebDriver(), 5).getWebElement();
        element.click();
    }

    public void clickCreateRepositoryButton() {
        WebElement element = new CreateWebElement(CREATE_REPOSITORY_BUTTON, DriverCreator.getWebDriver(), 5).getWebElement();
        element.click();
    }
}
