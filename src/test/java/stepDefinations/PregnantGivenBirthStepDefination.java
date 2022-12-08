package stepDefinations;

import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageObjects.BasePage;
import pageObjects.CommonPage;
import pageObjects.PregnantGivenBirthPage;
import utilities.DriverFactory;


public class PregnantGivenBirthStepDefination extends BasePage {
    private WebDriver _driver = DriverFactory.getDriver();
    private PregnantGivenBirthPage pregnantGivenBirthPage = new PregnantGivenBirthPage(_driver);
    private CommonPage commonPage = new CommonPage(_driver);

    @When("User Select pregnant or have you given birth in the last 12 months {string} and click next")
    public void GPScot_Wales(String select) {
        pregnantGivenBirthPage.SelectPregnantGivenBirthYesNO(select);
        commonPage.clickNext();
    }
}
