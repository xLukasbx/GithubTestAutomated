package steps;

import cucumber.api.java.en.When;
import github.pageObject.CreateNewRepositoryPage;

public class CreateNewRepositoryPageSteps {
    private CreateNewRepositoryPage createNewRepositoryPage = new CreateNewRepositoryPage();


    @When("^User set name '(.*)?' for repository$")
    public void setNameForRepository(String nameRepository) throws Throwable {
        createNewRepositoryPage.sendValueToRepositoryNameField(nameRepository);
    }

    @When("^User mark Initial repository with file README$")
    public void markInitialReadmeFile() throws Throwable {
        createNewRepositoryPage.clickMarkReadmeFile();
    }

    @When("^User click Create repository button$")
    public void clickCreateRepositoryButton() throws Throwable {
        createNewRepositoryPage.clickCreateRepositoryButton();
    }

}
