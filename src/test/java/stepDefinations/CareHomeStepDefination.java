package stepDefinations;

import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageObjects.BasePage;
import pageObjects.CareHomePage;
import pageObjects.CommonPage;
import utilities.DriverFactory;


public class CareHomeStepDefination extends BasePage {

    private WebDriver _driver = DriverFactory.getDriver();
    private CareHomePage careHomePage = new CareHomePage(_driver);
    private CommonPage commonPage = new CommonPage(_driver);

    @When("User Select live permanently in a care home {string} and click next")
    public void GPScot_Wales(String select) {
        careHomePage.SelectCareHomeYesNO(select);
        commonPage.clickNext();
    }
}
