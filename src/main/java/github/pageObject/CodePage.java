package github.pageObject;

import github.webDriverSetup.DriverCreator;
import github.webElementCreation.CreateWebElement;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

import java.util.List;



public class CodePage extends AbstractPage {
    private static final By BRANCH_BUTTON = new By.ByCssSelector(".btn.btn-sm.select-menu-button.js-menu-target.css-truncate");
    private static final By NEW_PULL_REQUEST_BUTTON = new By.ByCssSelector(".btn.btn-sm.new-pull-request-btn");
    private static final By NAME_BRANCH_FIELD = new By.ByCssSelector("input.form-control.js-filterable-field.js-navigation-enable");
    private static final By GET_BRANCH_NAME = new By.ByCssSelector(".js-select-button.css-truncate-target");
    private static final By GET_LIST_OF_BRANCH = new By.ByCssSelector(".select-menu-item.js-navigation-item.js-navigation-open");
    private static final By CREATE_BRANCH_BUTTON = new By.ByCssSelector(".js-create-branch.select-menu-item.select-menu-new-item-form.js-navigation-item.js-new-item-form.last-visible.navigation-focus");
    private static final By CREATE_NEW_FILE_BUTTON = new By.ByCssSelector(".btn.btn-sm.BtnGroup-item");
    private static final By FILENAME_FIELD = new By.ByName("filename");
    private static final By SUBMIT_FILE_BUTTON = new By.ById("submit-file");
    private static final By CREATE_PULL_REQUEST_BUTTON = new By.ByCssSelector("#new_pull_request > div.discussion-timeline > div > div > div.form-actions > button");
    private Actions actions;


    public CodePage() {
        this.actions = new Actions(DriverCreator.getWebDriver());
    }

    public void clickBranchButton() {
        WebElement element = new CreateWebElement(BRANCH_BUTTON, DriverCreator.getWebDriver(), 5).getWebElement();
        element.click();
    }

    public void clickNewPullRequestButton() {
        WebElement element = new CreateWebElement(NEW_PULL_REQUEST_BUTTON, DriverCreator.getWebDriver(), 5).getWebElement();
        element.click();
    }

    public void setNameOfBranch(String nameOfBranch) {
        WebElement element = new CreateWebElement(NAME_BRANCH_FIELD, DriverCreator.getWebDriver(), 5).getDynamicWebElement();
        actions.moveToElement(element).sendKeys(nameOfBranch).perform();
    }

    public List<WebElement> getListOfBranch() {
        List<WebElement> elements = new CreateWebElement(GET_LIST_OF_BRANCH, DriverCreator.getWebDriver(), 5).getWebElements();
        return elements;
    }

    public void clickCreateBranchButton() {
        WebElement element = new CreateWebElement(CREATE_BRANCH_BUTTON, DriverCreator.getWebDriver(), 5).getDynamicWebElement();
        actions.moveToElement(element).click().perform();
    }

    public String getBranchName() {
        WebElement element = new CreateWebElement(GET_BRANCH_NAME, DriverCreator.getWebDriver(), 5).getWebElement();
        return element.getText();
    }

    public void clickNewFileButton() {
        WebElement element = new CreateWebElement(CREATE_NEW_FILE_BUTTON, DriverCreator.getWebDriver(), 5).getWebElement();
        element.click();
    }

    public void setNameForNewFile(String nameForFile) {
        WebElement element = new CreateWebElement(FILENAME_FIELD, DriverCreator.getWebDriver(), 5).getWebElement();
        element.sendKeys(nameForFile);
    }

    public void clickCommitNewFileButton() {
        WebElement element = new CreateWebElement(SUBMIT_FILE_BUTTON, DriverCreator.getWebDriver(), 5).getWebElement();
        element.click();
    }

    public void clickCreatePullRequestButton() {
        WebElement element = new CreateWebElement(CREATE_PULL_REQUEST_BUTTON, DriverCreator.getWebDriver(), 5).getDynamicWebElement();
        actions.moveToElement(element).click().perform();
    }
}
