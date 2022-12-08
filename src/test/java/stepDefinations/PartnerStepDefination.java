package stepDefinations;

import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageObjects.BasePage;
import pageObjects.CommonPage;
import pageObjects.PartnerPage;
import utilities.DriverFactory;


public class PartnerStepDefination extends BasePage {
    private WebDriver _driver = DriverFactory.getDriver();
    private PartnerPage partnerPage = new PartnerPage(_driver);
    private CommonPage commonPage = new CommonPage(_driver);

    @When("User Select live with partner {string} and click next")
    public void GPScot_Wales(String select) {
        partnerPage.SelectPartnerYesNO(select);
        commonPage.clickNext();
    }
}
