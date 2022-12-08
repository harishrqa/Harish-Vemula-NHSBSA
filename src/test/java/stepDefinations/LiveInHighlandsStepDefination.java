package stepDefinations;

import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageObjects.BasePage;
import pageObjects.CommonPage;
import pageObjects.GPScotWalesPage;
import pageObjects.LiveInHighlandsPage;
import utilities.DriverFactory;

public class LiveInHighlandsStepDefination extends BasePage {
    private WebDriver _driver = DriverFactory.getDriver();
    private LiveInHighlandsPage liveInHighlandsPage = new LiveInHighlandsPage(_driver);
    private CommonPage commonPage = new CommonPage(_driver);

    @When("User Select live in Highland {string} and click next")
    public void Living_Highlands(String select) {
        liveInHighlandsPage.SelectLiveHighlandYesNO(select);
        commonPage.clickNext();
    }
}
