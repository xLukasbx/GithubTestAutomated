package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import github.pageObject.UserPage;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class UserPageSteps {
    private UserPage userPage = new UserPage();


    @Then("^User see '(.*)?' on user page after sign in$")
    public void assertPageAccount(String titleAccountPage) throws Throwable {
        assertEquals(titleAccountPage, userPage.getAccountTitle());
    }

    @When("^User click start project button$")
    public void clickStartProjectButton() throws Throwable {
        userPage.clickStartProjectButton();
    }

    @Then("^User see created repository '(.*?)'$")
    public void assertCreatedRepository(String nameOfRepository) throws Throwable {
        userPage.getPage("https://github.com/");
        List<WebElement> listOfRepository = userPage.getListOfRepository();
        for (WebElement repository : listOfRepository) {
            if (repository.getText().equals(nameOfRepository)) {
                assertEquals(repository.getText(), nameOfRepository);
            }
        }
    }

    @Given("^User click '(.*?)' repository$")
    public void clickRepository(String nameOfRepository) throws Throwable {
        List<WebElement> listOfRepository = userPage.getListOfRepository();
        for (WebElement repository : listOfRepository) {
            if (repository.getText().equals(nameOfRepository)) {
                repository.click();
            }
        }
    }

    @Then("^User see '(.*?)' on user page after delete repository$")
    public void assertSuccessfulMessage(String successfulMessage) throws Throwable {
        assertEquals(userPage.getSuccessfulStatusDeleteRepository(), successfulMessage);
    }
}
