package github.pageObject;

import github.webDriverSetup.DriverCreator;
import github.webElementCreation.CreateWebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class PullRequestsPage extends AbstractPage{
    private static final By PULL_REQUEST_SUB_PAGE = new By.ByCssSelector(".octicon.octicon-git-pull-request");
    private static final By MERGE_PULL_REQUEST_BUTTON = new By.ByCssSelector(".btn.btn-primary.BtnGroup-item.js-details-target");
    private static final By CONFIRM_MERGE_BUTTON = new By.ByCssSelector(".btn.btn-primary.BtnGroup-item.js-merge-commit-button");
    private static final By SUCCESSFUL_STATUS_AFTER_MERGE = new By.ByCssSelector(".merge-branch-heading");
    private static final By ACTIVE_PULL_REQUEST = new By.ByCssSelector(".link-gray-dark.no-underline.h4.js-navigation-open");


    public void clickPullRequestSubPage() {
        WebElement element = new CreateWebElement(PULL_REQUEST_SUB_PAGE, DriverCreator.getWebDriver(), 5).getWebElement();
        element.click();
    }

    public void clickMergePullRequestButton() {
        WebElement element = new CreateWebElement(MERGE_PULL_REQUEST_BUTTON, DriverCreator.getWebDriver(), 5).getWebElement();
        element.click();
    }

    public void clickConfirmMergeButton() {
        WebElement element = new CreateWebElement(CONFIRM_MERGE_BUTTON, DriverCreator.getWebDriver(), 5).getWebElement();
        element.click();
    }

    public String getSuccessfulStatusMergedPullRequest() {
        WebElement element = new CreateWebElement(SUCCESSFUL_STATUS_AFTER_MERGE, DriverCreator.getWebDriver(), 5).getWebElement();
        return element.getText();
    }

    public List<WebElement> getListActivePullRequest() {
        List<WebElement> elements = new CreateWebElement(ACTIVE_PULL_REQUEST, DriverCreator.getWebDriver(), 5).getWebElements();
        return elements;
    }
}
