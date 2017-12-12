package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import github.pageObject.CodePage;
import github.webDriverSetup.DriverCreator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static org.junit.Assert.assertEquals;

public class CodePageSteps {
    private CodePage repositoryPage = new CodePage();
    private Actions actions = new Actions(DriverCreator.getWebDriver());


    @Given("^User select '(.*)?' to pull request$")
    public void selectBranch(String nameOfBranch) throws Throwable {
        repositoryPage.clickBranchButton();

        for (WebElement branch : repositoryPage.getListOfBranch()) {
            if (branch.getText().equals(nameOfBranch)) {
                actions.moveToElement(branch).click().perform();
            }
        }
    }

    @Given("^User create branch '(.*)?'$")
    public void createBranch(String nameOfBranch) throws Throwable {
        repositoryPage.clickBranchButton();
        repositoryPage.setNameOfBranch(nameOfBranch);
        repositoryPage.clickCreateBranchButton();
    }

    @Then("^User see created branch '(.*)?'$")
    public void assertCreatedBranch(String nameOfBranch) throws Throwable {
        assertEquals(repositoryPage.getBranchName(), nameOfBranch);
    }

    @When("^User click Create New File button$")
    public void clickNewFileButton() throws Throwable {
        repositoryPage.clickNewFileButton();
    }

    @When("^User set name '(.*)?' for new file$")
    public void writeNameForNewFile(String nameOfFile) throws Throwable {
        repositoryPage.setNameForNewFile(nameOfFile);
    }

    @When("^User click Commit new file button$")
    public void clickCommitNewFileButton() throws Throwable {
        repositoryPage.clickCommitNewFileButton();
    }

    @When("^User click New Pull Request button$")
    public void clickNewPullRequestButton() throws Throwable {
        repositoryPage.clickNewPullRequestButton();
    }

    @When("^User click on Create pull request button$")
    public void clickCreatePullRequestButton() throws Throwable {
        repositoryPage.clickCreatePullRequestButton();
    }
}
