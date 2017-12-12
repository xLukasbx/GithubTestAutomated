package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import github.pageObject.HomePage;

import static org.junit.Assert.assertEquals;

public class HomePageSteps {
    private HomePage homePage = new HomePage();


    @Given("^User run '(.*?)' page$")
    public void userRunGithubPage(String nameOfPage) throws Throwable {
        homePage.getPage(nameOfPage);
    }

    @Then("^User see '(.*?)' on home page$")
    public void assertHomePage(String homePageName) throws Throwable {
        assertEquals(homePageName, homePage.getTitle());
    }

    @Given("^User click sign in on home page$")
    public void clickSignIn() throws Throwable {
        homePage.clickOnSignIn();
    }
}
