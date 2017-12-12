package steps;

import cucumber.api.java.en.When;
import github.pageObject.SettingsPage;

public class SettingsPageSteps {
    private SettingsPage settingsPage = new SettingsPage();


    @When("^User click Settings sub page$")
    public void clickSettingsButton() throws Throwable {
        settingsPage.clickSettingsButton();
    }

    @When("^User click Delete repository button$")
    public void clickDeleteRepositoryButton() throws Throwable {
        settingsPage.clickDeleteRepositoryButton();
    }

    @When("^User write repository '(.*?)' to delete$")
    public void writeNameRepository(String nameOfRepository) throws Throwable {
        settingsPage.sendNameOfRepository(nameOfRepository);
    }
}
