package steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import github.webDriverSetup.DriverCreator;

import java.net.MalformedURLException;

public class BeforeAndAfterScenario {
    @Before
    public static void beforeScenario() throws MalformedURLException {
        DriverCreator.runWebDriver();
    }

    @After
    public static void afterScenario(){
        DriverCreator.clearAllCookies();
        DriverCreator.closeWebBrowser();
    }
}
