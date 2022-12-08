package stepDefinations;

import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageObjects.BasePage;
import pageObjects.CommonPage;
import pageObjects.GPScotWalesPage;
import utilities.DriverFactory;


public class GPScotWalesStepDefination extends BasePage {
    private WebDriver _driver = DriverFactory.getDriver();
    private GPScotWalesPage gpScotWalesPage = new GPScotWalesPage(_driver);
    private CommonPage commonPage = new CommonPage(_driver);

    @When("User Select GP Scotland or wales {string} and click next")
    public void GPScot_Wales(String select) {
        gpScotWalesPage.SelectGPYesNO(select);
        commonPage.clickNext();
    }
}
