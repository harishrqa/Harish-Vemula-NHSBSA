package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.DriverFactory;

import java.time.Duration;

public class BasePage {

    private WebDriver _driver = DriverFactory.getDriver();
    private static Wait<WebDriver> wait;
    private static final long DEFAULT_WAIT_TIMEOUT_SECS = 10;
    private static final long DEFAULT_SLEEP_TIMEOUT_MILLIS = 250;

    public BasePage() {
        wait = new WebDriverWait(_driver, Duration.ofSeconds(DEFAULT_WAIT_TIMEOUT_SECS), Duration.ofMillis(DEFAULT_SLEEP_TIMEOUT_MILLIS));
        PageFactory.initElements(_driver, this);
    }

    public static void waitForElementVisibility(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static void waitForElementToBeClickable(WebElement element, int waitTimeInSecs) {
        BasePage basePage = new BasePage();
        Wait<WebDriver> wait_local;
        wait_local = new WebDriverWait(basePage._driver, Duration.ofSeconds(waitTimeInSecs), Duration.ofMillis(DEFAULT_SLEEP_TIMEOUT_MILLIS));
        wait_local.until(ExpectedConditions.elementToBeClickable(element));
    }

    /**
     *
     * @param element
     */
    public static void clickOnButton(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }

}
