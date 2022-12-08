package stepDefinations;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;




import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utilities.DriverFactory;
import utilities.TestPropertyUtilities;

public class CucumberHooks {

    private DriverFactory driverFactory;
    private WebDriver _driver;
    private TestPropertyUtilities testPropertyUtilities;

    @Before
    public void initializeTest() throws Exception {
        testPropertyUtilities = new TestPropertyUtilities();
        String browser = testPropertyUtilities.getStringProperty("BROWSER");
        String browserMode = testPropertyUtilities.getStringProperty("BROWSER_MODE");

        driverFactory = new DriverFactory();
        _driver = driverFactory.initDriver(browser, browserMode);

    }

    @After(order = 1)
    public void takeScreenshot(Scenario scenario) {
        if (scenario.isFailed()) {
            String screenShotName = scenario.getName().replaceAll(" ", "_");
            byte [] sourcePath = ((TakesScreenshot)_driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(sourcePath, "image/png", screenShotName);
        }
    }

    @After(order = 0)
    public void tearDown() {
        _driver.quit();
    }
}
