package github.webElementCreation;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class CreateWebElement {
    private By by;
    private WebDriver driver;
    private int timeout;

    public CreateWebElement(By by, WebDriver driver, int timeout) {
        this.by = by;
        this.driver = driver;
        this.timeout = timeout;
    }

    public WebElement getWebElement() {
        try {
            WebDriverWait wait = new WebDriverWait(driver, timeout);
            wait.until(ExpectedConditions.elementToBeClickable(by));
        } catch (TimeoutException e) {
            System.out.println(e.getMessage());
        }
        return driver.findElement(by);
    }

    public WebElement getDynamicWebElement() {
        try {
            WebDriverWait wait = new WebDriverWait(driver, timeout);
            wait.until(ExpectedConditions.presenceOfElementLocated(by));
        } catch (TimeoutException e) {
            System.out.println(e.getMessage());
        }
        return driver.findElement(by);
    }

    public List<WebElement> getWebElements() {
        try {
            WebDriverWait wait = new WebDriverWait(driver, timeout);
            wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(by));
        } catch (TimeoutException e) {
            System.out.println(e.getMessage());
        }
        return driver.findElements(by);
    }

}
