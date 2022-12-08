package stepDefinations;

import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageObjects.BasePage;
import pageObjects.CommonPage;
import pageObjects.PaidUniversalCreditPage;
import utilities.DriverFactory;


public class PaidUniversalCreditStepDefination extends BasePage {
    private WebDriver _driver = DriverFactory.getDriver();
    private PaidUniversalCreditPage paidUniversalCreditPage = new PaidUniversalCreditPage(_driver);
    private CommonPage commonPage = new CommonPage(_driver);

    @When("User Select get paid Universal Credit {string} and click next")
    public void select_Country(String Benefit) {
        paidUniversalCreditPage.SelectUniversalCredit(Benefit);
        commonPage.clickNext();
    }
}
