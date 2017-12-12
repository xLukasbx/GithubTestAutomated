package github.webDriverSetup;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class DriverCreator {
    private static final String URL = "http://localhost:4444/wd/hub";
    private static RemoteWebDriver remoteWebDriver;

    public static void runWebDriver() throws MalformedURLException {
        remoteWebDriver = new RemoteWebDriver(new URL(URL), new ChromeOptions());
        remoteWebDriver.manage().window().maximize();
    }

    public static void closeWebBrowser() {
        remoteWebDriver.close();
    }

    public static void clearAllCookies() {
        remoteWebDriver.manage().deleteAllCookies();
    }

    public static RemoteWebDriver getWebDriver() {
        return remoteWebDriver;
    }
}
