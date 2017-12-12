package steps;

import cucumber.api.java.en.When;
import github.pageObject.SignInPage;

public class SignInSteps {
    private SignInPage signInPage = new SignInPage();


    @When("^User write '(.*?)' to email field$")
    public void writeEmail(String email) throws Throwable {
        signInPage.sendValueToEmailField(email);
    }

    @When("^User write '(.*?)' to password field$")
    public void writePassword(String password) throws Throwable {
        signInPage.sendValueToPasswordField(password);
    }

    @When("^User click sign in button$")
    public void clickSignInButton() throws Throwable {
        signInPage.clickSignInButton();
    }
}
