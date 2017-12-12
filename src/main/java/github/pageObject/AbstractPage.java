package github.pageObject;

import github.webDriverSetup.DriverCreator;
import org.openqa.selenium.remote.RemoteWebDriver;

public abstract class AbstractPage {
    private static RemoteWebDriver remoteWebDriver;

    AbstractPage() {
        remoteWebDriver = DriverCreator.getWebDriver();
    }

    public void getPage(String nameOfPage) {
        remoteWebDriver.get(nameOfPage);
    }

}
