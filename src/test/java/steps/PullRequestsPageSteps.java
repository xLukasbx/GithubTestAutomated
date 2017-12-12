package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import github.pageObject.PullRequestsPage;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertEquals;

public class PullRequestsPageSteps {
    private PullRequestsPage pullRequestsPage = new PullRequestsPage();

    @Given("^User click Pull request sub page$")
    public void clickPullRequestSubPage() throws Throwable {
        pullRequestsPage.clickPullRequestSubPage();
    }

    @Given("^User click '(.*)?' pull request$")
    public void clickPullRequest(String nameOfPullRequest) throws Throwable {
        for (WebElement pullRequest : pullRequestsPage.getListActivePullRequest()) {
            if (pullRequest.getText().equals(nameOfPullRequest)) {
                pullRequest.click();
            }
        }
    }

    @When("^User click Merge pull request button$")
    public void clickMergePullRequest() throws Throwable {
        pullRequestsPage.clickMergePullRequestButton();
    }

    @When("^User click Confirm merge button$")
    public void clickConfirmMerge() throws Throwable {
        pullRequestsPage.clickConfirmMergeButton();
    }

    @Then("^User see status '(.*)?'$")
    public void assertStatusAfterMergePullRequest(String nameOfStatus) throws Throwable {
        assertEquals(pullRequestsPage.getSuccessfulStatusMergedPullRequest(), nameOfStatus);
    }
}
